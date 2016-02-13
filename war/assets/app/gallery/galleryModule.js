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

		} // END CONTROLLER
]);

// Controller Show gallery
galleryModule.controller('showGalleryCtrl', function($scope, $routeParams,
		Gallery) {
	var init = function() {
		$scope.pictureToShow = null;
		$scope.showModal = false;

		// GET gallery et create slides
		$scope.gallery = Gallery.get({
			id : $routeParams.idGallery
		}, function(res) {
			$scope.slides = res.pictures.map(function(item) {
				return {
					id : item.id,
					title : item.title,
					active : false,
					loaded : false
				};
			});
		});
	}

	/** Selection d'une image */
	$scope.selectPicture = function(picture) {
		$scope.pictureToShow = picture;
		$scope.showModal = picture != null;

		if ($scope.showModal)
			$scope.slides.find(function(item) {
				return item.id == picture.id
			}).active = true;
	};

	/** Determine l'url a utiliser pour un slide/img */
	$scope.getPictureUrl = function(slide) {
		if (slide.active && !slide.loaded) {
			slide.loaded = true;
		}

		// Retourne soit la vrai url soit celle de chargement
		return slide.loaded ? 'api/gallery/' + $scope.gallery.id + '/picture/'
				+ slide.title : 'img/loading-gallery.gif';
	};

	// INIT
	init();
} // END CONTROLLER
);