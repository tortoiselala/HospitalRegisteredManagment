package com.tortoiselala.dao;

import com.tortoiselala.entity.Doctor;
import com.tortoiselala.entity.Patient;
import com.tortoiselala.entity.User;

import java.sql.SQLException;

/**
 * 数据持久层
 */
public interface IUserDao {
    // 查询是否doctor
    public Doctor isDoctor(User user) throws SQLException;

    // 查询是否patient
    public Patient isPatient(User user) throws SQLException;

    public boolean authChecker(User user, Doctor doctor, Patient patient);
}
