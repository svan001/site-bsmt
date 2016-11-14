(function () {

    'use strict';

    var galleryModule = angular.module('gallery');

    // *******************************************
    // Controller List
    // *******************************************
    galleryModule.controller('galleryMainCtrl', function ($scope, Gallery) {
            $scope.listGallery = Gallery.query();
        } // END CONTROLLER
    );


})();