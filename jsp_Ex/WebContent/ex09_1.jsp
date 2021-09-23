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
		Cookie[] cookies = request.getCookies();
	
		for(int i=0; i<cookies.length;i++){
			String id = cookies[i].getValue();
			if(id.equals("test")){
				out.println(id+"님 로그인 되었습니다."+"<br/>");
			}
		}
	%>
	<a href = "ex09_2.jsp">로그아웃</a>
	
</body>
</html>