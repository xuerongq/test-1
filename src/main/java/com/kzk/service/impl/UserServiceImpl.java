package com.kzk.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kzk.bean.Power;
import com.kzk.bean.User;
import com.kzk.mapper.PowerMapper;
import com.kzk.mapper.UserMapper;
import com.kzk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;

    @Autowired
    private PowerMapper powerMapper;

    @Override
    public User login(String acc, String pwd) {
        return mapper.login(acc,pwd);
    }

    @Override
    public void register(User user) {
        mapper.register(user);
    }

    @Override
    public List<User> userList() {
        List<User> userList = mapper.findList();
        return userList;
    }

    @Override
    public Map upOrNext(Integer pageCurr,Integer pageSize) {
        PageHelper.startPage(pageCurr, pageSize);
        List<User> userList = mapper.findList();
        Map map = new HashMap();
        PageInfo<User> pageInfo = new PageInfo<>(userList);
        map.put("userList",userList);
        map.put("pageCount",pageInfo.getPages());
        return map;
    }

    @Override
    public JSONObject delUser(Integer id) {
        mapper.delUser(id);
        JSONObject json = new JSONObject();
        json.put("userList",userList());
        json.put("total",userList().size());
        return json;
    }

    @Override
    public User lookInfo(Integer id) {
        return mapper.lookInfo(id);
    }

    @Override
    public JSONObject updInfo(String age, String pwd, String name, Integer id) {
        mapper.updInfo(age, pwd, name, id);
        JSONObject json = new JSONObject();
        json.put("userList",userList());
        json.put("total",userList().size());
        return json;
    }



    @Override
    public Map showMenu(Integer roleId) {
        List<Power> powerList = powerMapper.showMenu(roleId);
        Map map = new HashMap();
        map.put("powerList",powerList);
        return map;
    }

    @Override
    public JSONObject addUser(User user) {
        JSONObject json = new JSONObject();
        mapper.addUser(user);
        json.put("userList",userList());
        json.put("total",userList().size());
        return json;
    }


}
