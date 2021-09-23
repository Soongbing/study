<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%! int age; %>
	<%  String str = request.getParameter("age");
		age = Integer.parseInt(str);
	%>
당신은 <%=age %>살 입니다.
	당신은 성인입니다. 사이트를 이용하실 수 있습니다. <br/>
	<a href = "input_age.html"> 처음으로</a>
</body>
</html>