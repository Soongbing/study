<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "java.util.Arrays" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- 
	request 객체의 관련 메소드(파라미터 메소드) (가장 많이 사용하는 메소드)
	
	getParameter(String name) : name에 해당하는 파라미터의 값을 구할 때 사용 (value 값)
	getParameterNames() : 모든 파라미터의 이름을 얻어올 때 사용한다. (파라미터 이름모를때 다가져와서 확인 가능)
	getParameterValues(String name) : name에 해당하는 파라미터의 값들을 얻어올 수 있다. (반환 타입은 배열)
	
 -->
 <%!
 	String name, id, pw, gender, local;
 	String [] hobbys;
 %>
 
 <%
 	request.setCharacterEncoding("EUC-KR"); //받아올 인코딩 페이지의 문자셋 설정
 											//request는 jsp 내장 객체이기 때문에 객체생성 없이 사용 가능
	name = request.getParameter("name");
 	id = request.getParameter("id");
 	pw = request.getParameter("pw");
 	gender = request.getParameter("gender");
 	local = request.getParameter("local");
 	
 	hobbys = request.getParameterValues("hobby");
 %>
 
 이름 : <%=name %> <br/>
 아이디 : <%=id %> <br/>
 비밀번호 : <%=pw %> <br/>
 성별 : <%=gender %> <br/>
 취미 : <%=Arrays.toString(hobbys) %>
 지역 : <%=local %>
 
</body>
</html>