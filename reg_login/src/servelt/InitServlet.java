package servelt;

import java.util.List;
import java.util.ArrayList;
import com.fyb.domain.User;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;



public class InitServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		List<User> list = new ArrayList<User>();
		
		this.getServletContext().setAttribute("list", list);
		
		
	}
	

}
