package servletTest;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username + "   " + password);
		if("f".equals(username)&&"1".equals(password)) {
			request.getRequestDispatcher("/success.jsp").forward(request, response);
			//response.sendRedirect("/servletTest/success.jsp");
		}else {
			//request.getRequestDispatcher("/fail.jsp").forward(request, response);
			response.sendRedirect("/servletTest/fail.jsp");
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
