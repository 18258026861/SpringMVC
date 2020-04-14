package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;
import java.util.Enumeration;

/**
 * @author YZY
 * @date 2020/4/14 - 21:14
 */
@Controller
public class APIController {

    @RequestMapping("/zf")
    public String view(HttpServletRequest request, HttpServletResponse response){

        HttpSession session = request.getSession();
        session.setAttribute("msg","转发");
//          默认转发
//          解析器默认转发，所以开了解析器只要return 视图名就行了，相当于解析器只支持转发
        return "/WEB-INF/JSP/hi.jsp";
    }

    @RequestMapping("/cdx")
    public String view2(HttpServletRequest request, HttpServletResponse response){

        request.getSession().setAttribute("msg","重定向");
//      重定向好像不能访问WEB-INF下的路径，只有内部转发才能访问该文件
//        在解析器开启的情况下，重定向写法不变
        return "redirect:/index.jsp";
    }

}
