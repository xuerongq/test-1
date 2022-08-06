package com.kzk.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Role {
    private Integer roleId;
    private String roleName;
    private String instructions;
    private List<Integer> powerIdList;
}
