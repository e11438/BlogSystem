<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String title =(String)session.getAttribute("title");   %>

<form action="updatePost" method="POST">
     Title: 
     	<input type="text" size="100" name="title" value="<%=title%>"><br><br>
         <textarea rows="4" cols="50" name="post">
         </textarea> <br><br>
        <input type="submit" value="Post">
     </form> 

</body>
</html>