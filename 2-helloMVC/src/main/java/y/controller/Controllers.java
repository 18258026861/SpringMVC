package y.controller;

import org.springframework.web.context.request.SessionScope;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author YZY
 * @date 2020/4/13 - 19:58
 */
//  实现（继承是对于抽象类而言，别说岔了）Controller接口
public class Controllers implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
//      模型和视图
        ModelAndView mv = new ModelAndView();

//        调用业务层

//        在web中这部分相当于session.setAttribute,model用来存储信息
        mv.addObject("msg","YY");

//        跳转页面,相当于重定向和转发，
//      /WEB-INF/jsp/hello.jsp,在配置文件过滤前缀和后缀了
        mv.setViewName("hello");
        return mv;
    }
}
