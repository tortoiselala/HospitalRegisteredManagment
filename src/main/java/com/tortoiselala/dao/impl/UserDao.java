package com.tortoiselala.dao.impl;

import com.tortoiselala.dao.IUserDao;
import com.tortoiselala.entity.Doctor;
import com.tortoiselala.entity.Patient;
import com.tortoiselala.entity.User;
import com.tortoiselala.utils.JDBCUtils;
import org.springframework.stereotype.Component;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

@Component(value = "UserDao")
public class UserDao implements IUserDao {

    // 查询是否doctor

    public Doctor isDoctor(User user) throws SQLException {
        String sql = "select * from HOSPITAL.T_BRXX where YSMC=?, DLKL=?";
        return JDBCUtils.getQuerRunner().query(sql, new BeanHandler<Doctor>(Doctor.class), user.getUsername(), user.getPassword());
    }

    // 查询是否patient
    public Patient isPatient(User user) throws SQLException {
        String sql = "select * from HOSPITAL.T_BRXX where BRMC=?, DLKL=?";
        return JDBCUtils.getQuerRunner().query(sql, new BeanHandler<Patient>(Patient.class), user.getUsername(), user.getPassword());
    }

    public boolean authChecker(User user, Doctor doctor, Patient patient) {
        try {
            doctor = isDoctor(user);
            patient = isPatient(user);

            if (doctor != null && patient == null) {
                return true;
            } else if (doctor == null && patient != null) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
