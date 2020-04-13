package y.controller;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author YZY
 * @date 2020/4/13 - 23:18
 */
public class Controller implements org.springframework.web.servlet.mvc.Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
//        获取参数
        ModelAndView mv = new ModelAndView();

//        业务

//        储存数据
        mv.addObject("msg","yzy");

        mv.setViewName("hello");


        return mv;
    }
}
