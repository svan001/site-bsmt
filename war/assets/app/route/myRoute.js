'use strict';

var myRouteModule = angular.module('myRouteModule', [ 'ngRoute' ]);

myRouteModule.run(function($rootScope) {
	$rootScope.viewAnimationStyle = 'none';
});

myRouteModule.run(function($location, $rootScope) {
	$rootScope.$on('$routeChangeStart', function() {
		$rootScope.test = /^\/member\/[0-9]*$/.test($location.path());
		if (/^\/member\/[0-9]*$/.test($location.path())) {
			$rootScope.viewAnimationStyle = 'slide';
		} else {
			$rootScope.viewAnimationStyle = 'none';
		}
	});
});