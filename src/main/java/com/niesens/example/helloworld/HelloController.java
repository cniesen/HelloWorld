package com.niesens.example.helloworld;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() throws UnknownHostException {
        String host = InetAddress.getLocalHost().getHostName();
        String ip = InetAddress.getLocalHost().getHostAddress();

        return "Greetings from Spring Boot!<br />\nHost: " + host + "<br />\nIP: " + ip;
    }
    
}
