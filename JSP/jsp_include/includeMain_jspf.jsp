<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#main{
		width:1000px;
		margin:0 auto;
	}
	#main>img{
		width:100%
	}
</style>
</head>
<body>
<%@ include file="header.jspf" %>
<div id="main">
	<%=username %><br/>
	<img src="../img/03.jfif"/>
</div>
<%@ include file="footer.jspf" %>
</body>
</html>