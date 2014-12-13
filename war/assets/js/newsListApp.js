'use strict';

var newsListApp = angular.module('newsListApp', [ 'newsListModule' ]);

var newsListModule = angular.module('newsListModule', []);

newsListModule.controller('newsListCtrl', [ '$scope',

function($scope) {

	var listNews = $scope.listNews = [ {
		title : "Titre1",
		content : "Cotnue blaeadeazdadz",
		author : "Svan",
		creationDate : "Hier"

	}, {
		title : "Titre2",
		content : "Cotnue blaeadeazdadz",
		author : "Svan2",
		creationDate : "Avant hier"

	} ];

	$scope.addNews = function() {

		listNews.push({
			title : $scope.newTitle,
			content : $scope.newContent,
			author : $scope.newAuthor,
			creationDate : "Avant hier"
		});
	}
}

]);
