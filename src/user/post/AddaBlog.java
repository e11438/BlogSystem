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
		    
		    //playersList.add(req.getParameter("post"));
		  /*  
		    out.println("<html>");
		    out.println("<head>");
		    out.println("<title>Posts</title>");
		    out.println("</head>");
		    out.println("<body>");
		   out.println("<table>");
		   out.println("<tr>");
		   out.println("<td>");
		    out.println("Title:");
		    out.println("</td>");
		    out.println("<td>");
		    out.println(title);
		    out.println("</td>");
		    out.println("</tr>");
		    out.println("<br>");
		    out.println("<tr>");
		    out.println("<td>");
		    out.println("</td>");
		    out.println("<td>");
		    out.println("<textarea rows='4' cols='50'>");
		    out.println(msg);
		    out.println("</textarea>");
		    out.println("</td>");
		    out.println("</tr>");
		    out.println("</table>");
		    
		    out.println("<br>");
		    out.println("<br/>");
		    out.println("Date: "+date);
		    out.println("</body>");
		    out.println("</html>");*/
		    
		    request.getSession().setAttribute("date", date);
		    request.getSession().setAttribute("msg", msg);
		    request.getSession().setAttribute("title", title);
		    
		    String contextPath = request.getContextPath();
			//response.sendRedirect("try.jsp");
			response.sendRedirect(response.encodeRedirectURL(contextPath + "/resultOfAddPost.jsp"));

		 

	}

}
