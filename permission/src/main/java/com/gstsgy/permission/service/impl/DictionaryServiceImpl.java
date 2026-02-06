package com.gstsgy.permission.service.impl;

import com.gstsgy.permission.bean.db.Dictionary;
import com.gstsgy.permission.repository.DictionaryRepository;
import com.gstsgy.permission.service.DictionaryService;
import org.springframework.stereotype.Service;
import com.gstsgy.base.service.impl.BaseServiceImpl;

@Service
public class DictionaryServiceImpl extends BaseServiceImpl<Dictionary, DictionaryRepository> implements DictionaryService {
}