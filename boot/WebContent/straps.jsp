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
<section class="container"><!-- 섹션태그는 HTML5구성요소 본문내용을 담을때 사용 --> 
<!-- 컨테이너 클래스는 반응형으로 특정한 요소가 알아서 작아지도록 도움줌  -->
	<form method="get" action="./index.jsp" class="form-inline mt-3">
		<select name="lectureDivide" class="form-control mx-1 mt-2">
			<option value="전체">전치</option>
			<option value="전공">전공</option>
			<option value="교양">교양</option>
			<option value="기타">기타</option>
		</select>
		<input type="text" name="search" class="form-control mx-1 mt-2" placeholoder="내용을 입력하세요">
		<button class="btn btn-primary mx-1 mt-2" type="submit">검색</button>
		<a class="btn btn-primary mx-1 mt-2" data-toggle="modal" href="#registerModal">등록하기</a>
		<a class="btn btn-danger mx-1 mt-2" data-toggle="modal" href="#reportModal">신고하기</a>
	</form>
<div class="card bg-light mt-3">
		<div class="card-header bg-light">
			<div class="row">
				<div class="col-8 text-Left">컴퓨터개론&nbsp;<small>나동빈</small></div>
				<div class="col-4 text-right">
					종합 <span style="color: red;">A</span>
			</div>
		</div>
	</div>
	<div class="card-body">
		<h5 class="card-title">
			좋은 강의입니다.&nbsp;<small>(2017 가을학기)</small>
		</h5>
		<p class="card-text">좋았습니다.
		<div class="row">
			<div class="col-9 text-Left">
				성적 <span style="color: red;">A</span>
				널널 <span style="color: red;">A</span>
				강의 <span style="color: red;">B</span>
				<span style="color: green;">(추천:15)</span>
			</div>
			<div class="col-3 text-right">
				<a onclick="return confirm('추천하시겠습니까')" href="./likeAction.jsp?evaluatinID">추천</a>
				<a onclick="return confirm('삭제하시겠습니까')" href="./deleteAction.jsp?evaluatinID">삭제</a>
			</div>
		</div>
	</div>
</div>
<div class="card bg-light mt-3">
		<div class="card-header bg-light">
			<div class="row">
				<div class="col-8 text-Left">인공지능&nbsp;<small>김치맨</small></div>
				<div class="col-4 text-right">
					종합 <span style="color: red;">C</span>
			</div>
		</div>
	</div>
	<div class="card-body">
		<h5 class="card-title">
			좋은 강의입니다.&nbsp;<small>(2017 가을학기)</small>
		</h5>
		<p class="card-text">좋았습니다.
		<div class="row">
			<div class="col-9 text-Left">
				성적 <span style="color: red;">A</span>
				널널 <span style="color: red;">D</span>
				강의 <span style="color: red;">D</span>
				<span style="color: green;">(추천:0)</span>
			</div>
			<div class="col-3 text-right">
				<a onclick="return confirm('추천하시겠습니까')" href="./likeAction.jsp?evaluatinID">추천</a>
				<a onclick="return confirm('삭제하시겠습니까')" href="./deleteAction.jsp?evaluatinID">삭제</a>
			</div>
		</div>
	</div>
</div>
<div class="card bg-light mt-3">
		<div class="card-header bg-light">
			<div class="row">
				<div class="col-8 text-Left">알고리즘&nbsp;<small>홍길동</small></div>
				<div class="col-4 text-right">
					종합 <span style="color: red;">B</span>
				</div>
			</div>
		</div>
	<div class="card-body">
		<h5 class="card-title">
			좋은 강의입니다.&nbsp;<small>(2017 가을학기)</small>
		</h5>
		<p class="card-text">좋았습니다.
		<div class="row">
			<div class="col-9 text-Left">
				성적 <span style="color: red;">B</span>
				널널 <span style="color: red;">C</span>
				강의 <span style="color: red;">B</span>
				<span style="color: green;">(추천:1)</span>
			</div>
			<div class="col-3 text-right">
				<a onclick="return confirm('추천하시겠습니까')" href="./likeAction.jsp?evaluatinID">추천</a>
				<a onclick="return confirm('삭제하시겠습니까')" href="./deleteAction.jsp?evaluatinID">삭제</a>
			</div>
		</div>
	</div>
</div>
</section>
<div class="modal fade" id="registerModal" tabindex="-1" role="dialog" aria-labelledby="modal" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<h5 class="modal-title" id="modal">평가 등록</h5>
				<button type="button" class="close" data-dismiss="modal" aria-label="close">
					<span aria-hidden="true"></span>
				</button>
			</div>
			<div class="modal-body">
				<form action="./evaluationRegisterAction.jsp" method="post">
					<div class="form-row">
						<div class="form-group col-sm-6">
							<label>강의명</label>
							<input type="text" name="lectureName" class="form-control" maxlength="20">
						</div>
						<div class="form-group col-sm-6">
							<label>교수명</label>
							<input type="text" name="lectureName" class="form-control" maxlength="20">
						</div>
					</div>
					<div class="form-row">
						<div class="form-group col-sm-4">
							<label>수강 연도</label>
							<select name="lectureYear" class="form-control">
								<option value="2015" selected>2015</option>
								<option value="2016">2016</option>
								<option value="2017">2017</option>
								<option value="2018">2018</option>
								<option value="2019">2019</option>
								<option value="2020">2020</option>
							</select>
						</div>
						<div class="form-gruop col-sm-4">
							<label>수강 학기</label>
							<select name="semesterDivide" class="form-control">
								<option value="1학기" selected>1학기</option>
								<option value="여름학기">여름학기</option>
								<option value="2학기">2학기</option>
								<option value="겨울학기">겨울학기</option>
							</select>
						</div>
						<div class="form-gruop col-sm-4">
							<label>강의 구분</label>
							<select name="lectureDivide" class="form-control">
								<option value="전공" selected>전공</option>
								<option value="교양">교양</option>
								<option value="기타">기타</option>
							</select>
						</div>
					</div>
					<div class="form-group">
						<label>제목</label>
						<input type="text" name="evaluationTitle" class="form-control" maxlength="30">
					</div>
					<div class="form-group">
						<label>내용</label>
						<textarea name="evaluationContent" class="form-control" maxlength="2048" style="height: 180px;"></textarea>
					</div>
					<div class="form-row">
						<div class="form-group col-sm-3">
							<label>종합</label>
							<select name="totalScore" class="form-control">
								<option value="A" selected>A</option>
								<option value="B">B</option>
								<option value="C">C</option>
								<option value="D">D</option>
								<option value="F">F</option>
							</select>
						</div>
						<div class="form-group col-sm-3">
							<label>성적</label>
							<select name="creditScore" class="form-control">
								<option value="A" selected>A</option>
								<option value="B">B</option>
								<option value="C">C</option>
								<option value="D">D</option>
								<option value="F">F</option>
							</select>
						</div>
							<div class="form-group col-sm-3">
							<label>널널</label>
							<select name="comfortableScore" class="form-control">
								<option value="A" selected>A</option>
								<option value="B">B</option>
								<option value="C">C</option>
								<option value="D">D</option>
								<option value="F">F</option>
							</select>
						</div>
							<div class="form-group col-sm-3">
							<label>강의</label>
							<select name="lectureScore" class="form-control">
								<option value="A" selected>A</option>
								<option value="B">B</option>
								<option value="C">C</option>
								<option value="D">D</option>
								<option value="F">F</option>
							</select>
						</div>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary" data-dismiss="modal">취소</button>
						<button type="submit" class="btn btn-primary">등록하기</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</div>
<div class="modal fade" id="reportModal" tabindex="-1" role="dialog" aria-labelledby="modal" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<h5 class="modal-title" id="modal">신고하기</h5>
				<button type="button" class="close" data-dismiss="modal" aria-label="close">
					<span aria-hidden="true"></span>
				</button>
			</div>
			<div class="modal-body">
				<form action="./reportAction.jsp" method="post">
					<div class="form-group">
						<label>신고 제목</label>
						<input type="text" name="reportTitle" class="form-control" maxlength="30">
					</div>
					<div class="form-group">
						<label>신고 내용</label>
						<textarea name="reportContent" class="form-control" maxlength="2048" style="height: 180px;"></textarea>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary" data-dismiss="modal">취소</button>
						<button type="submit" class="btn btn-danger">신고하기</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</div>
<footer class="bg-dark mt-4 p-5 text-center" style="color: #FFFFFF;">
	Copyright &copy; 2021 박순빈 All Rights Reserved.
</footer>
</body>
</html>