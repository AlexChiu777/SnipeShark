'use strict';
angular.module('app.services').controller('ShowController', function() {
	var vm = this;

	vm.isCollapsed = true;
	vm.genres = ["horror", "mystery", "adventure"];
	vm.genreColor = 'label-default';


	vm.isCollapsed = true;
	vm.isReadOnly = true;
	vm.rate = 7;
	vm.max = 10;
	vm.isLiked = false;
})
