'use strict';

// Declare module
var navbarModule = angular.module('navbarModule', []);

// Controller
navbarModule.controller('navbarCtrl', [ '$scope',

function($scope) {
	$scope.selectedLi = 'home';
	$scope.isCollapsed = true;

	$scope.selectLi = function(select) {
		$scope.selectedLi = select;
		// assure que le menue est collapse
		$scope.isCollapsed = true;
	}

}// END CONTROLLER

]);
