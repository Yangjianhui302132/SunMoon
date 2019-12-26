package com.sun.moon.member.service.test;

import org.springframework.stereotype.Service;

@Service
public class MemberService {

    public String hi(String name){
        return "你好:"+name;
    }
}
