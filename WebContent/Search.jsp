<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.io.*,java.util.HashMap,java.util.*" import="user.clses.ReadFile"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%String goods=request.getParameter("item");
String str =ReadFile.readFile("\\Posts\\"+goods+".txt");
%>
<%=str  %>

<FORM><INPUT Type="button" VALUE="Back" onClick="history.go(-1);return true;"><br>
</FORM>

</body>
</html>