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
<link href="css/header.css" rel="stylesheet">

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
	
	<script src="app/home/homeModule.js"></script>
	<script src="app/news/newsModule.js"></script>
	<script src="app/recrutement/recrutementModule.js"></script>
	<script src="app/app.js"></script>
</head>
<body ng-app="bsmtApp">

	<!-- header container -->
	<div class="container top-container">
		<!-- IMG -->
		<div class="row">

			<div class="col-xs-3 col-md-3 col-lg-4 col-banniere">
				<img alt="Logo bsmt" src="img/logo.jpg"
					class="img-circle img-responsive img-banniere center-block" />
			</div>
			<div class="col-xs-4 col-md-4 col-banniere">
				<img alt="tof" src="img/action_soldier.jpg"
					class="img-responsive img-banniere center-block">
			</div>
			<div class="col-xs-4 col-md-4 col-banniere">
				<img alt="tof" src="img/action_forest.jpg"
					class="img-responsive img-banniere center-block">
			</div>

		</div>

		<!-- Nav bar -->
		<div class="row navbar-row">
			<nav id="mainNavBar" class="navbar navbar-inverse">
				<!-- navbar-fixed-top"> -->
				<ul class="nav navbar-nav">
					<li id="teamLi"><a href="#/home">La team</a></li>
					<li id="newsLi"><a href="#/news">Les news</a></li>
					<li id="membersLi"><a href="#/members">Les membres</a></li>
					<li id="galerieLi"><a href="#/galerie">La galerie</a></li>
					<li id="forumLi"><a href="http://bsmt.forumactif.org/">Le
							forum</a></li>

				</ul>
				<ul class="nav navbar-nav pull-right">
					<li class="recrutement-li"><a href="#/recrutement">RECRUTEMENT</a></li>
				</ul>
			</nav>
		</div>
	</div>
	<!-- END header container -->

	<!-- VIEW -->
	<div ng-view></div>

	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="bootstrap/js/bootstrap.min.js"></script>
</body>
</html>