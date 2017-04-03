package com.example.zhouwei;

import lombok.AllArgsConstructor;
import lombok.Data;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;

/**
 * Created by zhouwei on 2017/1/12.
 */
@Data
@AllArgsConstructor
//@Entity(name = "s_user")
public class User {

    public User(){
    }

    public User(String name){
        this.name = name;
    }

    //@Column(name="s_name")
    public String name;

    //@Id
    //@GeneratedValue
    public String id;

}
