<?php
    header("content-type:text/html; charset=utf-8"); 
	mysql_connect("localhost", "cap20130655", "1234");

	$name1 = $_GET[name1];
	$title1 = $_GET[title1];
	$txt1 = $_GET[txt1];
	
		 $sql   = "INSERT INTO Soongbing VALUES ('$name1', '$title1', '$txt1')";
		 $result = mysql_db_query("test",$sql);

		 echo "레코드를 추가했습니다.";

?>