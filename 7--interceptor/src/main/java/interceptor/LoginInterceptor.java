package interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author YZY
 * @date 2020/4/18 - 23:37
 */
public class LoginInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler, HttpSession session) throws Exception {
        System.out.println("login---");
        //        放行的判断
//        session中有登录信息，但是这个判断会拦截前往登录页面的请求！
        if(session.getAttribute("username")!=null){
            return true;
        }
//      登录页面需要放行
        if(request.getRequestURI().contains("tologin")){
            return true;
        }
        return false;
    }


}
