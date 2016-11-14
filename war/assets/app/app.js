(function() {
	'use strict';

	// Declare App
	var bsmtApp = angular.module('bsmtApp', [
	// Angular
	'ngRoute', 'ngAnimate', 'ngTouch',
	// lib
	'ui.bootstrap',
	// App
	'navbar', 'home', 'news', 'member', 'recrutement', 'gallery' ]);

	// CONFIG ROUTE
	bsmtApp.config(function($routeProvider, $locationProvider) {

		$routeProvider.when('/home', {
			templateUrl : 'app/home/home.html',
			controller : 'homeCtrl'
		}).when('/news', {
			templateUrl : 'app/news/newsList.html',
			controller : 'newsCtrl'
		}).when('/member', {
			templateUrl : 'app/member/main/memberMain.html',
			controller : 'memberMainCtrl'
		}).when('/member/:idMember', {
			templateUrl : 'app/member/details/memberDetails.html',
			controller : 'memberDetailsCtrl'
		}).when('/recrutement', {
			templateUrl : 'app/recrutement/recrutement.html',
			controller : 'recrutementCtrl'
		}).when('/gallery', {
			templateUrl : 'app/gallery/main/galleryMain.html',
			controller : 'galleryMainCtrl'
		}).when('/gallery/:idGallery', {
			templateUrl : 'app/gallery/show/showGallery.html',
			controller : 'showGalleryCtrl'
		}).otherwise({
			redirectTo : '/home'
		});

		// Active le mode HTML5 pour les URL et l'indexation google
		$locationProvider.html5Mode(true);
	});

	// Block run pour gestion des animations entre route
	bsmtApp.run(function($location, $rootScope) {
		$rootScope.$on('$routeChangeStart', function() {
			if (/^\/member\/[0-9]*$/.test($location.path()) || /^\/gallery\/[0-9]*$/.test($location.path())) {
				$rootScope.viewAnimationStyle = 'slide';
			} else {
				$rootScope.viewAnimationStyle = 'none';
			}
		});
	});
})();