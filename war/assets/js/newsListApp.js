'use strict';

// Declare App
var newsListApp = angular.module('newsListApp', [ 'newsListModule' ]);

// Declare module 
var newsListModule = angular.module('newsListModule', ['ngResource']);

newsListModule.factory('News', ['$resource', function($resource) {
	return $resource(
			//'http://localhost:8080/bootstrap-mvc/ajax/news/:newsId'
			'http://localhost:8080/bootstrap-mvc/ajax/news/:id/:title/:author/:content'
			, {id : '@id', title : '@title', author : '@author', content : '@content'});
	}]
);

// Controller
newsListModule.controller('newsListCtrl', [ '$scope', 'News',

function($scope, News) {

	// Init
	var listNews = $scope.listNews = News.query();
	
	// Ajout d'une news
	$scope.addNews = function() {
		// Add
		var news = new News({
				title : $scope.newTitle,
				content : $scope.newContent,
				author : $scope.newAuthor,
				creationDate : "Avant hier"
			});
		news.$save();
		
		// maj scope
		listNews.push(news);
	};
}

]);
