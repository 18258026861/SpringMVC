package controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pojo.Person;

/**
 * @author YZY
 * @date 2020/4/14 - 12:15
 */
@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/h1")
//    前端接收http://localhost:8080/h1?username=yzy
    //          @RequstrParam:别名,只要需要传参最好写上比较显眼
    public String view(@RequestParam("username")String name, Model model){
        System.out.println(name);
        model.addAttribute("msg",name);
        return "hi";
    }
//    前端传过来的是个对象，参数填对象，名称会自动匹配
//    http://localhost:8080/person?name=yzy&age=22
    @RequestMapping("/person")
    public String view1(Person person, Model model){

        model.addAttribute("msg",person);

        return "hi";
    }



    @RequestMapping("/h2")
    public String view2(Model model){
        model.addAttribute("msg","YY");

        return "hi";
    }

}
