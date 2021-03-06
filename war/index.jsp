<!DOCTYPE html>
<html lang="fr">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="Site officiel de la Black Shark Milsim Team">
<meta name="author" content="svan">
<meta name="keywords" content="bsmt, milsim, paintball, black shark milsim team">

<link rel="icon" href="img/favicon.png">

<base href="/site/">

<title>Black Shark Milsim Team</title>

<!-- CSS -->
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="css/main.css?rev=14-01-2016" rel="stylesheet">

<%if("DEV".equals(System.getProperty("ENV"))) {%>

<!-- <<< AngularJS -->  
<script src="angular/angular.js"></script>
<script src="angular/angular-resource.js"></script>
<script src="angular/angular-route.js"></script>
<script src="angular/angular-animate.js"></script>
<script src="angular/angular-sanitize.js"></script>
<script src="angular/angular-touch.js"></script>

<!-- >>> AngularJS -->

<%} else { %>

<script src="g_analytics.js"></script>

<!-- <<< AngularJS -->  
<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.5.0/angular.min.js"></script>
<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.5.0/angular-resource.min.js"></script>
<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.5.0/angular-route.min.js"></script>
<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.5.0/angular-animate.min.js"></script>
<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.5.0/angular-sanitize.min.js"></script>
<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.5.0/angular-touch.min.js"></script>

<!-- #23 Chargement SSL beaucoup trop long bascule sur le fichier "local" systematiquement
<script src="//code.angularjs.org/1.5.0/i18n/angular-locale_fr-fr.js"></script>
-->
<!-- >>> AngularJS -->  
<%} %>

<!-- #23 Chargement SSL beaucoup trop long bascule sur le fichier "local" systematiquement-->
<script src="angular/i18n/angular-locale_fr-fr.js"></script>

<!-- CDN ??
<script src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-bootstrap/1.3.1/ui-bootstrap-tpls.min.js"></script>
 --> 
<script src="bootstrap/ui-bootstrap-tpls.min.js"></script>
 
  
<!-- <<< Script app angular -->  
<script src="app/navbar/navbar.js"></script>
<script src="app/home/home.js"></script>
<script src="app/news/news.js"></script>

<script src="app/member/member.js"></script>
<script src="app/member/component/preview/memberPreview.js"></script>
<script src="app/member/main/memberMainCtrl.js"></script>
<script src="app/member/details/memberDetailsCtrl.js"></script>

<script src="app/recrutement/recrutement.js"></script>

<script src="app/gallery/gallery.js"></script>
<script src="app/gallery/main/galleryMainCtrl.js"></script>
<script src="app/gallery/show/showGalleryCtrl.js"></script>

<script src="app/app.js"></script>
<!-- >>> Script app angular -->  

</head>
<body ng-app="bsmtApp">

	<!-- header container -->
	<bsmt-nav-bar></bsmt-nav-bar>
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