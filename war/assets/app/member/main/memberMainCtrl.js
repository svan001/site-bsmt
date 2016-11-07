(function() {
	'use strict';

	// Declare module
	var memberModule = angular.module('memberModule');

	// Controller
	memberModule.controller('memberMainCtrl', function($scope, $resource, TeamMember) {
		// Init
		$scope.teamMembers = TeamMember.query();

		// Filter method : Leader => Membre/postulant => amis
		$scope.statusFunctionFilter = function(item) {
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
})();
