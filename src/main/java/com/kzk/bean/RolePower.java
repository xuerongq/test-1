package com.kzk.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class RolePower {
    private Integer reId;
    private Integer roleId;
    private Integer powerId;
}
