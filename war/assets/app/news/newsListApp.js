'use strict';

// Declare App
var newsListApp = angular.module('newsListApp', [ 'newsListModule' ]);

// Declare module
var newsListModule = angular.module('newsListModule', [ 'ngResource' ]);

newsListModule.factory('News', [ '$resource', function($resource) {
	return $resource('api/news/:id/', {
		id : '@id'
	});
} ]);

// Controller
newsListModule.controller('newsListCtrl', [ '$scope', 'News',

function($scope, News) {
	// Init
	var listNews = $scope.listNews = News.query();

	// Ajout d'une news
	$scope.addNews = function(formNews) {
		// Add
		News.save(formNews, function(addedNews) {
			// maj scope
			listNews.push(addedNews);
		});
	};

}// END CONTROLLER

]);
