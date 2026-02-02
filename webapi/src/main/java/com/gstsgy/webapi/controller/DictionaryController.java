package com.gstsgy.webapi.controller;

import com.gstsgy.base.controller.BaseController;
import com.gstsgy.webapi.bean.Dictionary;
import com.gstsgy.webapi.service.DictionaryService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Tag(name = "字典")
@RestController
@RequestMapping("dictionary")
public class DictionaryController extends BaseController<DictionaryService,Dictionary> {
}
