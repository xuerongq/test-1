package com.kzk.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RolePowerMapper {
    int delPower(@Param("roleId") Integer roleId);

    int addPower(@Param("roleId") Integer roleId, @Param("powerId") Integer powerId);
}
