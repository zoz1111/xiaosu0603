package cn.lzy.configbean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "student")
public class Student {
    private int id;//学号
    private String name;//名字
    private int age;//年龄
    private String[] hobby;//爱好
    private List electProduct;//电子产品
    private Map friends;//朋友
    private Course course;//课程
}
