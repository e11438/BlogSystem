<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.io.*,java.util.HashMap,java.util.*" import="user.clses.ReadFile"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%String fileName=request.getParameter("item");
String title=request.getParameter("title");
String str =ReadFile.readFile("\\Posts\\"+fileName+".txt");
%>
<%=str  %>

<FORM><INPUT Type="button" VALUE="Back" onClick="history.go(-1);return true;"><br>
</FORM>
<hr>
<h4>Comments</h4>

<form action="addComment" method="POST">
     Make a Comment: <br><br>
     Your Name:
     	<input type="text" size="50" name="name"><br><br>
         <textarea rows="4" cols="50" name="comment">         
         </textarea> <br><br>
         <input type="hidden" name="fileName" value="<%=fileName%>">
         <input type="hidden" name="title" value="<%=title%>">
        <input type="submit" value="Post">
     </form> 

</body>
</html>