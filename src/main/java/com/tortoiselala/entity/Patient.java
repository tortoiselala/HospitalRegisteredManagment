package com.tortoiselala.entity;

public class Patient {
    // 病人ID
    private String id;
    // 病人名称
    private String name;
    // 登录口令
    private String password;
    // 病人预存金额
    private double overage;
    // 最后一次登录日期及时间
    private String lastLoginDate;

    public Patient(String id, String name, String password, double overage, String lastLoginDate) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.overage = overage;
        this.lastLoginDate = lastLoginDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getOverage() {
        return overage;
    }

    public void setOverage(double overage) {
        this.overage = overage;
    }

    public String getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(String lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

}
