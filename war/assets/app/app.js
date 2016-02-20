(function() {
	'use strict';

	// Declare App
	var bsmtApp = angular.module('bsmtApp', [ 'ngRoute', 'ngAnimate', 'ngTouch', 'ui.bootstrap', 'navbarModule',
			'homeModule', 'newsModule', 'memberModule', 'recrutementModule', 'galleryModule' ]);

	// CONFIG ROUTE
	bsmtApp.config(function($routeProvider, $locationProvider) {

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
		}).when('/gallery', {
			templateUrl : 'app/gallery/galleryList.html',
			controller : 'galleryCtrl'
		}).when('/gallery/:idGallery', {
			templateUrl : 'app/gallery/showGallery.html',
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