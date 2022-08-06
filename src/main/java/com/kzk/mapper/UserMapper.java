package com.kzk.mapper;

import com.kzk.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    User login(@Param("acc") String acc,@Param("pwd") String pwd);

    int register(User user);

    List<User> findList();

    int delUser(@Param("id") Integer id);

    User lookInfo(@Param("id") Integer id);

    int updInfo(@Param("age") String age,@Param("pwd") String pwd,@Param("name") String name,@Param("id") Integer id);

    int addUser(User user);
}
