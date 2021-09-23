<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- 
	request 객체 : 사용자(클라이언트)의 요청을 관리하는 객체
	-- 관련 메소드 (자주사용함)
	getContextPath() : 웹 어플리케이션의 컨텍스트 패스를 얻어올 때 사용하는 메소드
	getMethod() : get방식과 post방식을 구분하기 위해서 사용하는 메소드
	getSession() : 세션 객체를 얻을 때 사용하는 메소드
	getProtocol() : 해당 프로토콜을 얻어올 때 사용하는 메소드
	getRequestURL() : 요청한 URL을 얻어올 때 사용하는 메소드
	getRequsetURI() : 요청 URI를 얻어올 때사용하는 메소드
	getQueryString() : 쿼리스트링을 얻어옵니다.
 -->
 <%
 	out.println("서버 : "+request.getServerName()+"<br/>");
 	out.println("포트 : "+request.getServerPort()+"<br/>");
 	out.println("요청방식 : "+request.getMethod()+"<br/>");
 	out.println("프로토콜 : "+request.getProtocol()+"<br/>");
 	out.println("URL : "+request.getRequestURL()+" 프로토콜까지 전체 표현 <br/>");
 	out.println("URI : "+request.getRequestURI()+" 현재위치에서의 해당 파일 위치<br/>");

 	
 %>
</body>
</html>