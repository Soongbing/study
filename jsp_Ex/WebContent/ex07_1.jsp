<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%! String id, pw; %>
<%
	id = request.getParameter("id");
	pw = request.getParameter("pw");
%>
<p> 현재 페이지는 ex07_1 페이지 입니다..</p>
아이디 : <%= id %> <br/>
비밀번호 : <%= pw %> <br/>
</body>
</html>