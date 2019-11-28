package com.mountain.controller;

import com.mountain.redis.template.RedisRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class testController{


    @Autowired
    RedisRepository redisRepository;

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @GetMapping("xwj")
    public void info(){
        redisRepository.set("afeng1010","abc");
       String a = redisRepository.get("afeng1010").toString();
        logger.info("-------------------->{}",a);
    }

}
