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
		String id, pw;
	%>
	<%
		id = request.getParameter("id");
		pw = request.getParameter("pw");
		
		// DB�� �̿��ؼ� ȸ�������ϴ� ������ �ʿ��� ������
		// ��Ű�� �̿��ؼ� ȸ�������ϴ� ����� �˾ƺ�����
		// DB�� ȸ���� ���ԵǾ��ٰ� �����ϰ� ��Ű�� �̿��ؼ� ȸ������ �ϴ� ���
		if(id.equals("test")&& pw.equals("1234")){
			Cookie cookie = new Cookie("id",id);
			cookie.setMaxAge(60*2);
			response.addCookie(cookie);
			response.sendRedirect("ex09_1.jsp");
		}else{
			response.sendRedirect("login.html");//�ڹٽ�ũ��Ʈ�� �����丮.go�� �̿��ؼ� -1�� �ٽ� ����������������
		}
	%>
</body>
</html>