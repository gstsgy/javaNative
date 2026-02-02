package com.gstsgy.base.controller;

import java.util.List;

import com.gstsgy.base.bean.dto.PageQueryVO;
import com.gstsgy.base.bean.dto.ResponseBean;
import com.gstsgy.base.bean.entity.BaseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.gstsgy.base.service.BaseService;

public abstract class BaseController<S extends BaseService<T >, T extends BaseEntity> {

    @Autowired
    protected S service;

    @PostMapping("item")
    public ResponseBean saveOne(@RequestBody T obj) {
        return ResponseBean.getSuccess(service.saveOne(obj));
    }

    @PostMapping("batch")
    public ResponseBean saveBatch(@RequestBody List<T> objs) {
        return ResponseBean.getSuccess(service.batchSave(objs));
    }


    @PutMapping("item")
    public ResponseBean updateById(@RequestBody T obj) {
        return ResponseBean.getSuccess(service.updateById(obj));
    }

    @GetMapping("item")
    public ResponseBean queryOneById(Long id) {
        return ResponseBean.getSuccess(service.queryOneById(id));
    }

    @GetMapping("all")
    public ResponseBean query(T obj) {
        return ResponseBean.getSuccess(service.query(obj));
    }

    @GetMapping("page")
    public ResponseBean query(T obj, PageQueryVO pageQuery) {
        return ResponseBean.getSuccess(service.query(obj,pageQuery));
    }

    @DeleteMapping("item")
    public ResponseBean deleteById(Long id) {
        service.deleteById(id);
        return ResponseBean.getSuccess(true);
    }

    @DeleteMapping("items")
    public ResponseBean deleteByIds(List<Long> ids) {
        service.deleteByIds(ids);
        return ResponseBean.getSuccess(true);
    }
}
