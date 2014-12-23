'use strict';

// Declare module
var navbarModule = angular.module('navbarModule', []);

// Controller
navbarModule.controller('navbarCtrl', [ '$scope',

function($scope) {
	$scope.selectedLi = 'home';
	
}// END CONTROLLER

]);
