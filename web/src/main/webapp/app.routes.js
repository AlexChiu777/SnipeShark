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
        .when('/tvshow/search', {
            templateUrl: 'sections/tvshow/tvshow.tpl.html',
            controller: 'TVShowsController as tvshow',
            resolve: {
                toggle: function() {
                    return true;
                }
            }
        })
        .when('/tvshow/recent', {
            templateUrl: 'sections/tvshow/tvshow.tpl.html',
            controller: 'TVShowsController as tvshow',
            resolve: {
                toggle: function() {
                    return false;
                }
            }
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