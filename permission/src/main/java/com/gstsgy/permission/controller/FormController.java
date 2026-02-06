package com.gstsgy.permission.controller;

import com.gstsgy.permission.bean.db.Form;
import com.gstsgy.permission.service.FormService;
import com.gstsgy.base.controller.BaseController;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.aot.hint.annotation.RegisterReflectionForBinding;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "表单表")
@RegisterReflectionForBinding({Form.class})
@RestController
@RequestMapping("form")
public class FormController extends BaseController<FormService, Form> {
}