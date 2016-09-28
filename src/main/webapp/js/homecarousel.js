/**
 * Created by vdraj on 8/28/2016.
 */
//Home Carousel Controller
app.controller('HomeCarouselCtrl', function($scope,$http) {
    self.carousels = [{}];
    $http.get("https://offersndiscounts-142723.appspot.com/service/headcarousel").then(function(response) {
        $scope.carousels = response.data;
        console.log(response.mainCarousels);
    })

});

