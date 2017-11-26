package servletTest;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Demo4Servlet")
public class Demo4Servlet extends HttpServlet {



	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request.setAttribute("username", "ffff");
		//request.getRequestDispatcher("/demo.jsp").forward(request, response);
		
		ServletContext sContext=  request.getServletContext();
		sContext.setAttribute("goods", "fasasasasf");
		response.sendRedirect("/servletTest/demo.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
