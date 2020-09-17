package com.example.demo.controller;

import com.example.demo.services.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

public class DataController {

    public static void main(String[] args) {
        RedisTemplate<Object, Object> objectObjectRedisTemplate = new RedisTemplate<>();
    }

    @Autowired
    DataService dataService;

    public void queery(){
        dataService.queery();

    }


    
}
