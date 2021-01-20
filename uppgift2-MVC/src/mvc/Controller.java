package mvc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String uname = request.getParameter("uname");
        String password = request.getParameter("password");

        ModelBean bean = new ModelBean();
        
        request.setAttribute("bean", bean);
        
        bean.setName(uname);
        bean.setPassword(password);
        
        bean.setListOfUsernames("admin");
        bean.setListOfPasswords("123");
        bean.setListOfUsernames("hej");
        bean.setListOfPasswords("1234");
        
        boolean status = bean.validate();
        
        
        Cookie ck = new Cookie("user", uname);
        ck.setMaxAge(1800);
        response.addCookie(ck);
        
        if (status) {
            RequestDispatcher rd = request.getRequestDispatcher("login-success.jsp");
            rd.forward(request, response);
        } else {
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");

            PrintWriter out= response.getWriter();
            out.println("<font color=red>Either username or password is wrong.</font>");
            
            rd.include(request, response);
        }
    }
}
