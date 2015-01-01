'use strict';

// Declare App
var bsmtApp = angular.module('bsmtApp', [ 'ngRoute', 'ngAnimate', 'navbarModule',
		'homeModule', 'newsModule', 'memberModule', 'recrutementModule' ]);

// CONFIG ROUTE
bsmtApp.config([ '$routeProvider', function($routeProvider) {

	$routeProvider.when('/home', {
		templateUrl : 'app/home/home.html',
		controller : 'homeCtrl'
	}).when('/news', {
		templateUrl : 'app/news/newsList.html',
		controller : 'newsCtrl'
	}).when('/member', {
		templateUrl : 'app/member/membersList.html',
		controller : 'memberCtrl'
	}).when('/member/:idMember', {
		templateUrl : 'app/member/memberDetail.html',
		controller : 'memberDetailCtrl'
	}).when('/recrutement', {
		templateUrl : 'app/recrutement/recrutement.html',
		controller : 'recrutementCtrl'
	}).otherwise({
		redirectTo : '/home'
	})

	;
} ]);

// block run pour gestion des animation entre route
bsmtApp.run(function($location, $rootScope) {
	$rootScope.$on('$routeChangeStart', function() {
		$rootScope.test = /^\/member\/[0-9]*$/.test($location.path());
		if (/^\/member\/[0-9]*$/.test($location.path())) {
			$rootScope.viewAnimationStyle = 'slide';
		} else {
			$rootScope.viewAnimationStyle = 'none';
		}
	});
});