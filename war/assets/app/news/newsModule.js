'use strict';

// Declare App
//var newsListApp = angular.module('newsListApp', [ 'newsListModule' ]);

// Declare module
var newsModule = angular.module('newsModule', [ 'ngResource' ]);

newsModule.factory('News', [ '$resource', function($resource) {
	return $resource('api/news/:id/', {
		id : '@id'
	});
} ]);

// Controller
newsModule.controller('newsCtrl', [ '$scope', 'News',

function($scope, News) {
	// Init
	var listNews = $scope.listNews = News.query();

	// Ajout d'une news
	$scope.addNews = function(formNews) {

		News.save(formNews, function(addedNews) {
			// maj scope
			listNews.push(addedNews);
		});
	};

}// END CONTROLLER

]);