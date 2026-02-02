/*
package com.gstsgy.base.utils;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.baomidou.mybatisplus.generator.model.ClassAnnotationAttributes;
import com.gstsgy.base.bean.db.BaseTable;
import com.gstsgy.base.controller.BaseController;
import com.gstsgy.base.service.BaseService;
import com.gstsgy.base.service.impl.BaseServiceImpl;
import org.apache.ibatis.annotations.Mapper;

public class BuildTool {
    private String dbUrl;

    private String dbUser;
    private String dbPasswd;
    private String modelName;
    private String tableName;
    private String author = "guyue";

    public BuildTool setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
        return this;
    }

   public BuildTool setDbUser(String dbUser) {
        this.dbUser = dbUser;
        return this;
   }

   public BuildTool setDbPasswd(String dbPasswd) {
        this.dbPasswd = dbPasswd;
        return this;
   }
   public BuildTool setModelName(String modelName) {
        this.modelName = modelName;
        return this;
   }
   public BuildTool setTableName(String tableName) {
        this.tableName = tableName;
        return this;
   }
   public BuildTool setAuthor(String author) {
        this.author = author;
        return this;
   }


    public static BuildTool build(){
        return new BuildTool();
    }

    public  void run(){
        FastAutoGenerator.create(this.dbUrl, this.dbUser, this.dbPasswd).
                globalConfig(builder -> {
                    builder.author(this.author)
                            .outputDir(String.format("%s/%s/src/main/java", System.getProperty("user.dir"),this.modelName))
                            .disableOpenDir();
                })
                .packageConfig(builder -> {
                    builder.parent("com.gstsgy."+this.modelName)
                            .entity("bean.db")
                            .mapper("mapper")
                            .service("service")
                            .serviceImpl("service.impl")
                            .xml("mappers");
                })
                .strategyConfig(builder -> {
                    builder.addInclude(this.tableName)
                            .entityBuilder()
                            .disableSerialVersionUID()
                            .superClass(BaseTable.class)
                            .addIgnoreColumns("id","insert_ymd","insert_id","update_ymd","update_id","effective","update_flag")
                            .enableLombok(new ClassAnnotationAttributes("@Data","lombok.Data"),new ClassAnnotationAttributes("@EqualsAndHashCode(callSuper = true)","lombok.EqualsAndHashCode"))
                            .formatFileName("%sDO")
                            .mapperBuilder().mapperAnnotation(Mapper.class)
                            .controllerBuilder().superClass(BaseController.class).enableRestStyle().template("/templates/controller.java")
                            .serviceBuilder().superServiceClass(BaseService.class)
                            .serviceImplTemplate("/templates/serviceImpl.java")
                            .superServiceImplClass(BaseServiceImpl.class)
                            .formatServiceFileName("%sService")
                            .formatServiceImplFileName("%sServiceImpl")
                            .mapperBuilder().disableMapperXml();
                })
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }
}
*/
