(function() {

	'use strict';

	var galleryModule = angular.module('galleryModule', [ 'ngResource' ]);

	// *******************************************
	// Resource Gallery
	// *******************************************
	galleryModule.factory('Gallery', function($resource) {
		return $resource('api/gallery/:id', {
			id : '@id'
		});
	});

	// *******************************************
	// Controller List
	// *******************************************
	galleryModule.controller('galleryCtrl', function($scope, Gallery) {
		$scope.listGallery = Gallery.query();
	} // END CONTROLLER
	);

	// *******************************************
	// Controller Show gallery
	// *******************************************
	galleryModule.controller('showGalleryCtrl', function($scope, $routeParams,
			Gallery) {
		/** Init function */
		var init = function() {
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
			if (picture != null) {
				// Active le bon slide
				$scope.slides.find(function(item) {
					return item.id == picture.id
				}).active = true;

				$scope.showModal = true;
			} else {
				$scope.showModal = false;
			}
		};

		/** Determine l'url a utiliser pour l'img d'un slide */
		$scope.getPictureUrl = function(slide) {
			if (slide.active && !slide.loaded) {
				slide.loaded = true;
			}

			// Retourne soit la vrai url soit celle de chargement
			return slide.loaded ? 'api/gallery/' + $scope.gallery.id
					+ '/picture/' + slide.title : 'img/loading-gallery.gif';
		};

		// INIT
		init();
	}); // END CONTROLLER

})();