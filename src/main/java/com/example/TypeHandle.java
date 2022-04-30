package com.example;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 * @author ：qinjinwei
 * @date ：Created in 2022/4/22 23:54
 * @description：
 * @modified By： 数据类型转换
 * @version: $
 */
public class TypeHandle extends BaseTypeHandler<Date> {
    //java 转数据库
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, Date date, JdbcType jdbcType) throws SQLException {
        double time = date.getTime();
        preparedStatement.setDouble(i,time);
    }
    // 数据库 转java
    //resultSet 结果集 转化成data
    @Override
    public Date getNullableResult(ResultSet resultSet, String s) throws SQLException {
         double ss  =  resultSet.getDouble(s);
        Date date = new java.sql.Date((long) ss);
        return date;
    }

    @Override
    public Date getNullableResult(ResultSet resultSet, int i) throws SQLException {
        double along = resultSet.getDouble(i);
        Date date = new Date((long) along);
        return date;
    }

    @Override
    public Date getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        double ss = callableStatement.getDouble(i);
        return new Date((long) ss);
    }
}
