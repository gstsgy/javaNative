package com.gstsgy.permission.enable;

import java.util.HashSet;
import java.util.Set;

import javax.xml.parsers.DocumentBuilderFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

@Component
public class ReportInit implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        // 获取ResourcePatternResolver
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();

        // 获取目录下所有XML文件
        Resource[] resources = resolver.getResources("classpath:report/*.xml");

        Set<String> funNames = new HashSet<>();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        for (Resource resource : resources) {
            try {
                Document document = factory.newDocumentBuilder().parse(resource.getInputStream());
                NodeList nodeList = document.getElementsByTagName("select");
                // ... 后续处理逻辑
            } catch (Exception e) {
                throw new RuntimeException("解析文件失败：" + resource.getFilename(), e);
            }
        }
    }

}