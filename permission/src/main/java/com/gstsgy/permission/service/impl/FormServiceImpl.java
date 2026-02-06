package com.gstsgy.permission.service.impl;

import com.gstsgy.permission.bean.db.Form;
import com.gstsgy.permission.repository.FormRepository;
import com.gstsgy.permission.service.FormService;
import org.springframework.stereotype.Service;
import com.gstsgy.base.service.impl.BaseServiceImpl;

@Service
public class FormServiceImpl extends BaseServiceImpl<Form, FormRepository> implements FormService {
}