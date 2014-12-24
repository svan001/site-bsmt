'use strict';

// Declare module
var memberModule = angular.module('memberModule', [ 'ngResource' ]);

memberModule.factory('TeamMember', [ '$resource', function($resource) {
	return $resource('api/teamMember/:id', {
		id : '@id'
	});
} ]);

memberModule.controller('memberCtrl', [ '$scope', '$resource', 'TeamMember',

function($scope, $resource, TeamMember) {

	$scope.teamMembers = TeamMember.query();

}// END CONTROLLER
]);
