package com.example.domain;

import java.util.Date;
import java.util.List;

/**
 * @author ：qinjinwei
 * @date ：Created in 2022/4/23 12:29
 * @description：
 * @modified By：
 * @version: $
 */
public class User {
    private int id;
    private String username;
    private String password;
    private Date birthday;
    private List<Order> orderList; // 一对多

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
    // 描述角色
    private List<Role> roleList ;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                ", orderList=" + orderList +
                ", roleList=" + roleList +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
