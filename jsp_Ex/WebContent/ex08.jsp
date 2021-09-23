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
//1. 쿠키 생성
	String cookieName = "id";
	Cookie cookie = new Cookie(cookieName,"test");//쿠키 이름과 값 쌍으로 이루어짐
//2. 쿠키 속성 설정
	cookie.setMaxAge(60*30); //최대 설정 60초이기 때문에 곱하기로 시간 설정 *30은 30분이라는 뜻, 유효기간 설정
//3. 쿠키의 전송
	response.addCookie(cookie);
%>
<h2>쿠키를 생성하는 페이지</h2>
"<%=cookieName %>" 쿠키가 생성되었습니다...<br/>
<form method="post" action="ex08_1.jsp">
<input type="submit" value="생성된 쿠키 확인"/>
</form>
</body>
</html>