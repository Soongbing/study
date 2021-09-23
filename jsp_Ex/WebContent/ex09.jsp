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
		String id, pw;
	%>
	<%
		id = request.getParameter("id");
		pw = request.getParameter("pw");
		
		// DB를 이용해서 회원인증하는 과정이 필요함 원래는
		// 쿠키를 이용해서 회원인증하는 방법을 알아볼거임
		// DB에 회원이 가입되었다고 가정하고 쿠키를 이용해서 회원인증 하는 방법
		if(id.equals("test")&& pw.equals("1234")){
			Cookie cookie = new Cookie("id",id);
			cookie.setMaxAge(60*2);
			response.addCookie(cookie);
			response.sendRedirect("ex09_1.jsp");
		}else{
			response.sendRedirect("login.html");//자바스크립트의 히스토리.go를 이용해서 -1로 다시 돌려보낼수도있음
		}
	%>
</body>
</html>