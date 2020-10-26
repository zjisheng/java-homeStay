package com.cuc.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Author: zengjisheng
 * @Date: 2020/10/16 22:16
 **/

@ApiModel(value = "user", description = "user")
@TableName(value = "user")
public class User {

    @ApiModelProperty(value = "id", notes = "id")
    @TableId(value = "id")
    private String id;

    @ApiModelProperty(value = "username", notes = "username")
    @TableField(value = "username")
    private String username;

    @ApiModelProperty(value = "password", notes = "password")
    @TableField(value = "password")
    private String password;

    @ApiModelProperty(value = "name", notes = "name")
    @TableField(value = "name")
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
