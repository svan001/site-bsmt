<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">

<%if("DEV".equals(System.getProperty("ENV"))) {%> 
<base href="/bootstrap-mvc/">
<%} else { %>
<base href="/site/">
<%} %>
<title>Black Shark Milsim Team</title>

<!-- CSS -->
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="css/main.css" rel="stylesheet">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->



<%if(System.getProperty("ENV").equals("DEV")) {%> 
<script src="angular/angular.js"></script>
<script src="angular/angular-resource.js"></script>
<script src="angular/angular-route.js"></script>
<script src="angular/angular-animate.js"></script>
<script src="angular/angular-sanitize.js"></script>
<%} else { %>
<script src="g_analytics.js"></script>

<script src="angular/angular.min.js"></script>
<script src="angular/angular-resource.min.js"></script>
<script src="angular/angular-route.min.js"></script>
<script src="angular/angular-animate.min.js"></script>
<script src="angular/angular-sanitize.min.js"></script>
<%} %>

<script src="angular/i18n/angular-locale_fr-fr.js"></script>

<script src="bootstrap/ui-bootstrap-tpls-0.12.0.min.js"></script>

<script src="app/navbar/navbarModule.js"></script>
<script src="app/home/homeModule.js"></script>
<script src="app/news/newsModule.js"></script>
<script src="app/member/memberModule.js"></script>
<script src="app/recrutement/recrutementModule.js"></script>
<script src="app/gallery/galleryModule.js"></script>
<script src="app/app.js"></script>
</head>
<body ng-app="bsmtApp">

	<!-- header container -->
	<div ng-include="'app/navbar/navbar.html'">
	</div>
	<!-- END header container -->

	<!-- VIEW -->
	<div class="view-animate-container container">
		<div ng-view ng-class="viewAnimationStyle"></div>
	</div>
	
	<footer class="text-center">
		<p>COPYRIGHT BLACK SHARK MILSIM TEAM 2015</p>
	</footer>

</body>
</html>