package com.tortoiselala.entity;

public class Doctor {
    // 医生ID
    private String id;
    // 所属科室编号
    private String departmentID;
    // 医生名称
    private String name;
    // 医生名称的拼音字首
    private String nameFirstLetter;
    // 登录口令
    private String password;
    // 是否专家
    private double isExpert;
    // 最后一次登录日期及时间
    private String lastLoginDate;

    public Doctor(String id, String departmentID, String name, String nameFirstLetter, String password, double isExpert, String lastLoginDate) {
        this.id = id;
        this.departmentID = departmentID;
        this.name = name;
        this.nameFirstLetter = nameFirstLetter;
        this.password = password;
        this.isExpert = isExpert;
        this.lastLoginDate = lastLoginDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(String departmentID) {
        this.departmentID = departmentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameFirstLetter() {
        return nameFirstLetter;
    }

    public void setNameFirstLetter(String nameFirstLetter) {
        this.nameFirstLetter = nameFirstLetter;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getIsExpert() {
        return isExpert;
    }

    public void setIsExpert(double isExpert) {
        this.isExpert = isExpert;
    }

    public String getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(String lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

}
