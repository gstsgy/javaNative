package com.gstsgy.webapi.service.impl;

import com.gstsgy.base.service.impl.BaseServiceImpl;
import com.gstsgy.webapi.bean.Dictionary;
import com.gstsgy.webapi.repository.DictionaryRepository;
import com.gstsgy.webapi.service.DictionaryService;
import org.springframework.stereotype.Service;

@Service
public class DictionaryServiceImpl extends BaseServiceImpl<Dictionary, DictionaryRepository> implements DictionaryService {
}
