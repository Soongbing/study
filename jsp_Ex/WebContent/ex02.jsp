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
	// ���� xǥ�� ���͵� �� �۵���.
%>
 -->

<%! //������ �޼ҵ带 ������ �� ����ϴ� �±�
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
<!-- ǥ����(expression) : ������ ���̳� �޼ҵ��� ������� ����� �� ����Ѵ�. 
ǥ������ ������� Stirng Ÿ���Դϴ�.
;�� ����� �� ����.
 -->
i= <%=i %><br/> 
str = <%=str %><br/>
hap = <%=hap(10,2) %><br/>
</body>
</html>