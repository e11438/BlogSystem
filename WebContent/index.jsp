<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.io.*,java.util.HashMap,java.util.*" import="user.clses.ReadFile" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<script type="text/javascript" src="load.js"></script>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
	
	
		<h1>Star Bloggers</h1>
		
		<form action="userFiles/logged.html" method="POST">    
        	<input type="submit" value="Login">
    	 </form> &nbsp
		<a href="./adminPanel.html">Admin Panel</a>
		<div id="blog1"></div>
		<div id="blog2"></div>
		
		
		<%String search="asdadsfdsf"; %>
		<a href="Search.jsp?item=<%=search%>">go link</a>
		<br>
		<br>
		
		<%String str =ReadFile.readFile("postDetails.txt");		
			if(str.length()>5){
				HashMap<String,String> posts = ReadFile.firstTen();
				
				Iterator it = posts.entrySet().iterator();		
				
				 while (it.hasNext()) {
				        Map.Entry pair = (Map.Entry)it.next();
				        out.println(pair.getKey()+" - "+pair.getValue()+"<br>");
				        it.remove(); // avoids a ConcurrentModificationException
				    }
			
			}
		%>
		
		
	
	</body>
</html>