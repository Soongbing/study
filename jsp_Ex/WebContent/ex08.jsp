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
//1. ��Ű ����
	String cookieName = "id";
	Cookie cookie = new Cookie(cookieName,"test");//��Ű �̸��� �� ������ �̷����
//2. ��Ű �Ӽ� ����
	cookie.setMaxAge(60*30); //�ִ� ���� 60���̱� ������ ���ϱ�� �ð� ���� *30�� 30���̶�� ��, ��ȿ�Ⱓ ����
//3. ��Ű�� ����
	response.addCookie(cookie);
%>
<h2>��Ű�� �����ϴ� ������</h2>
"<%=cookieName %>" ��Ű�� �����Ǿ����ϴ�...<br/>
<form method="post" action="ex08_1.jsp">
<input type="submit" value="������ ��Ű Ȯ��"/>
</form>
</body>
</html>