package cn.com.tonas.gptdemo.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
    public String hello(String world) {
        return "hello: " + world;
    }
}
