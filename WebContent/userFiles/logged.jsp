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
	
	<h5><a href="authComment?fileName=<%=fileName%>&name=<%=name %>&comment=<%=comment %>" style="text-decoration: none">Add comment</a></h5>
		<br>
		<hr>
<%	
}
%>

</body>
</html>