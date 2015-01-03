'use strict';

// MODULE
var galleryModule = angular.module('galleryModule', [ 'ngResource' ]);

// Resource Gallery
galleryModule.factory('Gallery', [ '$resource', function($resource) {
	return $resource('api/gallery/:id', {
		id : '@id'
	});
} ]);

// Controller List
galleryModule.controller('galleryCtrl', [ '$scope', 'Gallery',
		function($scope, Gallery) {
			var listGallery = $scope.listGallery = Gallery.query();

			// Service
			// END Service
		} // END CONTROLLER
]);

// Controller Show gallery
galleryModule.controller('showGalleryCtrl', [ '$scope', '$routeParams',
		'Gallery', function($scope, $routeParams, Gallery) {

			var gallery = $scope.gallery = Gallery.get({
				id : $routeParams.idGallery
			});

			$scope.pictureToShow = null;
			
			// Service
			$scope.showPicture = function(picture){
				$scope.pictureToShow = picture;
			};
			// END Service
		} // END CONTROLLER
]);