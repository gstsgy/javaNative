package com.gstsgy.permission.controller;

import com.gstsgy.permission.bean.db.Menu;
import com.gstsgy.permission.service.MenuService;
import com.gstsgy.base.controller.BaseController;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.aot.hint.annotation.RegisterReflectionForBinding;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "菜单")
@RegisterReflectionForBinding({Menu.class})
@RestController
@RequestMapping("menu")
public class MenuController extends BaseController<MenuService, Menu> {
}