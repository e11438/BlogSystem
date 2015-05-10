<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Post added.....!</title>
</head>
<body>
<%  String post =(String)session.getAttribute("msg");  
String title =(String)session.getAttribute("title");  
Date date =(Date)session.getAttribute("date");  
%>

<h3><%= title  %></h3><br><br>

<textarea rows='4' cols='50'><%= post %> </textarea><br><br>

<%= date %>


<FORM><INPUT Type="button" VALUE="Home" onClick="history.go(-2);return true;"><br>
</FORM>

</body>
</html>