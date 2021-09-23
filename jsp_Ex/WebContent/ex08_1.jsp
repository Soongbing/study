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
	
	for(int i=0;i<cookies.length;i++){
		String str = cookies[i].getName();
	if(cookies !=null){
		if(str.equals("id")){
			out.println("cookies["+i+"] name : "+ cookies[i].getName()+"<br/>");
			out.println("cookies["+i+"] value : "+ cookies[i].getValue()+"<br/>");
		}
	}
}
%>
<form method="post" action="ex08_2.jsp">
<input type="submit" value="쿠키 삭제"/>
</form>
</body>
</html>