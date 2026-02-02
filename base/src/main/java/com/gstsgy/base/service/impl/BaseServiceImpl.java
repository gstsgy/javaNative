package com.gstsgy.base.service.impl;

import java.util.List;
import com.gstsgy.base.bean.dto.PageQueryVO;
import com.gstsgy.base.bean.entity.BaseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import com.gstsgy.base.service.BaseService;

public abstract  class BaseServiceImpl<T extends BaseEntity,M extends JpaRepository<T, Long>> implements BaseService<T>{

    @Autowired
    protected M repository;
    @Override
    public T saveOne(T obj) {
        repository.save(obj);
        return obj;
    }

    @Transactional
    @Override
    public List<T> batchSave(List<T> objs) {
        return objs.stream().map(this::saveOne).toList();
    }

    @Override
    public void deleteById(Long id) {
         repository.deleteById(id);
    }

    @Override
    public void deleteByIds(List<Long> ids) {
         repository.deleteAllById(ids);
    }

    @Override
    public T queryOneById(Long id) {
        return repository.findById(id).orElse( null);
    }

    @Override
    public List<T> query(T obj) {
        ExampleMatcher matcher = ExampleMatcher.matching()
                // 忽略所有 null 字段
                .withIgnoreNullValues()
                // 只要字段是字符串，就执行包含查询（like %value%）
                // 如果不加这行，字符串默认也是 eq
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING)
                // 忽略大小写
                .withIgnoreCase();

        // 创建 Example 实例
        Example<T> example = Example.of(obj, matcher);

        // 执行查询
        return repository.findAll(example);
    }

    @Override
    public Page<T> query(T obj, PageQueryVO pageQuery) {
        // 1. 定义匹配规则 (Matcher)
        ExampleMatcher matcher = ExampleMatcher.matching()
                .withIgnoreCase() // 忽略大小写
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING) // 字符串模糊匹配
                .withIgnoreNullValues(); // 忽略 null 字段

        // 2. 创建 Example (Probe + Matcher)
        Example<T> example = Example.of(obj, matcher);

        // 3. 创建分页请求 (Pageable)
        Pageable pageable = PageRequest.of(pageQuery.getPageNum(), pageQuery.getPageSize(), Sort.by("insert_ymd").descending());

        // 4. 执行分页查询
        // JpaRepository 自动支持：Page<T> findAll(Example<S> example, Pageable pageable)
        return repository.findAll(example, pageable);
    }

    @Override
    public boolean updateById(T obj) {
        repository.save(obj);
        return true;
    }
}
