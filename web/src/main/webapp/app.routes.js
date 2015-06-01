'use strict';
angular
    .module('app.routes', ['ngRoute'])
    .config(config);

function config ($routeProvider) {
    $routeProvider.
        when('/', {
            templateUrl: 'sections/home/home.tpl.html',
            controller: 'HomeController as home'

        })
        .when('/tvsearch', {
            templateUrl: 'sections/tvsearch/tvsearch.tpl.html',
            controller: 'TVSearchController as tvsearch'
        })
        .otherwise({
            redirectTo: '/'
        });
}