package com.mountain.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 *  角色用户
 * </p>
 *
 * @author zscat
 * @since 2019-05-01
 */
@Data
@TableName("sys_role_user")
public class SysRoleUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("user_id")
    private Long userId;

    @TableField("role_id")
    private Long roleId;

    @Override
    public String toString() {
        return "SysRoleUser{" +
        ", userId=" + userId +
        ", roleId=" + roleId +
        "}";
    }
}
