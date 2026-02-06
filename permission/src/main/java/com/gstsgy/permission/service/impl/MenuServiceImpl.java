package com.gstsgy.permission.service.impl;

import com.gstsgy.permission.bean.db.Menu;
import com.gstsgy.permission.repository.MenuRepository;
import com.gstsgy.permission.service.MenuService;
import org.springframework.stereotype.Service;
import com.gstsgy.base.service.impl.BaseServiceImpl;

@Service
public class MenuServiceImpl extends BaseServiceImpl<Menu, MenuRepository> implements MenuService {
}