package com.starry_sky.yang.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
@TableName("user")
/**
 * lombok+@Data：实现pojo类的getter和setter方法
 */
@Data
public class User {

    /**
     * @TableId(type = IdType.AUTO)
     * 实现主键的自增
     */
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private String sex;
    private String address;
}
