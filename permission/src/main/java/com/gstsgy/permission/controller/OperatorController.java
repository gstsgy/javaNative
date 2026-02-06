package com.gstsgy.permission.controller;

import com.gstsgy.permission.bean.db.Operator;
import com.gstsgy.permission.service.OperatorService;
import com.gstsgy.base.controller.BaseController;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.aot.hint.annotation.RegisterReflectionForBinding;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "操作人")
@RegisterReflectionForBinding({Operator.class})
@RestController
@RequestMapping("operator")
public class OperatorController extends BaseController<OperatorService, Operator> {
}