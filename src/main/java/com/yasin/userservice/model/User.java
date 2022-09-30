package com.yasin.userservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {
    @Id
    private Date createDate = new Date();
    private  String id;
    private  String name;
    private  String email;
    private  String  password;


}
