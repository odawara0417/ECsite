<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js"></script>

  <script>
    $(document).ready(function(){
      $('.homeSlider').bxSlider({
    	  auto:true,
    	  mode:'fade',
    	  speed:1000
      });
    });
  </script>
<link rel="stylesheet" href="./css/style.css">
<title>かまぼこの里</title>
<script type="text/javascript">
        $(document).ready(function(){
            $('.bxslider').bxSlider({
                auto: true,
            });
        });
</script>
</head>

<body>
<jsp:include page="header.jsp"/>
<div id="contents">
<h1>Welcome To Village of Kamaboko</h1>
<ul class="homeSlider">
<li><img title="画像１" src="./images/inaka.jpg" width="600" height="300"/></li>
<li><img title="画像2" src="./images/kamaboko.jpg" width="600" height="300"/></li>
<li><img title="画像3" src="./images/hamo.jpg" width="600" height="300"/></li>
</ul>
</div>


<s:include value="footer.jsp"/>
</body>
</html>
