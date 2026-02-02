package com.gstsgy.webapi.bean;


import com.gstsgy.base.bean.entity.BaseEntity;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Dictionary  extends BaseEntity {
    private String modelCode;

    private String dictKey;

    private String dictValue;

    private Integer seq;

    private Long parentId;
}

