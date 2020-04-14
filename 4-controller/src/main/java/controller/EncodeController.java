package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;

/**
 * @author YZY
 * @date 2020/4/14 - 22:24
 */
@Controller
public class EncodeController {

    @RequestMapping("/encode")
//    前端接收http://localhost:8080/h1?username=yzy
    //          @RequstrParam:别名,只要需要传参最好写上比较显眼
    public String view(@RequestParam("username")String name, Model model, HttpServletRequest request) throws UnsupportedEncodingException {

        request.setCharacterEncoding("utf-8");

        System.out.println(name);
        model.addAttribute("msg",name);
        return "hi";
    }

}
