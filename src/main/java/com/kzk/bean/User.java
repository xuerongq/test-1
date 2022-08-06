package com.kzk.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@ApiModel("用户实体类")
public class User {
    @ApiModelProperty(value = "用户ID")
    private Integer id;
    @ApiModelProperty(value = "用户账号")
    private String acc;
    private String pwd;
    private String img;
    private String name;
    private Integer age;
    private Integer roleId;
}
