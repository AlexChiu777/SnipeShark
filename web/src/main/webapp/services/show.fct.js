angular
    .module('app.services')
    .constant('BASE_URL', 'http://localhost:8080/rest/tv/')
    .factory('ShowService', dataService);

function dataService($http, BASE_URL) {
    var data = {
        'getShowById': getShowById,
        'getShowByName': getShowByName,
        'getFullShowById': getFullShowById,
        'getEpisodeById': getEpisodeById,
        'getTVPremiere' : getTVPremiere,
        'getPopularTV' : getPopularTV
    };

    return data;


    function makeRequest(url) {
        return $http({
            'url': url,
            'method': 'GET',
            'headers': {'Content-Type': 'application/json'},
            'cache': true
        }).then(function (response) {
            return response.data;
        }).catch(dataServiceError);
    }

    function getShowById(id) {
        var requestURL = BASE_URL + '1/series/id/' + id;
        return makeRequest(requestURL);
    }

    function getShowByName(name) {
        var requestURL = BASE_URL + '1/series/name/' + name;
        return makeRequest(requestURL)
    }

    function getFullShowById(id) {
        var requestURL = BASE_URL + '1/series/full/id/' + id;
        return makeRequest(requestURL);
    }

    function getEpisodeById(id) {
        var requestURL = BASE_URL + '1/episode/id' + id;
        return makeRequest(requestURL);
    }

    function getPopularTV() {
        var requestURL = BASE_URL + '2/tv/popular';
        return makeRequest(requestURL);
    }

    function getTVPremiere() {
        var requestURL = BASE_URL + '2/tv/premiere';
        return makeRequest(requestURL);
    }

    function dataServiceError(errorResponse) {
        $log.error('XHR Failed for ShowService');
        $log.error(errorResponse);
        return errorResponse;
    }
}