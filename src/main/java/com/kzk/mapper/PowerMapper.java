package com.kzk.mapper;

import com.kzk.bean.Power;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PowerMapper {

    List<Power> showMenu(@Param("roleId") Integer roleId);

    List<Power> selPower(@Param("roleId") Integer roleId);

    List<Power> selNotPower();
}
