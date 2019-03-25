package com.tortoiselala.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;

import javax.sql.DataSource;
import java.sql.SQLException;

public class JDBCUtils {

    private static DataSource dataSource;
    static{
        dataSource = new ComboPooledDataSource();
    }

    public static QueryRunner getQuerRunner(){
        return new QueryRunner(dataSource);
    }

    @Test
    public void testDatabaseConnection() throws SQLException {
        System.out.println(dataSource.getClass());
        System.out.println(dataSource.getConnection().toString());
    }
}
