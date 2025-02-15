package com.gupta.cache.ehcache.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class MyService {

    @Cacheable(value = "myCache", key = "#id")
    public String getData(int id) {
        System.out.println("Reading from the method.id="+id);
        return id + ":" + new Date();
    }

}
