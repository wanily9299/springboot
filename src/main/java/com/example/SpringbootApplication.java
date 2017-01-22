package com.example;

import com.example.zhouwei.User;
import com.example.zhouwei.UserRepository;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;
import java.util.Map;

@SpringBootApplication
@Controller
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }


    @Autowired
    Configuration configuration;

    @Autowired
    UserRepository userRepository;


    @RequestMapping("/test")
    public String index(Model model, HttpServletResponse response) throws IOException, TemplateException {
        Map<String, Object> map = Maps.newHashMap();
        map.put("hello","hello");
        map.put("name","spring boot");
        model.addAllAttributes(map);
        List<User> users = Lists.newArrayList(
                new User("张三"),
                new User("李四"),
                new User("王五")
        );
        model.addAttribute("users",users);

        StringWriter stringWriter = new StringWriter();
        Template index = configuration.getTemplate("index.ftl");
        index.process(model,stringWriter);
        String s = stringWriter.toString();
        System.out.println(s);

        return "index";
    }

    @RequestMapping("test2")
    @ResponseBody
    public User q1(String name){
        //Map<String,Object> map = Maps.newHashMap();
        //map.put("name", name);

        User save = userRepository.save(new User(name));

        return save;
    }
}
