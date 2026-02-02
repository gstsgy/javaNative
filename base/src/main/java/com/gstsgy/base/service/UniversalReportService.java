package com.gstsgy.base.service;

import java.util.List;
import java.util.Map;

public interface UniversalReportService {
    List<Map<String, Object>> execute(String templateSql, Map<String, Object> params);
}
