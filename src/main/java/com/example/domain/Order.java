package com.example.domain;

import java.util.Date;

/**
 * @author ：qinjinwei
 * @date ：Created in 2022/4/23 12:30
 * @description：
 * @modified By：
 * @version: $
 */
public class Order {
    private int id;
    private Date ordertime;
    private double total;
    private int uid;

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private User user; // 一对一  一个订单属于 一个用户

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", ordertime=" + ordertime +
                ", total=" + total +
                ", uid=" + uid +
                ", user=" + user +
                '}';
    }
}
