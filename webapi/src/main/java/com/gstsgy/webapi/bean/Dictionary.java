package com.gstsgy.webapi.bean;


import com.gstsgy.base.bean.entity.BaseEntity;
import org.babyfish.jimmer.sql.*;

@Entity
public interface Dictionary  extends BaseEntity {
    String modelCode();

    String dictKey();

    String dictValue();

    Integer seq();

    Long parentId();
}

