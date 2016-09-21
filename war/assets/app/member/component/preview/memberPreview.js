(function() {
	"use strict";

	var module = angular.module('memberModule');

	/**
	 * Component de preview d'un member
	 */
	module.component('memberPreview', {
		controller : function() {
		},
		templateUrl : 'app/member/component/preview/memberPreview.html',
		bindings : {
			member : '='
		}
	});

})();