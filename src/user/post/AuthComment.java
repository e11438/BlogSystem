package user.post;

import java.io.IOException;
import java.util.ArrayList;

import user.clses.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AuthComment
 */
@WebServlet("/AuthComment")
public class AuthComment extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 String name = request.getParameter("name");		    
		 String comment = request.getParameter("comment");
		 String fileName = request.getParameter("fileName");
		 String title = request.getParameter("title");
		 
		 ArrayList<Comment> cmList= StoreComments.getList();
		 for(int i=0;i<cmList.size();i++){
			 String c =cmList.get(i).comment;
				String n =cmList.get(i).name;
				String t =cmList.get(i).title;
				String fn=cmList.get(i).fileName;
				if(c.equals(comment)&&n.equals(name)&&t.equals(title)&&fn.equals(fileName)){
					cmList.remove(i);
					break;
				}
			 
		 }
		 comment=comment+"<br>===================================";
		 
		 WriteFile.writeComment(name, comment, fileName);
		 
		 //redirect to logged in page
		 String contextPath = request.getContextPath();
			//response.sendRedirect("try.jsp");
			response.sendRedirect(response.encodeRedirectURL(contextPath + "/userFiles/logged.jsp"));
		    
	}

}
