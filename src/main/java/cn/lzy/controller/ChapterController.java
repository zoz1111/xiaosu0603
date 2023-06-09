package cn.lzy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChapterController {

    @RequestMapping(value = "/hello")

    public String sayHello(){
        return "hello Springboot !!早上好，中午好，晚上好，大家好才是真的好";
    }


}