package com.kzk.service;

import com.alibaba.fastjson.JSONObject;

import java.util.List;
import java.util.Map;

public interface RoleService {

    JSONObject roleList();

    Map roleUpOrNext(Integer pageCurr, Integer pageSize);

    void addRole(String roleName,String instructions);

    Map deleteRole(Integer roleId);

    Map lookRoleInfo(Integer roleId);

    void updRole(String roleName,String instructions,Integer roleId);

    Map lookPower(Integer roleId);

    Map savePower(Integer roleId, List<Integer> powerIdList);
}
