package com.mountain.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author mall
 * 用户实体
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sys_user")
public class SysUser extends SuperEntity {
	private static final long serialVersionUID = -5886012896705137070L;
	private String username;
	private String password;
	private String nickname;
	@TableField("head_img_url")
	private String headImgUrl;
	private String mobile;
	private Integer sex;
	private Boolean enabled;
	private String type = "APP";
	@TableField("open_id")
	private String openId;
	@TableLogic
	@TableField("is_del")
	private Integer isDel;
	@TableField(exist = false)
	private List<SysRole> roles;
	@TableField(exist = false)
	private String roleId;
	@TableField(exist = false)
	private String oldPassword;
	@TableField(exist = false)
	private String newPassword;
	//角色
	@TableField(exist = false)
	private String roleIds;
	@TableField(exist = false)
	private String code;
	//用户余额
    @TableField(exist = false)
    private Double balance;
    //用户优惠券个数
    @TableField(exist = false)
    private Integer coupon;
    //用户积分
    @TableField(exist = false)
    private Integer integral;

}
