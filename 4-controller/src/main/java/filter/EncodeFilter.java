package filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author YZY
 * @date 2020/4/14 - 22:30
 */
public class EncodeFilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("utf-8");
//      继续往下走，不要中断
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
