/**
 * Created by vdraj on 8/28/2016.
 */
//Home Carousel Controller
app.controller('HomeCarouselCtrl', function($scope,$http) {
    self.carousels = [{}];
    $http.get("http://localhost:8080/service/headCarousel").then(function(response) {
        $scope.carousels = response.data;
        console.log(response.mainCarousels);
    })

});

