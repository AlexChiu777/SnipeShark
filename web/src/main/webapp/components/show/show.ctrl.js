'use strict';
angular.module('app.services').controller('ShowController', function($scope) {
	$scope.isCollapsed = true;
	$scope.isReadOnly = true;
	$scope.rate = 7;
	$scope.max = 10;
	$scope.isLiked = false;
})
