<%@ page import ="java.util.Enumeration" %>
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
   out.println("---------- getAttribute() �޼ҵ� ��� ��� -----------"+"<br/>");
	Object idObj = session.getAttribute("id");
	String id = (String)idObj;
	out.println(id+"<br/>");
	
	Object pwObj = session.getAttribute("password");
	String pw = (String)pwObj; //���ڷ� �����Ÿ� Integer�ص� �Ǵµ� ���� ���ڿ� ���� ���ļ� ó���ϴ� ��찡 ������ ���ڷ� �޴°� ����
	out.println(pw+"<br/>");
	
	out.println("---------- getAttribute() �޼ҵ� ��� ��� -----------"+"<br/>");
	
	String sName, sValue; //���� �̸��� ���� ���� ������
	Enumeration enumeration = session.getAttributeNames();//�ڹ��� �÷��� ���� ����
	//Enumeration�� �÷����� ���������� ���� ����ߴ� ��ü�� �ݺ��ؼ� ���������� ����ߴ� ��ü �ֱٿ� ����Ʈ�� �̿� ���� �����ܿ� ���� ��������
	while(enumeration.hasMoreElements()){ //enumeration.hasMoreElements ���������� ���Ǵ� �޼ҵ�
		sName = enumeration.nextElement().toString();
		sValue = session.getAttribute(sName)+"";
		out.println("���ǳ��� :"+sName+"<br/>");
		out.println("���� �� :"+sValue+"<br/>");
	}
	out.println("---------- getId() �޼ҵ� ��� ��� -----------"+"<br/>");
	String sID = session.getId();
	out.println("���� ID :"+sID+"<br/>");
	int sInterval = session.getMaxInactiveInterval(); //��ȿ�ð�
	out.println("���� ��ȿ�ð�"+sInterval+"<br/>");
	
	out.println("---------- removeAttribute() �޼ҵ� ��� ��� -----------"+"<br/>");
	session.removeAttribute("id");
	Enumeration enumeration_1 = session.getAttributeNames();
	while(enumeration_1.hasMoreElements()){
		sName = enumeration_1.nextElement().toString();
		sValue = session.getAttribute(sName).toString();
		out.println("���ǳ��� :"+sName+"<br/>");
		out.println("���� �� :"+sValue+"<br/>");
	}
	out.println("---------- invalidate() �޼ҵ� ��� ��� -----------"+"<br/>");
	//session.invalidate();
	
	if(request.isRequestedSessionIdValid()){
		out.println("��ȿ�� ���� �ֽ��ϴ�..");
	}else{
		out.println("��ȿ�� ������ �����ϴ�..");
	}

	
%>
</body>
</html>