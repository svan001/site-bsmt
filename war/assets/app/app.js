'use strict';

// Declare App
var bsmtApp = angular.module('bsmtApp', [ 'ngRoute', 'homeModule',
		'newsModule', 'recrutementModule' ]);

// CONFIG ROUTE
bsmtApp.config([ '$routeProvider', function($routeProvider) {

	$routeProvider.when('/home', {
		templateUrl : 'app/home/home.html',
		controller : 'homeCtrl'
	}).when('/news', {
		templateUrl : 'app/news/newsList.html',
		controller : 'newsCtrl'
	}).when('/recrutement', {
		templateUrl : 'app/recrutement/recrutement.html',
		controller : 'recrutementCtrl'
	}).otherwise({
		redirectTo : '/home'
	})

	;
} ]);
