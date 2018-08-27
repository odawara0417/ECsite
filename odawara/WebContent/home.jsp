<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>Home画面</title>


//pagetop
$(function() {
    var topBtn = $('.pagetop');
    topBtn.hide();
    $(window).scroll(function () {
    //スクロールが500に達したらボタン表示
    if ($(this).scrollTop() > 500) {
    //ボタンの表示方法
    topBtn.fadeIn();
    } else {
    //ボタンの非表示方法
    topBtn.fadeOut();
        } });
    //スクロールしてトップ
    topBtn.click(function () {
        $('body,  html').animate({
            scrollTop: 0
        },   500);
        return false;
    });
});

/* ページトップボタン */
.pagetop {
    position: fixed;
    bottom: 20px;
    right: 20px;
}

.pagetop:hover{
  opacity:0.5;
  }
</head>
<body>
<jsp:include page="header.jsp"/>
<div id="contents"><h1>ホーム</h1></div>

<!-- トップへ戻るボタン -->
<input type="button" value="トップへ" onclick="pagetop" class="pagetop">
<s:include value="footer.jsp"/>
</body>
</html>