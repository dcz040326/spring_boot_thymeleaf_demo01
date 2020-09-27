package com.offcn.controller;

import com.offcn.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

@Controller
public class FirstThymeleafController {

    @GetMapping("/demo01")
    public String indexPage(Model model){
        String message = "hello word";
        model.addAttribute("message",message);
        return "index1";
    }


    @GetMapping("/demo02")
    public String demo02(Model model){
        //创建user对象
        User user = new User();
        user.setId(1);
        user.setAge(25);
        user.setName("皮卡丘");
        //存储
        model.addAttribute("user",user);

        //创建map
        Map map = new HashMap();
        map.put("id",2);
        map.put("name","龙龟");
        map.put("age",15);
        model.addAttribute("map1",map);

        return "index2";

    }

    @GetMapping("/demo03")
    public String demo03(Model model){
        //创建集合
        List list = new ArrayList();
        //创建user对象
        User user1 = new User(1,"lala",15);
        User user2 = new User(2,"zaza",16);
        list.add(user1);
        list.add(user2);
        model.addAttribute("list",list);
        return "index3";
    }

    @GetMapping("/demo04")
    public String demo04(Model model){
        model.addAttribute("str","lalalal");
        model.addAttribute("hrefValue","http://www.baidu.com");
        model.addAttribute("srcValue","01.jpg");

        return "index4";
    }

    @GetMapping("/demo05")
    public String demo05(Model model){

        //布尔类型数据
        model.addAttribute("aaa",false);
        //菜单
        model.addAttribute("bbb","admin");
        //权限
        model.addAttribute("ccc","manger");
        return "index5";
    }

    @GetMapping("/demo06")
    public String demo06(Model model){


        return "index6";
    }

    @GetMapping("/demo07")
    public String demo07(Model model){
        /*添加时间*/
        model.addAttribute("date",new Date());
        /*添加小数*/
        model.addAttribute("price",5.1111);
        //大量文本
        String  str="Thymeleaf是Web和独立环境的现代服务器端Java模板引擎，能够处理HTML，XML，JavaScript，CSS甚至纯文本。\\r\\n\" + \n" +
                "\t  \t\t\"Thymeleaf的主要目标是提供一种优雅和高度可维护的创建模板的方式。为了实现这一点，它建立在自然模板的概念上，将其逻辑注入到模板文件中，不会影响模板被用作设计原型。这改善了设计的沟通，弥补了设计和开发团队之间的差距。\\r\\n\" + \n" +
                "\t  \t\t\"Thymeleaf也从一开始就设计了Web标准 - 特别是HTML5 - 允许您创建完全验证的模板，如果这是您需要的\\r\\n\" ;";
        model.addAttribute("str",str);

        //字符串截取
        model.addAttribute("str2","JAVA-AAA");

        return "index7";
    }
}
