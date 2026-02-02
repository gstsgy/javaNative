package com.gstsgy.webapi.controller;

import com.gstsgy.base.bean.dto.PageQueryVO;
import com.gstsgy.base.bean.dto.ResponseBean;
import com.gstsgy.base.bean.entity.BaseEntity;
import com.gstsgy.base.controller.BaseController;
import com.gstsgy.webapi.bean.Dictionary;
import com.gstsgy.webapi.service.DictionaryService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.aot.hint.annotation.RegisterReflectionForBinding;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RegisterReflectionForBinding({ResponseBean.class, Dictionary.class, PageQueryVO.class, BaseEntity.class})
@Tag(name = "字典")
@RestController
@RequestMapping("dictionary")
public class DictionaryController extends BaseController<DictionaryService,Dictionary> {
}
