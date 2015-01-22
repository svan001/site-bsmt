'use strict';

// Declare App
var bsmtApp = angular.module('bsmtApp', [ 'ngRoute', 'ngAnimate',
		'ui.bootstrap', 'navbarModule', 'homeModule', 'newsModule',
		'memberModule', 'recrutementModule', 'galleryModule' ]);

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
	}).when('/gallery', {
		templateUrl : 'app/gallery/galleryList.html',
		controller : 'galleryCtrl'
	}).when('/gallery/:idGallery', {
		templateUrl : 'app/gallery/showGallery.html',
		controller : 'showGalleryCtrl'
	}).otherwise({
		redirectTo : '/home'
	})

	;
} ]);

// block run pour gestion des animation entre route
bsmtApp.run(function($location, $rootScope) {
	$rootScope.$on('$routeChangeStart', function() {
		if (/^\/member\/[0-9]*$/.test($location.path())
				|| /^\/gallery\/[0-9]*$/.test($location.path())) {
			$rootScope.viewAnimationStyle = 'slide';
		} else {
			$rootScope.viewAnimationStyle = 'none';
		}
	});
});