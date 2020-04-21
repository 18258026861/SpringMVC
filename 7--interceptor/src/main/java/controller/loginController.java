package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author YZY
 * @date 2020/4/18 - 23:15
 */
@Controller
//类路径直接加载在项目名后面，WEB-INF前面
//@RequestMapping中value值(即跳转的路径),可以加 “/”，也可不加 /,
//作用于类的 @RequestMapping可以省略不要，但是作用于方法的 @RequestMapping必须有
@RequestMapping("/Login")
public class loginController {

    @RequestMapping("/tologin")
    public String tologin(){
//        1）当页面跳转路径加/时，表示是绝对路径（推荐）(项目名后面直接加返回路径)
//            我们使用了前缀/WEB-INF，所以是第一种方法！！！！
//        2）当页面跳转路径不加/时，表示是相对路径（不推荐）
//          请求该方法的路径：当前页面路径+return返回的路径
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

    @RequestMapping("/quit")
    public String quit(HttpSession session){
        session.removeAttribute("username");
//        如果在返回的字符串前加上了 redirect 或者 forward 标签，就不会走视图解析器，而是直接转发或重定向到指定的路径，
//        所以对于重定向标签后面就不能加 WEB-INF ，但是对于转发标签的话后面可以跟 WEB-INF
        return "redirect:/index.jsp";
//        return "redirect:/Login/toUser";
//        这两种都行

    }

}
