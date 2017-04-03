package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.example.zhouwei.UserRepository;

@SpringBootApplication
//@Controller
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }


//    @Autowired
//    Configuration configuration;

//    @Autowired
//    UserRepository userRepository;


//    @RequestMapping("/test")
//    public String index(Model model, HttpServletResponse response) throws IOException, TemplateException {
//        Map<String, Object> map = Maps.newHashMap();
//        map.put("hello","hello");
//        map.put("name","spring boot");
//        model.addAllAttributes(map);
//        List<User> users = Lists.newArrayList(
//                new User("张三"),
//                new User("李四"),
//                new User("王五")
//        );
//        model.addAttribute("users",users);
//
////        StringWriter stringWriter = new StringWriter();
////        Template index = configuration.getTemplate("index.ftl");
////        index.process(model,stringWriter);
////        String s = stringWriter.toString();
////        System.out.println(s);
//
//        return "index";
//    }

//    @RequestMapping("test2")
//    @ResponseBody
//    public User q1(String name){
//        //Map<String,Object> map = Maps.newHashMap();
//        //map.put("name", name);
//
//        User save = userRepository.save(new User(name));
//
//        return save;
//    }
}
