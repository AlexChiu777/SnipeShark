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

function controller ($scope) {


	if ($scope.show.fanart == null) {
		$scope.show.fanart = 'asset/img/placeholder.png';
	}

	$scope.show.genres = ["horror", "mystery", "adventure"];


}
