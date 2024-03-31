package com.demo.dockerdemo.user.entity;

import java.io.Serializable;

/**
 * (TSysUsers)实体类
 *
 * @author makejava
 * @since 2024-03-31 16:27:54
 */
public class TSysUsers implements Serializable {
    private static final long serialVersionUID = -15934346526171927L;

    private Integer userId;

    private String userCode;

    private String authenticator;

    private String name;

    private String email;

    private String mobile;

    private String createTime;

    private Integer status;

    private String updateTime;

    private String loginTime;

    private Long loginNum;

    private String updatePasswordTime;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getAuthenticator() {
        return authenticator;
    }

    public void setAuthenticator(String authenticator) {
        this.authenticator = authenticator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

    public Long getLoginNum() {
        return loginNum;
    }

    public void setLoginNum(Long loginNum) {
        this.loginNum = loginNum;
    }

    public String getUpdatePasswordTime() {
        return updatePasswordTime;
    }

    public void setUpdatePasswordTime(String updatePasswordTime) {
        this.updatePasswordTime = updatePasswordTime;
    }

}

