package user.post;

import java.io.IOException;
import java.util.HashMap;

import user.clses.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditBlog
 */
@WebServlet("/EditBlog")
public class EditBlog extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String title=request.getParameter("title");
		
		HashMap<String,String> fileMap = ReadFile.firstTen();
		String fileName=fileMap.get(title);
		String content = ReadFile.readFile("\\Posts\\"+fileName+".txt");
		
		request.getSession().setAttribute("title", title);
		request.getSession().setAttribute("content", content);
		  
		  
		  
		    String contextPath = request.getContextPath();
			//response.sendRedirect("try.jsp");
			response.sendRedirect(response.encodeRedirectURL(contextPath + "/resultOfEditPost.jsp"));
	}

}
