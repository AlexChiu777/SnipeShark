angular
    .module('app').controller("TVShowsController", function(ShowService) {
        var vm = this;
        vm.data = '';
        vm.shows = '';
        vm.loading = true;
            vm.numPerPage  = 2;
            vm.pageRange  = 2;

        vm.getTVSeriesByName = function() {
                vm.loading = true;
                ShowService.getShowByName(vm.data).then(
                    function(response) {
                            vm.shows = response;
                            angular.forEach(vm.shows, function(show) {
                                show.pagedOverview = show.overview.match(/[\s\S]{1,50}/g) || [];
                                show.currentPage = 1;
                                    vm.shows.show = show;
                            })
                            vm.loading = false;
                    });
        };

        //toggle between search and recently added
        vm.toggleItem = 'recent';

        vm.toggleMenu = function(stringToCompare) {
                return angular.equals(vm.toggleItem, stringToCompare);
        }
});