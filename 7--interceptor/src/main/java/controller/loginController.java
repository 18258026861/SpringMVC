package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author YZY
 * @date 2020/4/18 - 23:15
 */
@Controller
@RequestMapping("Login")
public class loginController {

    @RequestMapping("/tologin")
    public String tologin(){
        return "login";
    }
    @RequestMapping("/toUser")
    public String toUser(){
        return "User";
    }
    @RequestMapping("/login")
    public String login(String username, String password, HttpSession session){
        session.setAttribute("username",username);
        return "User";
    }

}
