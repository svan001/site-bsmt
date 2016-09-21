(function() {
	"use strict";

	var module = angular.module('memberModule');

	/**
	 * Component de preview d'un member
	 */
	module.component('memberPreview', {
		templateUrl : 'app/member/component/preview/memberPreview.html',
		bindings : {
			member : '<'
		}
	});

})();