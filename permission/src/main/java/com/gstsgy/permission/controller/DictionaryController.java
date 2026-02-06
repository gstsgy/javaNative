package com.gstsgy.permission.controller;

import com.gstsgy.permission.bean.db.Dictionary;
import com.gstsgy.permission.service.DictionaryService;
import com.gstsgy.base.controller.BaseController;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.aot.hint.annotation.RegisterReflectionForBinding;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "数据字典")
@RegisterReflectionForBinding({Dictionary.class})
@RestController
@RequestMapping("dictionary")
public class DictionaryController extends BaseController<DictionaryService, Dictionary> {
}