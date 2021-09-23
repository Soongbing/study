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
   out.println("---------- getAttribute() 메소드 사용 결과 -----------"+"<br/>");
	Object idObj = session.getAttribute("id");
	String id = (String)idObj;
	out.println(id+"<br/>");
	
	Object pwObj = session.getAttribute("password");
	String pw = (String)pwObj; //숫자로 받을거면 Integer해도 되는데 보통 숫자와 문자 합쳐서 처리하는 경우가 많으니 문자로 받는게 맞음
	out.println(pw+"<br/>");
	
	out.println("---------- getAttribute() 메소드 사용 결과 -----------"+"<br/>");
	
	String sName, sValue; //세션 이름과 값을 얻어오 기위해
	Enumeration enumeration = session.getAttributeNames();//자바의 컬렉션 내용 참고
	//Enumeration은 컬렉션이 나오기전에 많이 사용했던 객체를 반복해서 돌리기위해 사용했던 객체 최근엔 리스트를 이용 보통 구구단에 많이 남아있음
	while(enumeration.hasMoreElements()){ //enumeration.hasMoreElements 공식적으로 사용되는 메소드
		sName = enumeration.nextElement().toString();
		sValue = session.getAttribute(sName)+"";
		out.println("세션네임 :"+sName+"<br/>");
		out.println("세션 값 :"+sValue+"<br/>");
	}
	out.println("---------- getId() 메소드 사용 결과 -----------"+"<br/>");
	String sID = session.getId();
	out.println("세션 ID :"+sID+"<br/>");
	int sInterval = session.getMaxInactiveInterval(); //유효시간
	out.println("세션 유효시간"+sInterval+"<br/>");
	
	out.println("---------- removeAttribute() 메소드 사용 결과 -----------"+"<br/>");
	session.removeAttribute("id");
	Enumeration enumeration_1 = session.getAttributeNames();
	while(enumeration_1.hasMoreElements()){
		sName = enumeration_1.nextElement().toString();
		sValue = session.getAttribute(sName).toString();
		out.println("세션네임 :"+sName+"<br/>");
		out.println("세션 값 :"+sValue+"<br/>");
	}
	out.println("---------- invalidate() 메소드 사용 결과 -----------"+"<br/>");
	//session.invalidate();
	
	if(request.isRequestedSessionIdValid()){
		out.println("유효한 세션 있습니다..");
	}else{
		out.println("유효한 세션이 없습니다..");
	}

	
%>
</body>
</html>