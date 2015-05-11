package user.post;

import user.clses.*;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddaBlog
 */
@WebServlet("/AddaBlog")
public class AddaBlog extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Date date = new Date();
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().println("Your post is added to  adding process....");
		
		 WriteFile file = new WriteFile(); // create class object
		    response.setContentType("text/html");

		    PrintWriter out = response.getWriter();

		    String msg = request.getParameter("post");
		    
		    String title = request.getParameter("title");
		    
		    
		    file.writeFile(title,msg);
		    
		  		    
		    request.getSession().setAttribute("date", date);
		    request.getSession().setAttribute("msg", msg);
		    request.getSession().setAttribute("title", title);
		    
		    String contextPath = request.getContextPath();
			//response.sendRedirect("try.jsp");
			response.sendRedirect(response.encodeRedirectURL(contextPath + "/resultOfAddPost.jsp"));

		 

	}

}
