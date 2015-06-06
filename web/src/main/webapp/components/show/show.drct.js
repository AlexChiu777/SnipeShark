'use strict';
angular.module('app.services')
	   .directive('show', show);

function show () {
	var directive = {
		controller: controller,
		templateUrl: 'components/show/show.tpl.html',
		restrict: 'E',
		scope: {
			show : '='
		}
	};

	return directive;
}

function controller () {
	var vm = this;

	vm.isCollapsed = true;
	vm.genres = ["horror", "mystery", "adventure"];
	vm.genreColor = 'label-default';


	vm.isCollapsed = true;
	vm.isReadOnly = true;
	vm.rate = 7;
	vm.max = 10;
	vm.isLiked = false;
}
