package com.example.dao;

import com.example.domain.Order;
import com.example.domain.User;

import java.util.List;

public interface OrderMap {
   public  List<Order>queryOrderList();
   public  List<User>queryAll();
}
