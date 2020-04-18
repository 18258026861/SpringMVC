package controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.User;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author YZY
 * @date 2020/4/18 - 12:15
 */
@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/hi")
    public String view(Model model){
        model.addAttribute("msg","msg");
        return "hi";
    }

    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException {
        System.out.println(name);
        if("YY".equals(name)) {
            response.getWriter().println("true");
        }
        else
            response.getWriter().println("false");

    }

    @RequestMapping("/user")
    @ResponseBody
    public List<User> user(HttpServletResponse response){
        List<User> list = new ArrayList<>();
        User user = new User("YY", 22);
        list.add(user);
        list.add(user);
        list.add(user);
        list.add(user);

        return list;
    }

    @RequestMapping("/username")
    @ResponseBody
    public String username(String username){
        String info = "";
        if(username.length()!=0) {
            if ("YY".equals(username)) {
                info = "存在";
            } else {
                info = "无此账号";
            }

        }
        else{
            info = "不能为空";
        }
        return info;
    }

    @RequestMapping("/password")
    @ResponseBody
    public String password(String password){
        String info = "";
        if(password.length()==0) {
            info = "不能为空";
        }
        return info;
    }

}
