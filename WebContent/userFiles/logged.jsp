<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" import="user.post.StoreComments,user.clses.Comment"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Logged in....</title>
</head>
<body>

you are logged in...<br><br>

<a href="./new_post.html">add a Post</a><br>
<a href="./edit_post.html">edit a post</a><br>
<br><br><br>
<h4>Comments need to be authenticated....</h4>
<hr>

<%
ArrayList<Comment> cmList=StoreComments.getList();

for(int i=0;i<cmList.size();i++){
	
	String comment =cmList.get(i).comment;
	String name =cmList.get(i).name;
	String title =cmList.get(i).title;
	String fileName=cmList.get(i).fileName;
%>	
	<%=title %><br>
	Commented by : <%=name %><br>
	<%=comment %><br>	
		<br>
		
		
		<form action="authComment" method="POST">     	
         <input type="hidden" name="fileName" value="<%=fileName%>">
         <input type="hidden" name="name" value="<%=name%>">
          <input type="hidden" name="comment" value="<%=comment%>">
          <input type="hidden" name="title" value="<%=title%>">
        <input type="submit" value="Add">
     </form> 
		<hr>
<%	
}
%>

</body>
</html>