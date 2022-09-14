

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
        PrintWriter out=response.getWriter();  

		String usename=request.getParameter("username");
		String password=request.getParameter("password");
		
		if (LoginDAO.validate(usename, password)) {
			
			response.sendRedirect("/LoginPage/success.jsp");

		} else {
			out.println("Login inválido");
			RequestDispatcher rd=request.getRequestDispatcher("input.jsp");
			rd.include(request, response);
		}
	}

}
