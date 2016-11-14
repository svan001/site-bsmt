(function () {

    'use strict';

    var galleryModule = angular.module('gallery', ['ngResource']);

    // *******************************************
    // Resource Gallery
    // *******************************************
    galleryModule.factory('Gallery', function ($resource) {
        return $resource('api/gallery/:id', {
            id: '@id'
        });
    });

})();