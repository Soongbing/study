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
<title>������ �� ����Ʈ</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
	<a class="navbar-brand" href="straps.jsp">������ �� ����Ʈ</a>
	<button class="navbar-toggler"type="button" data-toggle="collapse" data-target="#navbar">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div id="navbar" class="collapse navbar-collapse">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item active">
				<a class="nav-link" href="straps.jsp">����</a>
			</li>
			<li class="nav-item dropdown">
				<a class="nav-link dropdown-toggle" id="dropdown" data-toggle="dropdown">
					ȸ�� ����
				</a>
				<div class="dropdown-menu" aria-labelledby="dropdown">
					<a class="dropdown-item" href="userLogin.jsp">�α���</a>
					<a class="dropdown-item" href="userJoin.jsp">ȸ������</a>
					<a class="dropdown-item" href="userLogout.jsp">�α׾ƿ�</a>
				</div>
			</li>
		</ul>
		<form class="form-inline my-2 my-lg-0">
			<input class="form-control mr-sm-2" type="search" placeholder="������ �Է��ϼ���." aria-label="Seach">
			<button class="btn btn-outline-success my-2 my-sm-0" type="submit">
				�˻�
			</button>
		</form>
	</div>
</nav>
<section class="container"><!-- �����±״� HTML5������� ���������� ������ ��� --> 
<!-- �����̳� Ŭ������ ���������� Ư���� ��Ұ� �˾Ƽ� �۾������� ������  -->
	<form method="get" action="./index.jsp" class="form-inline mt-3">
		<select name="lectureDivide" class="form-control mx-1 mt-2">
			<option value="��ü">��ġ</option>
			<option value="����">����</option>
			<option value="����">����</option>
			<option value="��Ÿ">��Ÿ</option>
		</select>
		<input type="text" name="search" class="form-control mx-1 mt-2" placeholoder="������ �Է��ϼ���">
		<button class="btn btn-primary mx-1 mt-2" type="submit">�˻�</button>
		<a class="btn btn-primary mx-1 mt-2" data-toggle="modal" href="#registerModal">����ϱ�</a>
		<a class="btn btn-danger mx-1 mt-2" data-toggle="modal" href="#reportModal">�Ű��ϱ�</a>
	</form>
<div class="card bg-light mt-3">
		<div class="card-header bg-light">
			<div class="row">
				<div class="col-8 text-Left">��ǻ�Ͱ���&nbsp;<small>������</small></div>
				<div class="col-4 text-right">
					���� <span style="color: red;">A</span>
			</div>
		</div>
	</div>
	<div class="card-body">
		<h5 class="card-title">
			���� �����Դϴ�.&nbsp;<small>(2017 �����б�)</small>
		</h5>
		<p class="card-text">���ҽ��ϴ�.
		<div class="row">
			<div class="col-9 text-Left">
				���� <span style="color: red;">A</span>
				�γ� <span style="color: red;">A</span>
				���� <span style="color: red;">B</span>
				<span style="color: green;">(��õ:15)</span>
			</div>
			<div class="col-3 text-right">
				<a onclick="return confirm('��õ�Ͻðڽ��ϱ�')" href="./likeAction.jsp?evaluatinID">��õ</a>
				<a onclick="return confirm('�����Ͻðڽ��ϱ�')" href="./deleteAction.jsp?evaluatinID">����</a>
			</div>
		</div>
	</div>
</div>
<div class="card bg-light mt-3">
		<div class="card-header bg-light">
			<div class="row">
				<div class="col-8 text-Left">�ΰ�����&nbsp;<small>��ġ��</small></div>
				<div class="col-4 text-right">
					���� <span style="color: red;">C</span>
			</div>
		</div>
	</div>
	<div class="card-body">
		<h5 class="card-title">
			���� �����Դϴ�.&nbsp;<small>(2017 �����б�)</small>
		</h5>
		<p class="card-text">���ҽ��ϴ�.
		<div class="row">
			<div class="col-9 text-Left">
				���� <span style="color: red;">A</span>
				�γ� <span style="color: red;">D</span>
				���� <span style="color: red;">D</span>
				<span style="color: green;">(��õ:0)</span>
			</div>
			<div class="col-3 text-right">
				<a onclick="return confirm('��õ�Ͻðڽ��ϱ�')" href="./likeAction.jsp?evaluatinID">��õ</a>
				<a onclick="return confirm('�����Ͻðڽ��ϱ�')" href="./deleteAction.jsp?evaluatinID">����</a>
			</div>
		</div>
	</div>
</div>
<div class="card bg-light mt-3">
		<div class="card-header bg-light">
			<div class="row">
				<div class="col-8 text-Left">�˰�����&nbsp;<small>ȫ�浿</small></div>
				<div class="col-4 text-right">
					���� <span style="color: red;">B</span>
				</div>
			</div>
		</div>
	<div class="card-body">
		<h5 class="card-title">
			���� �����Դϴ�.&nbsp;<small>(2017 �����б�)</small>
		</h5>
		<p class="card-text">���ҽ��ϴ�.
		<div class="row">
			<div class="col-9 text-Left">
				���� <span style="color: red;">B</span>
				�γ� <span style="color: red;">C</span>
				���� <span style="color: red;">B</span>
				<span style="color: green;">(��õ:1)</span>
			</div>
			<div class="col-3 text-right">
				<a onclick="return confirm('��õ�Ͻðڽ��ϱ�')" href="./likeAction.jsp?evaluatinID">��õ</a>
				<a onclick="return confirm('�����Ͻðڽ��ϱ�')" href="./deleteAction.jsp?evaluatinID">����</a>
			</div>
		</div>
	</div>
</div>
</section>
<div class="modal fade" id="registerModal" tabindex="-1" role="dialog" aria-labelledby="modal" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<h5 class="modal-title" id="modal">�� ���</h5>
				<button type="button" class="close" data-dismiss="modal" aria-label="close">
					<span aria-hidden="true"></span>
				</button>
			</div>
			<div class="modal-body">
				<form action="./evaluationRegisterAction.jsp" method="post">
					<div class="form-row">
						<div class="form-group col-sm-6">
							<label>���Ǹ�</label>
							<input type="text" name="lectureName" class="form-control" maxlength="20">
						</div>
						<div class="form-group col-sm-6">
							<label>������</label>
							<input type="text" name="lectureName" class="form-control" maxlength="20">
						</div>
					</div>
					<div class="form-row">
						<div class="form-group col-sm-4">
							<label>���� ����</label>
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
							<label>���� �б�</label>
							<select name="semesterDivide" class="form-control">
								<option value="1�б�" selected>1�б�</option>
								<option value="�����б�">�����б�</option>
								<option value="2�б�">2�б�</option>
								<option value="�ܿ��б�">�ܿ��б�</option>
							</select>
						</div>
						<div class="form-gruop col-sm-4">
							<label>���� ����</label>
							<select name="lectureDivide" class="form-control">
								<option value="����" selected>����</option>
								<option value="����">����</option>
								<option value="��Ÿ">��Ÿ</option>
							</select>
						</div>
					</div>
					<div class="form-group">
						<label>����</label>
						<input type="text" name="evaluationTitle" class="form-control" maxlength="30">
					</div>
					<div class="form-group">
						<label>����</label>
						<textarea name="evaluationContent" class="form-control" maxlength="2048" style="height: 180px;"></textarea>
					</div>
					<div class="form-row">
						<div class="form-group col-sm-3">
							<label>����</label>
							<select name="totalScore" class="form-control">
								<option value="A" selected>A</option>
								<option value="B">B</option>
								<option value="C">C</option>
								<option value="D">D</option>
								<option value="F">F</option>
							</select>
						</div>
						<div class="form-group col-sm-3">
							<label>����</label>
							<select name="creditScore" class="form-control">
								<option value="A" selected>A</option>
								<option value="B">B</option>
								<option value="C">C</option>
								<option value="D">D</option>
								<option value="F">F</option>
							</select>
						</div>
							<div class="form-group col-sm-3">
							<label>�γ�</label>
							<select name="comfortableScore" class="form-control">
								<option value="A" selected>A</option>
								<option value="B">B</option>
								<option value="C">C</option>
								<option value="D">D</option>
								<option value="F">F</option>
							</select>
						</div>
							<div class="form-group col-sm-3">
							<label>����</label>
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
						<button type="button" class="btn btn-secondary" data-dismiss="modal">���</button>
						<button type="submit" class="btn btn-primary">����ϱ�</button>
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
				<h5 class="modal-title" id="modal">�Ű��ϱ�</h5>
				<button type="button" class="close" data-dismiss="modal" aria-label="close">
					<span aria-hidden="true"></span>
				</button>
			</div>
			<div class="modal-body">
				<form action="./reportAction.jsp" method="post">
					<div class="form-group">
						<label>�Ű� ����</label>
						<input type="text" name="reportTitle" class="form-control" maxlength="30">
					</div>
					<div class="form-group">
						<label>�Ű� ����</label>
						<textarea name="reportContent" class="form-control" maxlength="2048" style="height: 180px;"></textarea>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary" data-dismiss="modal">���</button>
						<button type="submit" class="btn btn-danger">�Ű��ϱ�</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</div>
<footer class="bg-dark mt-4 p-5 text-center" style="color: #FFFFFF;">
	Copyright &copy; 2021 �ڼ��� All Rights Reserved.
</footer>
</body>
</html>