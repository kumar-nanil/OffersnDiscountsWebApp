/**
 * Created by vdraj on 8/28/2016.
 */
//Home Carousel Controller
app.controller('HomeCarouselCtrl', function($scope,$http) {
    self.carousels = [{}];
    $http.get("https://offersndiscounts-142723.appspot.com/service/headcarousel").then(function(response) {
    //$http.get("http://localhost:8080/service/headcarousel").then(function(response) {
        $scope.carousels = response.data;
    })

});

