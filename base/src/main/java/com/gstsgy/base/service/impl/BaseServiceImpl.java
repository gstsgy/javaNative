package com.gstsgy.base.service.impl;

import java.awt.print.Book;
import java.util.List;

import com.gstsgy.base.bean.dto.PageQueryVO;
import com.gstsgy.base.bean.entity.BaseEntity;
import org.babyfish.jimmer.Page;
import org.babyfish.jimmer.Specification;
import org.babyfish.jimmer.meta.ImmutableProp;
import org.babyfish.jimmer.meta.ImmutableType;
import org.babyfish.jimmer.meta.TargetLevel;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.spring.repository.JRepository;
import org.babyfish.jimmer.sql.ast.mutation.DeleteMode;
import org.babyfish.jimmer.sql.ast.mutation.SaveMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.beans.BeanMap;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import com.gstsgy.base.service.BaseService;

public abstract  class BaseServiceImpl<T extends BaseEntity,M extends JRepository<T, Long>> implements BaseService<T>{

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
        return objs.stream().map(it->this.saveOne(it)).toList();
    }

    @Override
    public boolean deleteById(Long id) {
        return repository.deleteById(id, DeleteMode.LOGICAL)>0;
    }

    @Override
    public boolean deleteByIds(List<Long> ids) {
        return repository.deleteByIds(ids, DeleteMode.LOGICAL)>0;
    }

    @Override
    public T queryOneById(Long id) {
        return repository.findById(id).orElse( null);
    }

    @Override
    public List<T> query(T obj) {
        Specification<T> spec = (it, query) -> {
            // 将对象转为 SPI 接口以便访问底层数据
            ImmutableSpi spi = (ImmutableSpi) obj;
            ImmutableType type = spi.__type();

            // 遍历该实体的所有属性
            for (ImmutableProp prop : type.getProps().values()) {
                // 只处理普通字段（标量字段），跳过关联集合等
                if (prop.isScalar(TargetLevel.ENTITY) && spi.__isLoaded(prop.getId())) {
                    Object value = spi.__get(prop.getId());

                    if (value != null) {
                        if (value instanceof String && !((String) value).isEmpty()) {
                            // 字符串默认模糊查询
                            //it.where(it.get(prop.getName()).like((String) value));
                        } else {
                            // 其他类型（Long, Integer等）精确查询
                           // it.where(it.get(prop.getName()).eq(value));
                        }
                    }
                }
            }
        };
//
//
//        // 2. 调用 JRepository
//        return repository.findAll(spec);
        return null;
    }

    @Override
    public Page<T> query(T obj, PageQueryVO pageQuery) {
//        Page<T> page = new Page<>(pageQuery.getPageNum(),pageQuery.getPageSize());
//        QueryWrapper<T> queryWrapper = buildQueryWrapper(obj);
//        if(StringUtils.hasText(pageQuery.getOrderBy())){
//            if(pageQuery.isAsc()){
//                page.addOrder(OrderItem.asc(pageQuery.getOrderBy()));
//            }else{
//                page.addOrder(OrderItem.desc(pageQuery.getOrderBy()));
//            }
//        }
//        return mapper.selectPage(page,queryWrapper);
        return null;
    }

    @Override
    public boolean updateById(T obj) {
        return repository.save(obj, SaveMode.UPDATE_ONLY)!=null;
    }
//    private  QueryWrapper<T> buildQueryWrapper(T item){
//        TableInfo tableInfo = TableInfoHelper.getTableInfo(item.getClass());
//        List<TableFieldInfo> fieldInfos = tableInfo.getFieldList();
//        BeanMap beanMap = BeanMap.create(item);
//        QueryWrapper<T> queryWrapper = new QueryWrapper<>();
//
//        fieldInfos.forEach(it->{
//            Object value = beanMap.get(it.getProperty());
//            if(value!=null){
//                if(value instanceof String){
//                    queryWrapper.like(it.getColumn(), value);
//                }else{
//                    queryWrapper.eq(it.getColumn(), value);
//                }
//            }
//        });
//        return queryWrapper;
//    }
}
