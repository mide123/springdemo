package com.dls.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class HelloService {
    public void hello() {
        log.info("hello");
        System.out.println("你好");
    }
}
