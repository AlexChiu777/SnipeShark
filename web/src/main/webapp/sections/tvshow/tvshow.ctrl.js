angular.module('app').controller("TVShowsController", function(ShowService) {
        var vm = this;
        vm.data = '';
        vm.shows = '';
        vm.loading = true;

        vm.getTVSeriesByName = function() {
                vm.loading = true;
                ShowService.getShowByName(vm.data).then(
                    function(response) {
                            vm.shows = response;
                            vm.loading = false;
                    });
        };

        //toggle between search and recently added
        vm.toggle = null;
});