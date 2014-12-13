'use strict';

// Declare App
var newsListApp = angular.module('newsListApp', [ 'newsListModule' ]);

// Declare module 
var newsListModule = angular.module('newsListModule', ['ngResource']);

newsListModule.factory('newsService', ['$resource', function($resource) {
	return $resource('http://localhost:8080/bootstrap-mvc/ajax/news');
	}]
);

// Controller
newsListModule.controller('newsListCtrl', [ '$scope', 'newsService',

function($scope, newsService) {

	var listNews = $scope.listNews = newsService.query();
	
	$scope.addNews = function() {

		listNews.push({
			title : $scope.newTitle,
			content : $scope.newContent,
			author : $scope.newAuthor,
			creationDate : "Avant hier"
		});
	};
}

]);
