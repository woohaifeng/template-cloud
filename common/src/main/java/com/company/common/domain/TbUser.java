package com.company.common.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Table(name = "tb_user")
public class TbUser {
    /**
     * 主键
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 登陆名
     */
    @Column(name = "login_code")
    private String loginCode;

    /**
     * 登陆密码
     */
    private String password;

    /**
     * 真实姓名
     */
    private String name;

    private String resource;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取登陆名
     *
     * @return login_code - 登陆名
     */
    public String getLoginCode() {
        return loginCode;
    }

    /**
     * 设置登陆名
     *
     * @param loginCode 登陆名
     */
    public void setLoginCode(String loginCode) {
        this.loginCode = loginCode;
    }

    /**
     * 获取登陆密码
     *
     * @return password - 登陆密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置登陆密码
     *
     * @param password 登陆密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取真实姓名
     *
     * @return name - 真实姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置真实姓名
     *
     * @param name 真实姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return resource
     */
    public String getResource() {
        return resource;
    }

    /**
     * @param resource
     */
    public void setResource(String resource) {
        this.resource = resource;
    }
}