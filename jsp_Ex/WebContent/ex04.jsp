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
	request ��ü�� ���� �޼ҵ�(�Ķ���� �޼ҵ�) (���� ���� ����ϴ� �޼ҵ�)
	
	getParameter(String name) : name�� �ش��ϴ� �Ķ������ ���� ���� �� ��� (value ��)
	getParameterNames() : ��� �Ķ������ �̸��� ���� �� ����Ѵ�. (�Ķ���� �̸��𸦶� �ٰ����ͼ� Ȯ�� ����)
	getParameterValues(String name) : name�� �ش��ϴ� �Ķ������ ������ ���� �� �ִ�. (��ȯ Ÿ���� �迭)
	
 -->
 <%!
 	String name, id, pw, gender, local;
 	String [] hobbys;
 %>
 
 <%
 	request.setCharacterEncoding("EUC-KR"); //�޾ƿ� ���ڵ� �������� ���ڼ� ����
 											//request�� jsp ���� ��ü�̱� ������ ��ü���� ���� ��� ����
	name = request.getParameter("name");
 	id = request.getParameter("id");
 	pw = request.getParameter("pw");
 	gender = request.getParameter("gender");
 	local = request.getParameter("local");
 	
 	hobbys = request.getParameterValues("hobby");
 %>
 
 �̸� : <%=name %> <br/>
 ���̵� : <%=id %> <br/>
 ��й�ȣ : <%=pw %> <br/>
 ���� : <%=gender %> <br/>
 ��� : <%=Arrays.toString(hobbys) %>
 ���� : <%=local %>
 
</body>
</html>