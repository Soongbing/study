<head>
<META HTTP-EQUIV="Content-Type" CONTENT="text/html; charset=utf-8">
<style>
	h2 {
	font-family: "휴먼매직체";
	text-align:center;
	color:white;
	}
	body {
	background-color:black;
	}
	table {
	margin: 0 auto;
	background-color:skyblue;
	color:white;
	}
	.th{
		width: 60%;
	}
	.td{
		height: 100px;
	}
</style>
</head>
<body>
<h2>방명록</h2>
<?php
  header("content-type:text/html; charset=utf-8");

  mysql_connect("localhost", "cap20130655", "1234");

	echo "<table border=3><tr><th>글쓴이<th>제목<th class=th>내용</tr>";
  $sql = "SELECT * from Soongbing";
  $result = mysql_db_query("test", $sql);

  while($row = mysql_fetch_array($result)) {
    echo "<tr><td>";
	echo $row[name];
    echo "<td>";
    echo $row[title];
    echo "<td class=td>";
	echo $row[txt];
	echo "</tr>";
  }
  echo "</table>";
?>
</body>