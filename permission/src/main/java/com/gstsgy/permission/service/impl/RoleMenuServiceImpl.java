package com.gstsgy.permission.service.impl;

import com.gstsgy.permission.bean.db.RoleMenu;
import com.gstsgy.permission.repository.RoleMenuRepository;
import com.gstsgy.permission.service.RoleMenuService;
import org.springframework.stereotype.Service;
import com.gstsgy.base.service.impl.BaseServiceImpl;

@Service
public class RoleMenuServiceImpl extends BaseServiceImpl<RoleMenu, RoleMenuRepository> implements RoleMenuService {
}