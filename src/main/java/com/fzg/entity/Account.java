package com.fzg.entity;

import lombok.Data;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


@Data
public class Account {
    @NotEmpty(message="用户名不能为空")
    private String username;
    @Size(min=6,max=20,message="密码长度为6-20位")
    private String password;
    @Email(regexp="^(\\w)+(\\.\\w+)*@(\\w)+((\\.\\w+)+)$",message="请输⼊正确的邮箱")
    private String email;
    @Pattern(regexp="^1[3456789]\\d{9}$",message="请输⼊正确的电话格式")
    private String phone;
}
