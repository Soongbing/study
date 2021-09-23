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
<%
	int i = 0;
	while(true){
		i++;
		out.println("5 *"+i+"="+i*5+"<br/>");
	
%>
	----<br/>
<%
	if(i >=9) break;
	}
	// 빨간 x표시 나와도 잘 작동됨.
%>
 -->

<%! //변수나 메소드를 선언할 때 사용하는 태그
	int i = 100; 
	String str = "test";

	public int hap(int a, int b){
	return a+b;
}
%>

<%
	out.println("i = "+i+"<br/>");
	out.println("str = "+str+"<br/>");
	out.println("hap = "+hap(2,10)+"<br/>");

%>
------
<!-- 표현식(expression) : 변수의 값이나 메소드의 결과값을 출력할 때 사용한다. 
표현식의 결과값은 Stirng 타입입니다.
;는 사용할 수 없다.
 -->
i= <%=i %><br/> 
str = <%=str %><br/>
hap = <%=hap(10,2) %><br/>
</body>
</html>