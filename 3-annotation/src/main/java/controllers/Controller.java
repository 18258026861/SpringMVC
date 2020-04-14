package controllers;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author YZY
 * @date 2020/4/14 - 11:18
 */


@org.springframework.stereotype.Controller

//@RequestMapping可以装在类上和方法上，
// 如果装在类上，那么方法上的访问地址就加前缀,例如下面的方法地址变成了/hello/hi
//@RequestMapping("/hello")
public class Controller  {

//  映射请求路径，即地址栏输入的内容，用于触发该业务
    @RequestMapping("/h")
    public String view(Model model){
//        业务

//        装载数据
        model.addAttribute("msg","YZY");

//        视图名，会被视图解析器处理，左边的叶子点一下就能看到被解析的视图页面
        return "hi";
    }



}
