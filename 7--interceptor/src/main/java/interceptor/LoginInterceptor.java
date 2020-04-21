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
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        System.out.println("==============login==================");
        //        放行的判断
//        session中有登录信息，但是这个判断会拦截前往登录页面的请求！
        if(session.getAttribute("username")!=null){
            return true;
        }
//      登录页面需要放行
//        出现了一个问题，就是初次登陆的时候我们没有session，那就不能登陆，那么需要再加一个登陆提交的放行
        if(request.getRequestURI().contains("tologin")){
            return true;
        }
//        登陆提交的放行
        if(request.getRequestURI().contains("login")){
            return true;
        }

//        两种判断都没生效，判定没有登录，进入登录界面
        request.getRequestDispatcher("/WEB-INF/JSP/login.jsp").forward(request,response);
        return false;
    }


}
