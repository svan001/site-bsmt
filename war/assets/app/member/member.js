(function () {
    'use strict';

    // Declare module
    var memberModule = angular.module('member', ['ngResource', 'ngRoute', 'ngAnimate']);

    // Resource
    memberModule.factory('TeamMember', function ($resource) {
        return $resource('api/teamMember/:id', {
            id: '@id'
        });
    });

})();
