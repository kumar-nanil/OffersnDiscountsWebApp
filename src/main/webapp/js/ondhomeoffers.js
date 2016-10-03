/**
 * Created by vdraj on 10/1/2016.
 */
//OnD Home Carousel Controller
app.controller('OnDHomeOffersCtrl', function($scope,$http) {
    self.mainoffers = [{}];
    //$http.get("https://offersndiscounts-142723.appspot.com/service/headcarousel").then(function(response) {
        $http.get("http://localhost:8080/service/mainoffers").then(function(response) {
        $scope.mainoffers = response.data;
    })

});

