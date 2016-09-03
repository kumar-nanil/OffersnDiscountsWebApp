/**
 * Created by vdraj on 8/28/2016.
 */
//Home Carousel Controller
app.controller('HomeCarouselCtrl', function($scope,$http) {
    console.log("Jai Sri Ram!");
    self.carousels = [{}];
    $http.get("js/headercarousel.json").then(function(response) {
        $scope.carousels = response.data;
        console.log(response.mainCarousels);
    })

});

