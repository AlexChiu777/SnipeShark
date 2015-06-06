angular
    .module('app').controller("TVShowsController", function (ShowService) {
        var vm = this;
        vm.data = '';
        vm.shows = '';
        vm.loading = true;

        vm.panelClass = ['panel-primary', 'panel-success', 'panel-info', 'panel-warning', 'panel-danger'];


        vm.getTVSeriesByName = function () {
            vm.loading = true;
            ShowService.getShowByName(vm.data).then(
                function (response) {
                    vm.shows = response;
                    vm.loading = false;

                });
        };

        vm.collapseShowDetail = function(id, index) {
            if (vm.shows[index].loaded == null || vm.shows[index].loaded == false) {
                loadFullSeries (vm, id, index, ShowService);
            } else {
                vm.shows[index].isDetails = !vm.shows[index].isDetails;
            }
        }



        //toggle between search and recently added
        vm.toggleItem = 'recent';

        vm.toggleMenu = function (stringToCompare) {
            return angular.equals(vm.toggleItem, stringToCompare);
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

            vm.shows[index] = specificShow;
        })
};