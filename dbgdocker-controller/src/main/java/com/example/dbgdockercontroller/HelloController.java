package com.example.dbgdockercontroller;

import com.example.dbgdockerservice.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Date: Created on 15:20 2022/6/8
 */

@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/{name}",method = {RequestMethod.GET})
    public String guide(@PathVariable String name) {
        return helloService.hello(name);
    }
}
