package com.demo.dockerdemo.user.api;

import lombok.Data;

@Data
public class LoginReq {
    private String userCode;
    private String password;
}
