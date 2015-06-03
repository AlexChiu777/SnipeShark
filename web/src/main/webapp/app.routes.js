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
        .when('/tvshow', {
            templateUrl: 'sections/tvshow/tvshow.tpl.html',
            controller: 'TVShowsController as tvshow'
        })
        .when('/movies', {
            templateUrl: 'sections/movies/movies.tpl.html'
        })
        .when('/about', {
            templateUrl: 'sections/about/about.tpl.html'
        })
        .when('/signin', {
            templateUrl: 'sections/signin/signin.tpl.html'
        })
        .when('/signup', {
            templateUrl: 'sections/signup/signup.tpl.html'
        })
        .otherwise({
            redirectTo: '/'
        });
}