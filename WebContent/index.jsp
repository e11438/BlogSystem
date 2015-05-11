<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.io.*,java.util.HashMap,java.util.*" import="user.clses.ReadFile" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<script type="text/javascript" src="load.js"></script>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>StarBloggers</title>
		<%="<link rel=\"stylesheet\" type=\"text/css\" href=\"screen.css\"  />" %>
		
	</head>
	<body>
	
	
		<h1>Star Bloggers</h1>
		
		<form action="userFiles/logged.jsp" method="POST">    
        	<input type="submit" value="Login">
    	 </form> 
		<a href="./adminPanel.html">Admin Panel</a>
		<br>
		<br>
		<br>
		
		
				
		<%String str =ReadFile.readFile("postDetails.txt");		
			if(str.length()>5){
				HashMap<String,String> posts = ReadFile.firstTen();
				
				Iterator it = posts.entrySet().iterator();		
				
				 while (it.hasNext()) {
				        Map.Entry pair = (Map.Entry)it.next();
				        
		%>
		
		<h3><a href="Search.jsp?item=<%=pair.getValue()%>&title=<%=pair.getKey() %>" style="text-decoration: none"><%=pair.getKey()%></a></h3>
		<br>
		
		
		<br>
		
				        
		<%
				        it.remove(); // avoids a ConcurrentModificationException
				    }
			
			}
		%>
		
		
	
	</body>
</html>