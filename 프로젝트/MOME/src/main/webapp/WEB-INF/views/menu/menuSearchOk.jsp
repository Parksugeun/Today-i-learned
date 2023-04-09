<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
  font-family: 'Merriweather', sans-serif;
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
margin-bottom: 1em;
width:100%;
}
.mome-bottom {
  display: flex;
  flex-wrap: wrap;
  justify-content: center;
  gap: 20px;
}

.card-col {
  max-width: 300px;
  width: 100%;
  border-radius: 10px;
  box-shadow: 0px 0px 15px rgba(0, 0, 0, 0.1);
  overflow: hidden;
  transition: 0.3s;
  font-family: sans-serif;
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
}	
</style>

<script>
</script>

<!--  
<form class="cf">
<h1>모메 메뉴추천</h1>
  <div class="half left cf">
  	<input type="input" id="input-subject" placeholder="가계명: 슈아브">
    <input type="input" id="input-name" placeholder="메뉴: 마카롱">
    <input type="input" id="input-email" placeholder="카테고리: 디저트">
    <input type="input" id="input-subject" placeholder="위치: 서울 마포구 월드컵북로5가길 17 1층 ">
    <input type="input" id="input-subject" placeholder="함께하면 좋을 사람들: #친구 #연인">
  </div>
  <div class="half right cf">
    <img src="https://img.daily.co.kr/@files/www.daily.co.kr/content/food/2020/20200309/1738fceeeb9de07224e2c1704993f456.jpg" style="width:550px; border-radius:20px;" />
  </div>  
</form>
-->
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

