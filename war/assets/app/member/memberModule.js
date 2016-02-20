(function() {
	'use strict';

	// Declare module
	var memberModule = angular.module('memberModule', [ 'ngResource', 'ngRoute', 'ngAnimate' ]);

	// Resouce
	memberModule.factory('TeamMember', function($resource) {
		return $resource('api/teamMember/:id', {
			id : '@id'
		});
	});

	// Controller
	memberModule.controller('memberCtrl', function($scope, $resource, TeamMember) {
		// Init
		$scope.teamMembers = TeamMember.query();

		// Filter method : Leader => Membre/postulant => amis
		$scope.statusFunctionFiler = function(item) {
			if (item.status == 'L') {
				return -1;
			} else if (item.status == 'M' || item.status == 'P') {
				return 0;
			} else if (item.status == 'A') {
				return 1;
			} else
				return 10;
		};

	}// END CONTROLLER
	);

	// Controller detail
	memberModule.controller('memberDetailCtrl', function($scope, $resource, $routeParams, TeamMember) {

		$scope.idMember = $routeParams.idMember;

		$scope.teamMember = TeamMember.get({
			id : $routeParams.idMember
		});

	}// END CONTROLLER
	);
})();
