(function () {

    'use strict';

    var galleryModule = angular.module('gallery');

    // *******************************************
    // Controller Show gallery
    // *******************************************
    galleryModule.controller('showGalleryCtrl', function ($scope, $routeParams, Gallery) {
        /** Init function */
        var init = function () {
            $scope.showModal = false;

            // GET gallery et create slides
            $scope.gallery = Gallery.get({
                id: $routeParams.idGallery
            }, function (res) {
                $scope.slides = res.pictures.map(function (item, index) {
                    return {
                        index: index,
                        picture: {
                            id: item.id,
                            title: item.title
                        },
                        loaded: false
                    };
                });
            });
        }

        /** Selection d'une image */
        $scope.selectPicture = function (picture) {
            if (picture != null) {
                // Trouve le bon slide
                var slideToShow = $scope.slides.find(function (item) {
                    return item.picture.id == picture.id
                });
                // Maj scope
                $scope.activeSlideIndex = slideToShow.index;
                $scope.showModal = true;
            } else {
                $scope.showModal = false;
            }
        };

        /** Determine l'url a utiliser pour l'img d'un slide */
        $scope.getPictureUrl = function (slide) {
            // Active le chargement
            if (!slide.loaded && $scope.activeSlideIndex == slide.index) {
                slide.loaded = true;
            }

            // Retourne soit la vrai url soit celle de chargement
            return slide.loaded ? 'api/gallery/' + $scope.gallery.id + '/picture/' + slide.picture.title
                : 'img/loading-gallery.gif';
        };

        // INIT
        init();
    }); // END CONTROLLER

})();