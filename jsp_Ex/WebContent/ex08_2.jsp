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
			String str = cookies[i].getName();
			
			if(str.equals("id")){
				out.println("name :"+cookies[i].getName()+"<br/>");
				out.println("name :"+cookies[i].getValue()+"<br/>");
				cookies[i].setMaxAge(0); //유효기간이 사라지게됨 객체로 얻어와서 쿠키에 대한 속성을 서버에서 바꾸고 난 것 
				response.addCookie(cookies[i]); //쿠키를 지우기 위해선 웹브라우저에서 지워야하기에 리스판스에 탑재해주는 과정이 필요함
				//1. 수정을 하게되면
				//2. 탑재를 해야함
			}
		}
	%>
	<form method="post" action="ex08_3.jsp">
	<input type=submit value="쿠키확인">
	</form>
</body>
</html>