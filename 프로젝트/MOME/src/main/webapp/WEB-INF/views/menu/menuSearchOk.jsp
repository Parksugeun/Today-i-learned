<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Monomaniac+One&display=swap" rel="stylesheet">

<style>

@import url(https://fonts.googleapis.com/css?family=Merriweather);
*,
*:before,
*:after {
  -moz-box-sizing: border-box;
  -webkit-box-sizing: border-box;
  box-sizing: border-box;
}

html, body {
  background: #f1f1f1;
}

ul li {
	list-style:none;
}

a{
	text-decoration-line: none;
}

h1 {
  text-align: left;
  color: #a8a8a8;
  font-family: 'Noto Sans', sans-serif;
  text-align: center;
}

form {
  max-width: 1200px;
  text-align: center;
  margin: 0 auto;
}
form input, form textarea {
  border: 0;
  outline: 0;
  padding: 1em;
  border-radius: 10px;
  display: block;
  width: 100%;
  margin-top: 1em;
  font-family: 'Merriweather', sans-serif;
  -moz-box-shadow: 0 1px 1px rgba(0, 0, 0, 0.1);
  -webkit-box-shadow: 0 1px 1px rgba(0, 0, 0, 0.1);
  box-shadow: 0 1px 1px rgba(0, 0, 0, 0.1);
	font-size:16px;
}

form #input-submit {
  color: white;
  background: #F98169;
  cursor: pointer;
-webkit-box-shadow: -1px 0px 10px 2px rgba(249,129,105,0.7); 
box-shadow: -1px 0px 10px 2px rgba(249,129,105,0.7);
}

form textarea {
  height: 270px;
}

.half {
  float: left;
  width: 48%;
  margin-bottom: 1em;
}

.right {
  width: 50%;
}

.left {
  margin-right: 2%;
}

.mome-bottom {
  display: flex;
  flex-wrap: wrap;
  justify-content: center;
  gap: 20px;
  margin-bottom: 1em;
  width:100%;
}

.card-col {
  max-width: 300px;
  width: 100%;
  border-radius: 10px;
  box-shadow: 0px 0px 15px rgba(0, 0, 0, 0.1);
  overflow: hidden;
  transition: 0.3s;
}

.card-col:hover {
  box-shadow: 0px 0px 15px rgba(0, 0, 0, 0.3);
}

.card_header {
  position: relative;
}

.card_header img {
  width: 100%;
  height: 180px;
  object-fit: cover;
}

.card_bottom {
  padding: 20px;
  font-family: 'Noto Sans KR', sans-serif;
}

.card_bottom h3 {
  font-size: 20px;
  margin-top: 0;
  margin-bottom: 10px;
}

.card_bottom p {
  font-size: 16px;
  margin-top: 0;
  margin-bottom: 5px;
}
.menu-s{
	margin: 10px;
	font-family: 'Noto Sans', sans-serif;
}
.return-btn{
	text-align: center;
	font-size: 16px;
	background: white;
	padding: 10px 20px;
	text-decoration: none;
	cursor: pointer;
	color: black;
  	border: none;
  	border-radius: 4px;
	margin: 0 auto;
	width: 10%;
	height: 50px;
	font-weight: bold;
	font-family: 'Noto Sans KR', sans-serif;
	
}	
</style>

<script>
</script>

	<div class="menu-s"><h1>모메 메뉴추천</h1></div>
	
	<div class="mome-bottom">
		<c:forEach var="vo" items="${list }">
		
			<div class="card-col">

				<div class="card_header">
				<img id="img-caption"  src="/img/${vo.img }" alt="Img_1">
				</div>
				<div class="card_bottom">
				<h3>${vo.foodname }</h3>
				<p>${vo.categories }</p>
				<p>${vo.detail }</p>	
				</div>
			</div>
		</c:forEach>

	</div>
	<div class="return-btn" onClick="location.href='/menu/menuRecommandation'">뒤로가기</div>

