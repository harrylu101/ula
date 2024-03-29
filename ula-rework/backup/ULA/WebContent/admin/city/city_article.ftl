<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>乐游旅游</title>
<link href="${base}/css/about.css" rel="stylesheet" type="text/css" />
<!--<script type="text/javascript" src="${base}/js/jquery-1.4.1.min.js"></script>
<script type="text/javascript" src="${base}/js/jquery.jcarousel.pack.js"></script>
<script type="text/javascript" src="${base}/js/jquery-func.js"></script>-->
<script type="text/javascript" src="${base}/js/menu.js"></script>
</head>
<script language=javascript>  
  function my_height(){
	var my_right = document.getElementById("main_right");
	var my_left = document.getElementById("left_menu");
	if(my_left.clientHeight <= my_right.clientHeight){
	my_left.style.height= my_right.clientHeight + "px";
	}
}    
</script>  

</head>
<body onload= "my_height()">

<#include "../../global/header.html">

<div id="main">
  <div id="left_menu">
  <ul class="rolinList" id="rolin">
  <li>
  	<div class="menu_title">
    <h2><a href="${base}/city/intro!view.action">大连介绍</a></h2>
    </div>
    
  </li>
  <li>
  	<div class="menu_title">
    <h2><a href="${base}/city/history!view.action">大连历史</a></h2>
    </div>
    
  </li>
  <li>
  	<div class="menu_title">
    <h2><a href="#">城市地图</a></h2>
    </div>
    
  </li>
  <li>
  	<div class="menu_title">
    <h2>景点、公园</h2>
    </div>
    <div class="content">
    	<div class="content_item"><a href="${base}/city/article.action?id=2">市内</a></div>
        <div class="content_item"><a href="${base}/city/article.action?id=8">旅顺</a></div>
        <div class="content_item"><a href="${base}/city/article.action?id=9">开发区、金石滩</a></div>
    </div>
  </li>
  <li>
  	<div class="menu_title">
    <h2><a href="${base}/city/food!view.action?type=food">大连美食</a></h2>
    </div>
    
  </li>
  <li>
  	<div class="menu_title">
    <h2><a href="${base}/city/housing!view.action?type=housing">大连居住</a></h2>
    </div>
    
  </li>
  <li>
  	<div class="menu_title">
    <h2><a href="${base}/city/shopping!view.action?type=shopping">大连购物</a></h2>
    </div>
    
  </li>
  <li>
  	<div class="menu_title">
    <h2><a href="${base}/city/transportation!view.action?type=transportation">大连交通</a></h2>
    </div>
    
  </li>
  <li>
  	<div class="menu_title">
    <h2><a href="${base}/city/therapy!view.action?type=therapy">大连治疗</a></h2>
    </div>
    
  </li>
  <li>
  	<div class="menu_title">
    <h2><a href="${base}/city/festival!view.action?type=festival">大连节日</a></h2>
    </div>
    
  </li>
  <li>
  	<div class="menu_title">
    <h2><a href="${base}/city/exhibition!view.action?type=exhibition">展会信息</a></h2>
    </div>
  </li>
  <li>
  	<div class="menu_title">
    <h2>其他信息</h2>
    </div>
    <div class="content">
    	<div class="content_item"><a href="${base}/city/insurance!view.action">保险</a></div>
        <div class="content_item"><a href="${base}/city/law!view.action">法律常识</a></div>
        <div class="content_item"><a href="${base}/city/cellphone!view.action">手机信息</a></div>
        <div class="content_item"><a href="${base}/city/advice!view.action">实用建议</a></div>
    </div>
  </li>
</ul>
  </div>
  
  <div id="main_right">
  	<div class="right_title">
    	<h3>>>${view.TITLE}</h3>
    </div>
    
   <div class="right_content">
     <p class="content_p"><#if view.CONTENT?exists>${view.CONTENT}</#if></p>     
   </div>
  
</div>

<#include "../../global/footer.html">

</body>
</html>
