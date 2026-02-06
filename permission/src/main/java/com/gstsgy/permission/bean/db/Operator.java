package com.gstsgy.permission.bean.db;

import com.gstsgy.base.bean.db.BaseTable;
import jakarta.persistence.Entity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Schema(description = "操作人")
@Data
@Entity
public class Operator extends BaseTable {
    @Schema(description = "ni cheng")
    private String nickName;

    @Schema(description = "password")
    private String passwd;

    @Schema(description = "")
    private String email;

    @Schema(description = "")
    private Integer gender;

    @Schema(description = "")
    private String birthday;

    @Schema(description = "")
    private String position;

    @Schema(description = "")
    private String code;

    @Schema(description = "")
    private String passwdUpdateYmd;

    @Schema(description = "微信唯一Id")
    private String wxId;

    @Schema(description = "电话")
    private String phone;

    @Schema(description = "")
    private String totpsecret;

}