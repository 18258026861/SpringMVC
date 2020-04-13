package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author YZY
 * @date 2020/4/13 - 16:22
 */
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        1.获取前端参数
        String msg = req.getParameter("msg");
        if("add"==msg){
            req.getSession().setAttribute("msg","use-add");
        }
        if("delete"==msg){
            req.getSession().setAttribute("msg","use-delete");
        }
//        2.调用业务层

//        3.视图转发或重定向
       req.getRequestDispatcher("show.jsp").forward(req,resp);
//       resp.sendRedirect("show.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);

    }
}
