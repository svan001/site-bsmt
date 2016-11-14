(function() {
	'use strict';

	// Declare module
	var memberModule = angular.module('member');

	// Controller detail
	memberModule.controller('memberDetailsCtrl', function($scope, $resource, $routeParams, TeamMember) {
		$scope.idMember = $routeParams.idMember;

		$scope.teamMember = TeamMember.get({
			id : $routeParams.idMember
		});

	}// END CONTROLLER
	);
})();
