(function() {
	'use strict';

	// Declare module
	var module = angular.module('newsModule', [ 'ngResource', 'ngSanitize' ]);

	// Service/resource
	module.factory('News', function($resource) {
		return $resource('api/news/:id/', {
			id : '@id'
		});
	});

	// Controller
	module.controller('newsCtrl', function($scope, $sce, News) {
		// Init
		News.query({
			limit : 10
		}).$promise.then(function(res) {
			// Trust le contenue des news et maj scope
			res.forEach(function(item) {
				item.content = $sce.trustAsHtml(item.content);
			});
			$scope.listNews = res;
		});

	}// END CONTROLLER
	);

})();