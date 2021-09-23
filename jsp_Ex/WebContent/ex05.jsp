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
	response 객체 메소드
	getCCharaccterEncoding() : 응답할 때 문자 인코딩을 얻어올 때 (응답할 때 어떤 인코딩 문자 사용할 것인지)
	addCookie(Cookie) : 쿠키를 지정할 때 사용
	sendRedirect(URL): 이동하고자 하는 URL을 지정할 때 사용
	- ex) 하나의 html 파일에서 리퀘스트를 받아서 처리해주는 jsp파일에서 따로따로 처리하고 자 하는 부분이 있을 때 (id는 b.jsp에서 pw는 c.jsp에서 처리하고싶을 때)
	      - 성인일 경우 b페이지 청소년일 경우 c페이지 등등 분기별로 처리 가능
 -->
 <%! int age; %>
 <%
 	String str = request.getParameter("age"); //값이 문자열로 넘어오기때문에 문자열로 받아야함
 	age = Integer.parseInt(str); //조건문으로 비교하기위해 넘어온 문자열을 숫자로 변환시켜줌
 	
 	if(age>=19){
 		response.sendRedirect("a.jsp?age="+age); //?를 사용하면 get방식으로 전송을 하게됨
 	}else{
 		response.sendRedirect("b.jsp?age"+age); // ?를 사용하면 age라는 넘어간 페이지에서 변수를 그대로 사용할 수 있게됨
 	}
 %>
 
 <%=age %>
</body>
</html>