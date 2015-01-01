<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">

<title>Black Shark Milsim Team</title>

<!-- CSS -->
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="css/main.css" rel="stylesheet">

<script
	src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->


<script src="angular/angular.js"></script>
<script src="angular/angular-resource.js"></script>
<script src="angular/angular-route.js"></script>
<script src="angular/angular-animate.js"></script>

<script src="app/route/myRoute.js"></script>
<script src="app/navbar/navbarModule.js"></script>
<script src="app/home/homeModule.js"></script>
<script src="app/news/newsModule.js"></script>
<script src="app/member/memberModule.js"></script>
<script src="app/recrutement/recrutementModule.js"></script>
<script src="app/app.js"></script>
</head>
<body ng-app="bsmtApp">

	<!-- header container -->
	<div ng-controller="navbarCtrl" ng-include="'app/navbar/navbar.html'">
	</div>
	<!-- END header container -->

	<!-- VIEW -->
	<div class="view-animate-container container">
		<div ng-view ng-class="viewAnimationStyle"></div>
	</div>
	
	<footer class="text-center">
		<p>COPYRIGHT BLACK SHARK MILSIM TEAM 2015</p>
	</footer>

	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="bootstrap/js/bootstrap.min.js"></script>
</body>
</html>