package com.example.dbgdockerservice;

import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Date: Created on 15:25 2022/6/8
 */

@Component
public class HelloService {
    public String hello(String name) {
        return "<html><body><p>Hello, <b>" + name + "!</b></p></body></html>";
    }
}
