package com.example.dao;
import com.example.domain.User;

import java.util.List;
import java.util.Map;

public interface UserMap {

    public List<Acount> getAccountById(Acount acount);
    public void saveAccount(Acount acount);
    public List<User> queryUserAndRole();

}
