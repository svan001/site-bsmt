'use strict';

// Declare App
var bsmtApp = angular.module('bsmtApp', [ 'ngRoute', 'newsModule' ]);

// CONFIG ROUTE
bsmtApp.config([ '$routeProvider', function($routeProvider) {

	$routeProvider.when('/news', {
		templateUrl : 'app/news/newsList.html',
		controller : 'newsCtrl'
	}).otherwise({
		redirectTo : '/news'
	})

	;
} ]);
