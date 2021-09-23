<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="javax.mail.Transport" %> 
<%@ page import="javax.mail.Message" %> 
<%@ page import="javax.mail.Address" %> 
<%@ page import="javax.mail.internet.InternetAddress" %> 
<%@ page import="javax.mail.internet.MimeMessage" %> 
<%@ page import="javax.mail.Session" %> 
<%@ page import="javax.mail.Authenticator" %> 
<%@ page import="java.util.Properties" %> <!-- 속성을 정의하는 라이브러리 매우 유용하다함 -->
<%@ page import="user.UserDAO" %>    
<%@ page import="util.SHA256" %>   
<%@ page import="util.Gmail" %>    
<%@ page import="java.io.PrintWriter" %> <!-- 이건 특정한 스크립트 구문을 출력하고자 할때 사용 -->

<%
	UserDAO userDAO = new UserDAO();
	String userID = null; //널값이 들어가있다가
	if(session.getAttribute("userID") !=null ){ //사용자가 로그인  한 상태 즉 session 값이 유효한 상태일 때
		userID = (String) session.getAttribute("userID"); //유저id에는 해당 세션값을 넣어주면 됨.
	}	
	if(userID == null){
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('로그인을 해주세요.');");
		script.println("location.href='userLogin.jsp'");
		script.println("</script>");
		script.close();
		return;

	}
	
	boolean emailChecked = userDAO.getUserEmailChecked(userID);
	if(emailChecked == true){
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('이미 인증 된 회원입니다.');");
		script.println("location.href='straps.jsp'"); //다시 뒷쪽으로 보내주는 함수
		script.println("</script>");
		script.close();
		return;
	}
	
	String host = "http://localhost:8181/boot/";
	String from = "qkqldyd02@gmail.com";//자신의 구글 이메일 계정
	String to = userDAO.getUserEamil(userID);
	String subject = "강의평가를 위한 인증메일입니다.";
	String content = "다음 링크에 접속하여 이메일 인증을 진행하세요" + 
					 "<a href='"+host+"emailCheckAction.jsp?code=" + new SHA256().getSHA256(to) + "'>이메일 인증하기</a>";
	
	//실제로 smtp에 접속하기 위한 정보들 시작
	Properties p = new Properties(); //여기서부터 구글의 smtp 서비스를 이용하기 위한 코드
	p.put("mail.smtp.user", from);
	p.put("mail.smtp.host", "smtp.googleemail.com"); //호스트는 구글에서 제공하는 smtp 서버를 넣어주면됨
	p.put("mail.smtp.port", "465"); //포트는 465
	p.put("mail.smtp.starttles.enable","true"); //
	p.put("mail.smtp.starttles.enable","true"); //
	p.put("mail.smtp.auth","true"); //
	p.put("mail.smtp.debug","true"); //
	p.put("mail.smtp.socketFactory.port","465"); //
	p.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory"); //
	p.put("mail.smtp.socketFactory.fallback","false"); //

	// ----이메일 전송하는 부분 시작 ---
	try{
		Authenticator auth = new Gmail();
		Session ses = Session.getInstance(p, auth);
		ses.setDebug(true);
		MimeMessage msg = new MimeMessage(ses);
		msg.setSubject(subject);
		Address fromAddr = new InternetAddress(from);
		msg.setFrom(fromAddr);
		Address toAddr = new InternetAddress(to);
		msg.addRecipient(Message.RecipientType.TO, toAddr);
		msg.setContent(content, "text/html;charset=UTF8"); //메일 안에 담길 내용을 이런 형식으로 셋팅
		Transport.send(msg); //전송
		return;
	} catch(Exception e){
		e.printStackTrace();
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('오류가 발생했습니다.');");
		script.println("history.back();");
		script.println("</script>");
		script.close();
		return;

	}
%>

<!DOCTYPE html>
<head>

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" 
href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" >
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
<title>강의평가 웹 사이트</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
	<a class="navbar-brand" href="straps.jsp">강의평가 웹 사이트</a>
	<button class="navbar-toggler"type="button" data-toggle="collapse" data-target="#navbar">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div id="navbar" class="collapse navbar-collapse">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item active">
				<a class="nav-link" href="straps.jsp">메인</a>
			</li>
			<li class="nav-item dropdown">
				<a class="nav-link dropdown-toggle" id="dropdown" data-toggle="dropdown">
					회원 관리
				</a>
				<div class="dropdown-menu" aria-labelledby="dropdown">
				<a class="dropdown-item" href="userLogin.jsp">로그인</a>
					<a class="dropdown-item" href="userJoin.jsp">회원가입</a>
					<a class="dropdown-item" href="userLogout.jsp">로그아웃</a>
				</div>
			</li>
		</ul>
		<form class="form-inline my-2 my-lg-0">
			<input class="form-control mr-sm-2" type="search" placeholder="내용을 입력하세요." aria-label="Seach">
			<button class="btn btn-outline-success my-2 my-sm-0" type="submit">
				검색
			</button>
		</form>
	</div>
</nav>
<section class="container mt-3" style="max-width: 560px;">
	<div class="alert alert-success mt-4" role="alert">
		이메일 주소 인증 메일이 전송되었습니다. 입력하신 이메일로 들어가 인증을 해주세요.
	</div>
</section>
<footer class="bg-dark mt-4 p-5 text-center" style="color: #FFFFFF;">
	Copyright &copy; 2021 박순빈 All Rights Reserved.
</footer>
</body>
</html>