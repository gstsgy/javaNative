package com.gstsgy.base.service.impl;

import com.gstsgy.base.service.UniversalReportService;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import java.io.StringWriter;
import java.util.List;
import java.util.Map;

@Service
public class UniversalReportServiceImpl implements UniversalReportService {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    // FreeMarker 配置
    private final Configuration freemarkerConfig = new Configuration(Configuration.VERSION_2_3_32);

    public List<Map<String, Object>> execute(String templateSql, Map<String, Object> params) {
        try {
            // 1. 渲染动态 SQL (处理 if/else 逻辑)
            StringWriter writer = new StringWriter();
            new Template("sql", templateSql, freemarkerConfig).process(params, writer);
            String finalSql = writer.toString();

            // 2. 执行查询 (Map 进，Map 出)
            return jdbcTemplate.queryForList(finalSql, params);
        } catch (Exception e) {
            throw new RuntimeException("SQL 渲染或执行失败: " + e.getMessage());
        }
    }

// SQL 样例
//    SELECT * FROM dictionary
//    WHERE 1=1
//<#if name?? && name != "">
//    AND name LIKE :name
//            </#if>
//<#if type??>
//    AND type = :type
//            </#if>

}

