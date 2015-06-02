'use strict';
angular
    .module('app.config', [])
    .config(config);

function config ($sceDelegateProvider) {
    $sceDelegateProvider.resourceUrlWhitelist([
        // Allow same origin resource loads.
        'self',
        // Allow loading from our assets domain.  Notice the difference between * and **.
        'http://thetvdb.com//**'])
}