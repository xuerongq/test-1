package com.kzk.mapper;

import com.kzk.bean.Role;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleMapper {
    List<Role> findList();

    int addRole(@Param("roleName") String roleName,@Param("instructions") String instructions);

    int delRole(@Param("roleId") Integer roleId);

    Role lookInfo(@Param("roleId") Integer roleId);

    int updRole(@Param("roleName") String roleName,@Param("instructions") String instructions,@Param("roleId") Integer roleId);
}
