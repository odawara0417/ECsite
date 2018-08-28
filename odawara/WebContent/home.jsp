<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>Home画面</title>


</head>
<body>
<jsp:include page="header.jsp"/>
<div id="contents"><h1>ホーム</h1></div>

<!-- トップへ戻るボタン -->
<input type="button" value="トップへ" onclick="pagetop" class="pagetop">
<s:include value="footer.jsp"/>
</body>
</html>