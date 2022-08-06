package com.kzk.service;

import com.alibaba.fastjson.JSONObject;
import com.kzk.bean.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    User login(String acc,String pwd);

    void register(User user);
    List<User> userList();

    Map upOrNext(Integer pageCurr, Integer pageSize);

    JSONObject delUser(Integer id);

    User lookInfo(Integer id);

    JSONObject updInfo(String upwd, String uname, String uage, Integer id);

    Map showMenu(Integer roleId);

    JSONObject addUser(User user);

}
