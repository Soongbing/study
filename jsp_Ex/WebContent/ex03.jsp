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
	request ��ü : �����(Ŭ���̾�Ʈ)�� ��û�� �����ϴ� ��ü
	-- ���� �޼ҵ� (���ֻ����)
	getContextPath() : �� ���ø����̼��� ���ؽ�Ʈ �н��� ���� �� ����ϴ� �޼ҵ�
	getMethod() : get��İ� post����� �����ϱ� ���ؼ� ����ϴ� �޼ҵ�
	getSession() : ���� ��ü�� ���� �� ����ϴ� �޼ҵ�
	getProtocol() : �ش� ���������� ���� �� ����ϴ� �޼ҵ�
	getRequestURL() : ��û�� URL�� ���� �� ����ϴ� �޼ҵ�
	getRequsetURI() : ��û URI�� ���� ������ϴ� �޼ҵ�
	getQueryString() : ������Ʈ���� ���ɴϴ�.
 -->
 <%
 	out.println("���� : "+request.getServerName()+"<br/>");
 	out.println("��Ʈ : "+request.getServerPort()+"<br/>");
 	out.println("��û��� : "+request.getMethod()+"<br/>");
 	out.println("�������� : "+request.getProtocol()+"<br/>");
 	out.println("URL : "+request.getRequestURL()+" �������ݱ��� ��ü ǥ�� <br/>");
 	out.println("URI : "+request.getRequestURI()+" ������ġ������ �ش� ���� ��ġ<br/>");

 	
 %>
</body>
</html>