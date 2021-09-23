<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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
			<li class="nav-item">
				<a class="nav-link" href="straps.jsp">메인</a>
			</li>
			<li class="nav-item dropdown">
				<a class="nav-link dropdown-toggle" id="dropdown" data-toggle="dropdown">
					회원 관리
				</a>
					<div class="dropdown-menu" aria-labelledby="dropdown">
					<a class="dropdown-item" href="userLogin.jsp">로그인</a>
					<a class="dropdown-item active" href="userJoin.jsp">회원가입</a>
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
	<form method="post" action="./UserRegisterAction.jsp">
		<div class="form-group">
			<label>아이디</label>
			<input type="text" name="userID" class="form-control">
		</div>
		<div class="form-group">
			<label>비밀번호</label>
			<input type="password" name="userPassword" class="form-control">
		</div>
		<div class="form-group">
			<label>이메일</label>
			<input type="Email" name="userEmail" class="form-control">
		</div>
		<button type="submit" class="btn btn-primary">회원 가입</button>
	</form>
	
</section>
<footer class="bg-dark mt-4 p-5 text-center" style="color: #FFFFFF;">
	Copyright &copy; 2021 박순빈 All Rights Reserved.
</footer>
</body>
</html>