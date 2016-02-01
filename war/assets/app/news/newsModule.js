'use strict';

// Declare module
var newsModule = angular.module('newsModule', [ 'ngResource', 'ngSanitize' ]);

newsModule.factory('News', [ '$resource', function($resource) {
	return $resource('api/news/:id/', {
		id : '@id'
	});
} ]);

// Controller
newsModule.controller('newsCtrl', [ '$scope', 'News',

function($scope, News) {
	// Init
	var listNews = $scope.listNews = News.query({limit : 10});

}// END CONTROLLER

]);
