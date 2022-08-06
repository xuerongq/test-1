package com.kzk.controller;

import com.alibaba.fastjson.JSONObject;
import com.kzk.bean.Role;
import com.kzk.bean.User;
import com.kzk.service.RoleService;
import com.kzk.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/userManage")
@Api(value = "接口说明",tags = "接口说明")
public class UserController {

    @Autowired
    private UserService userService;

//    @Autowired
//    private RoleService roleService;

//    @RequestMapping("/hello")
//    @ApiOperation(value = "测试",notes = "这是一个测试文档")
//    public String hello(){
//        return "hello";
//    }
//
//
//    @RequestMapping("/login")
//    public String login() {
//        return "login";
//    }

//    @ApiOperation(value = "login",notes = "登录")
//    @RequestMapping("/doLogin")
//    public JSONObject doLogin(String uacc,String upwd) {
//        User user = userService.login(uacc, upwd);
//        JSONObject json = new JSONObject();
//        json.put("user",user);
//        json.put("re","登录成功");
//        return json;
//    }
//
//    @RequestMapping("/goRegister")
//    public String goRegister() {
//        return "register";
//    }
//
//    @RequestMapping("/goLogin")
//    public String goLogin() {
//        return "login";
//    }
//
//    @RequestMapping("/doRegister")
//    public String doRegister(HttpServletRequest request, String uacc, Integer uage, String uname, String upwd, MultipartFile fname) {
//        String savedDir = request.getSession().getServletContext().getRealPath("upload"); //获取服务器指定文件存取路径
//        File uploadPath = new File(savedDir);
//        /*创建tomcat虚拟存储文件夹*/
//        if (!uploadPath.exists()) {
//            uploadPath.mkdir();
//        }
//        String fn = fname.getOriginalFilename();
//        try {
//            fname.transferTo(new File(uploadPath + "/" + fn));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        User user = new User(null, uacc, upwd, fn, uname, uage, null);
//        userService.register(user);
//        return "login";
//    }

    @ApiOperation(value = "userList",notes = "获取用户管理集合")
    @PostMapping("/userList")
    public JSONObject userList() {
        JSONObject json = new JSONObject();
        json.put("userList", userService.userList());
        json.put("total",userService.userList().size());
        return json;
    }
//
//    @RequestMapping("/userUpOrNext")
//    public @ResponseBody Map userUpOrNext(Integer pageCurr, Integer pageSize) {
//        return userService.upOrNext(pageCurr, pageSize);
//    }
//
//    @RequestMapping("/delUser")
//    public JSONObject deleteUser(Integer id) {
//        return userService.delUser(id);
//    }
//
//    @RequestMapping("/lookInfo")
//    public  Map lookInfo(Integer id) {
//        Map map = new HashMap();
//        map.put("info", userService.lookInfo(id));
//        return map;
//    }
//
//    @RequestMapping("/updInfo")
//    public  JSONObject updInfo(String age, String pwd, String name, Integer id) {
//        return userService.updInfo(age, pwd, name, id);
//    }

//    @RequestMapping("/addUser")
//    public String addUser(HttpServletRequest request, String uacc, Integer uage, String uname, String upwd, MultipartFile fname) {
//        String savedDir = request.getSession().getServletContext().getRealPath("upload"); //获取服务器指定文件存取路径
//        File uploadPath = new File(savedDir);
//        /*创建tomcat虚拟存储文件夹*/
//        if (!uploadPath.exists()) {
//            uploadPath.mkdir();
//        }
//        String fn = fname.getOriginalFilename();
//        try {
//            fname.transferTo(new File(uploadPath + "/" + fn));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        User user = new User(null, uacc, upwd, fn, uname, uage, null);
//        userService.register(user);
//        return "redirect:userList";
//    }

//    @RequestMapping("/addUser")
//    public JSONObject addUser(String acc, Integer age, String name, String pwd,Integer roleId) {
//        User user = new User(null, acc, pwd, null, name, age, roleId);
//        return userService.addUser(user);
//    }
//
//    @RequestMapping("/showMenu")
//    public Map showMenu(Integer roleId) {
//        return userService.showMenu(roleId);
//    }
//
//    @RequestMapping("/roleList")
//    public  JSONObject roleList() {
//        return roleService.roleList();
//    }
//
//    @RequestMapping("/roleUpOrNext")
//    public Map roleUpOrNext(Integer pageCurr, Integer pageSize){
//        return roleService.roleUpOrNext(pageCurr, pageSize);
//    }
//
//    @RequestMapping("/addRole")
//    public String addRole(String roleName,String instructions){
//        roleService.addRole(roleName, instructions);
//        return "redirect:roleList";
//    }
//
//    @RequestMapping("/deleteRole")
//    public Map deleteRole(Integer roleId){
//        return roleService.deleteRole(roleId);
//    }
//
//    @RequestMapping("/lookRoleInfo")
//    public Map lookRoleInfo(Integer roleId){
//        return roleService.lookRoleInfo(roleId);
//    }
//
//    @RequestMapping("/updRole")
//    public String updRole(String roleName,String instructions,Integer roleId){
//        roleService.updRole(roleName, instructions, roleId);
//        return "redirect:roleList";
//    }
//
//    @RequestMapping("/lookPower")
//    public Map lookPower(Integer roleId){
//        return roleService.lookPower(roleId);
//    }
//
//    @RequestMapping("/powerHtml")
//    public String powerHtml(){
//        return "powerHtml";
//    }
//
//    @RequestMapping(value = "/savePower")
//    public  Map savePower(@RequestBody Role role ){
//        return roleService.savePower(role.getRoleId(),role.getPowerIdList());
//    }
}
