package com.yang.springbootinit.model.entity;



import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;


/**
 * 用户信息
 * @TableName user
 */
@TableName(value ="user")
@Data
public class User implements Serializable {
    /**
     * 主键
     */
    @TableId
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 性别
     */
    private String sex;

    /**
     * 用户身份
     */
    private String userRole;

    /**
     * 身份证号
     */
    private String id_number;

    /**
     * 头像
     */
    private String userAvatar;

    /**
     * 状态 0:禁用，1:正常
     */
    private Integer status;

    /**
     *
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 用户账号
     */
    private String userAccount;

    /**
     * 密码
     */
    private String userPassword;

    /**
     * 0 - 未删除，1 - 删除
     */
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}