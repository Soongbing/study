<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="user.UserDTO" %>    
<%@ page import="user.UserDAO" %>    
<%@ page import="util.SHA256" %>    
<%@ page import="java.io.PrintWriter" %> <!-- 이건 특정한 스크립트 구문을 출력하고자 할때 사용 -->

<%
	request.setCharacterEncoding("UTF-8"); //사용자로부터 입력받은 요청전부는 전부 다 UTF-8로 처리
	String userID = null; //1.사용자가
	String userPassword = null; //2. 회원가입 시 입력할
	String userEmail = null; //3. 내용은 총 세가지
	if(request.getParameter("userID")!=null){
		userID = request.getParameter("userID");
	}
	if(request.getParameter("userPassword")!=null){
		userID = request.getParameter("userPassword");
	}
	if(request.getParameter("userEmail")!=null){
		userID = request.getParameter("userEmail");
	}
	if(userID == null || userPassword == null || userEmail == null){ //한가지라도 뺴먹었을 경우
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('입력이 안 된 사항이 있습니다.');");
		script.println("history.back();"); //다시 뒷쪽으로 보내주는 함수
		script.println("</script>");
		script.close();
		return;
	}
	UserDAO userDAO = new UserDAO();
	int result = userDAO.join(new UserDTO(userID, userPassword, userEmail, SHA256.getSHA256(userEmail),false));
	if(result == -1){ //가입이 안됐을 때.
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('이미 존재하는 아이디 입니다..');");
		script.println("history.back();"); //다시 뒷쪽으로 보내주는 함수
		script.println("</script>");
		script.close();
		return;
	} else { //가입 됐을 때
		session.setAttribute("userID", userID); //로그인 시켜주는 값
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("location.href = 'emailSendAcciton2.jsp'"); //회원가입을 하자마자 이메일 인증페이지로 보내줌
		script.println("</script>");
		script.close();
		return;
	}

%>