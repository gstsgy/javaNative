package com.gstsgy.permission.service.impl;

import com.gstsgy.permission.bean.db.Operator;
import com.gstsgy.permission.repository.OperatorRepository;
import com.gstsgy.permission.service.OperatorService;
import org.springframework.stereotype.Service;
import com.gstsgy.base.service.impl.BaseServiceImpl;

@Service
public class OperatorServiceImpl extends BaseServiceImpl<Operator, OperatorRepository> implements OperatorService {
}