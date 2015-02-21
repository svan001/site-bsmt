'use strict';

// Declare module
var navbarModule = angular.module('navbarModule', []);

// Controller
navbarModule.controller('navbarCtrl', [ '$scope', 'navbarService',
function($scope, navbarService) {
	// Navbar collapse
	$scope.isCollapsed = true;

	/**Selectione un menu*/
	$scope.selectLi = function(select) {
		// assure que le menue est collapse
		$scope.isCollapsed = true;
	};

	$scope.isCurrentView = navbarService.isCurrentView;
	
}]);
//END CONTROLLER

// Service
navbarModule.factory('navbarService', function() {
	var currentView = 'home';
	return {
		getCurrentView : function(){
			return currentView;
		},
		setCurrentView : function(newView){
			currentView = newView;
		},
		isCurrentView : function(value) {
			return currentView == value;
		}
	};
});
// END Service


//block run pour gestion du menu a selectionner selon la route
navbarModule.run(function($location, $rootScope, navbarService) {
	$rootScope.$on('$routeChangeStart', function() {
		
		// Check commence par "/" + view
		if ($location.path().indexOf('home') == 1) {
			navbarService.setCurrentView('home');
		} else if ($location.path().indexOf('news') == 1) {
			navbarService.setCurrentView('news');
		} else if ($location.path().indexOf('member') == 1) {
			navbarService.setCurrentView('member');
		} else if ($location.path().indexOf('gallery') == 1) {
			navbarService.setCurrentView('gallery');
		} else if ($location.path().indexOf('recrutement') == 1) {
			navbarService.setCurrentView('recrutement');
		} 
	});
});
