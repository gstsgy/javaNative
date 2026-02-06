package com.gstsgy.permission.bean.db;

import com.gstsgy.base.bean.db.BaseTable;
import jakarta.persistence.Entity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Schema(description = "角色菜单")
@Data
@Entity
public class RoleMenu extends BaseTable {
    @Schema(description = "")
    private String roleId;

    @Schema(description = "")
    private String menuId;

}