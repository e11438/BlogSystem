package user.post;

import java.io.IOException;

import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import user.clses.Comment;

/**
 * Servlet implementation class StoreComments
 */
@WebServlet("/StoreComments")
public class StoreComments extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static ArrayList<Comment> cmList = new ArrayList<Comment>();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			
		 String name = request.getParameter("name");		    
		 String comment = request.getParameter("comment");
		 
		 String title = request.getParameter("title");		    
		 String fileName = request.getParameter("fileName");
		// System.out.println(title+" "+fileName); 
		 
		 Comment cm = new Comment(fileName,title,name,comment);
		 cmList.add(cm);
		 response.getWriter().println("Your Comment was added to buffer.....");
		 response.getWriter().println("If it is relevent it will be added by admin...");
		 response.getWriter().println("<h4>Thank You...</h4>");
		 
		    
	}
	public static ArrayList<Comment> getList(){
		return cmList;
	}
	
	
}
