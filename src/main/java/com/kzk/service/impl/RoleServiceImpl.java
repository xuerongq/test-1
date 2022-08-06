package com.kzk.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kzk.bean.Power;
import com.kzk.bean.Role;
import com.kzk.mapper.PowerMapper;
import com.kzk.mapper.RoleMapper;
import com.kzk.mapper.RolePowerMapper;
import com.kzk.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private PowerMapper powerMapper;

    @Autowired
    private RolePowerMapper rolePowerMapper;

    @Override
    public JSONObject roleList() {
        JSONObject json = new JSONObject();
        json.put("roleList",roleMapper.findList());
        json.put("total",roleMapper.findList().size());
        return json;
    }

    @Override
    public Map roleUpOrNext(Integer pageCurr, Integer pageSize) {
        Map map = new HashMap();
        PageHelper.startPage(pageCurr, pageSize);
        List<Role> roleList = roleMapper.findList();
        PageInfo<Role> pageInfo = new PageInfo<>(roleList);
        map.put("roleList",roleList);
        map.put("pageCount",pageInfo.getPages());
        return map;
    }

    @Override
    public void addRole(String roleName, String instructions) {
        roleMapper.addRole(roleName, instructions);
    }

    @Override
    public Map deleteRole(Integer roleId) {
        Map map = new HashMap();
        map.put("re",roleMapper.delRole(roleId));
        return map;
    }

    @Override
    public Map lookRoleInfo(Integer roleId) {
        Map map = new HashMap();
        Role role = roleMapper.lookInfo(roleId);
        map.put("role",role);
        return map;
    }

    @Override
    public void updRole(String roleName, String instructions, Integer roleId) {
        roleMapper.updRole(roleName, instructions, roleId);
    }

    @Override
    public Map lookPower(Integer roleId) {
        Map map = new HashMap();
        List<Power> powerList = powerMapper.selPower(roleId);
        List<Power> powerListNot = powerMapper.selNotPower();
        map.put("powerList",powerList);
        map.put("powerListNot",powerListNot);
        return map;
    }

    @Override
    public Map savePower(Integer roleId, List<Integer> powerIdList) {
        Map map = new HashMap();
        int delNum = rolePowerMapper.delPower(roleId);
        int addNum = 0;
        if (delNum > 0) {
            for (Integer powerId:powerIdList) {
                addNum = rolePowerMapper.addPower(roleId,powerId);
            }
        }
        if (delNum > 0 && addNum >0){
            map.put("re",1);
        }else {
            map.put("re",0);
        }
        return map;
    }

}
