<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("password");
	
	session.setAttribute("id", id);
	session.setAttribute("password",pw);
%>

id客 password 技记 加己 汲沥 肯丰 <br/>

 <script>
 	location.href="ex10_1.jsp";
 </script>
</body>
</html>