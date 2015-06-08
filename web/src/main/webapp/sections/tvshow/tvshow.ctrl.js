angular
    .module('app').controller("TVShowsController", function (ShowService) {
        var vm = this;



        vm.loading = true;

        //default tab
        vm.toggleItem = 'premiere';

        vm.toggleMenu = function (stringToCompare) {
            return angular.equals(vm.toggleItem, stringToCompare);
        }

        /*FOR POPULAR PAGE*/
        vm.popularshows = '';
        vm.getPopularTV = function () {
            vm.loading = true;
            ShowService.getPopularTV().then (
                function (response) {
                    vm.popularshows = response;
                    vm.loading = false;
                }
            )
        }

        /*FOR PREMIERE PAGE*/
        vm.showpremiere = '';
        vm.getTVPremiere = function () {
            vm.loading = true;
            ShowService.getTVPremiere().then (
                function (response) {
                    vm.showpremiere = response;
                    vm.loading = false;
                }
            )
        }

        /*FOR SEARCH PAGE*/
        vm.panelClass = ['panel-primary', 'panel-success', 'panel-info', 'panel-warning', 'panel-danger'];
        vm.search = '';
        vm.searchShows = '';

        //search TV by name
        vm.getTVSeriesByName = function () {
            vm.loading = true;
            ShowService.getShowByName(vm.search).then(
                function (response) {
                    vm.searchShows = response;
                    vm.loading = false;

                });
        };

        //search menu for
        vm.collapseShowDetail = function(id, index) {
            //loading full details, but also keep in mind to avoid double clicking and requesting twice
            if (vm.searchShows[index].loaded == null || vm.searchShows[index].loaded == false) {
                loadFullSeries (vm, id, index, ShowService);
            } else {
                vm.searchShows[index].isDetails = !vm.searchShows[index].isDetails;
            }
        }


    });

function loadFullSeries (vm, id, index, ShowService) {
    ShowService.getShowById(id).then(
        function (response) {
            var specificShow = response;
            specificShow.overviewPart1 = specificShow.overview.substring(0, 100);
            specificShow.overviewPart2 = specificShow.overview.substring(100, specificShow.overview.length);
            specificShow.isCollapsed = true;
            specificShow.isDetails = true;
            specificShow.loaded = true;

            vm.searchShows[index] = specificShow;
        })
};