package com.gstsgy.base.bean.db;


import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.SoftDelete;
@Data
@SoftDelete(columnName = "is_del") // 核心注解
@MappedSuperclass
public  class BaseTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String insertYmd;//

    private Long insertId;//

    private String updateYmd;//

    private  Long updateId;

    //private  Integer is_del;//
     @Version
     private  int updateFlag;//

}
