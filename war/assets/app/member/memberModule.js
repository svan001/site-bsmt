'use strict';

// Declare module
var memberModule = angular.module('memberModule', [ 'ngResource', 'ngRoute', 'ngAnimate' ]);

// Service
memberModule.factory('TeamMember', [ '$resource', function($resource) {
	return $resource('api/teamMember/:id', {
		id : '@id'
	});
} ]);

// Controller
memberModule.controller('memberCtrl', [ '$scope', '$resource', 'TeamMember',

function($scope, $resource, TeamMember) {

	$scope.teamMembers = TeamMember.query();

}// END CONTROLLER
]);

// Controller detail
memberModule.controller('memberDetailCtrl', [ '$scope', '$resource',
		'$routeParams', 'TeamMember',

		function($scope, $resource, $routeParams, TeamMember) {

			$scope.idMember = $routeParams.idMember;

			$scope.teamMember = TeamMember.get({
				id : $routeParams.idMember
			});

		}// END CONTROLLER
]);
