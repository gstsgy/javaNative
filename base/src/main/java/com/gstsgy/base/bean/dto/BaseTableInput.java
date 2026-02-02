package com.gstsgy.base.bean.dto;

import com.gstsgy.base.bean.entity.BaseEntity;
import org.babyfish.jimmer.Input;

public class BaseTableInput implements Input<BaseEntity> {
    //#allScalarss

    @Override
    public BaseEntity toEntity() {
        return null;
    }

    @Override
    public BaseEntity toImmutable() {
        return Input.super.toImmutable();
    }
}
