package com.gstsgy.base.bean.entity;

import org.babyfish.jimmer.sql.*;
@MappedSuperclass
public  interface BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id();

    String insertYmd();//

     Long insertId();//

     String updateYmd();//

     Long updateId();
    @LogicalDeleted("false")
    boolean effective();//
     @Version
     int updateFlag();//

}
