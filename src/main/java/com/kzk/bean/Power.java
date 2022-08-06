package com.kzk.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Power {
    private Integer powerId;
    private String powerName;
    private String url;
    private Integer parentId;
}
