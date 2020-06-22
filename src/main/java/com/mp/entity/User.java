package com.mp.entity;

import java.time.LocalDateTime;

import lombok.Data;

@Data   //编译时  自动 加入   get  set方法
public class User {
    private Long id;

    private String name;

    private Integer age;

    private String email;

    //直属上级
    private Long managerId; 

    
    //创建时间
    private LocalDateTime createTime;
}
