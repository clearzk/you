package com.clear.you.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@ApiModel
public class User implements Serializable {

    public User() {
    }

    public User(Integer age, String name, String addr) {
        this.age = age;
        this.name = name;
        this.addr = addr;
    }

    @ApiModelProperty(value = "用户年龄")
    @NotNull(message = "年龄不能为空")
    @Min(value = 18,message = "年龄不能小于18岁")
    private Integer age;

    @ApiModelProperty(value = "用户姓名")
    @NotBlank(message = "姓名不能为空")
    private String name;

    @ApiModelProperty(value = "用户地址")
    private String addr;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}
