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
				cookies[i].setMaxAge(0); //��ȿ�Ⱓ�� ������Ե� ��ü�� ���ͼ� ��Ű�� ���� �Ӽ��� �������� �ٲٰ� �� �� 
				response.addCookie(cookies[i]); //��Ű�� ����� ���ؼ� ������������ �������ϱ⿡ �����ǽ��� ž�����ִ� ������ �ʿ���
				//1. ������ �ϰԵǸ�
				//2. ž�縦 �ؾ���
			}
		}
	%>
	<form method="post" action="ex08_3.jsp">
	<input type=submit value="��ŰȮ��">
	</form>
</body>
</html>