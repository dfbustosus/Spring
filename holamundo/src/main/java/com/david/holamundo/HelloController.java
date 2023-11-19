package com.david.holamundo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hola")
    public String hello(){
        return "Hola mundo";
    }
    
}
