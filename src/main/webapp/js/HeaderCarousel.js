/**
 * Created by vdraj on 8/20/2016.
 */
app.controller('HeaderCarouselCtrl', function($scope, $http) {
    console.log("Header Carousel");
    self.offersSet = [{}];
    $http.get("https://offersndiscounts-142723.appspot.com/service/headcarousel").then(function(response) {
        $scope.offerSet = response.data;
        console.log(response.data);
    })
})
