/**
 * Created by vdraj on 10/3/2016.
 */
/**
 * Created by vdraj on 9/14/2016.
 */
app.controller('HomeBodyController', function($scope, $http) {
    console.log("HomeBody Controller");
    //$http.get("http://localhost:8080/service/mainoffers").then(function(response) {
    $http.get("https://offersndiscounts-142723.appspot.com/service/mainoffers").then(function(response) {
        $scope.categoryoffers = response.data;
    })

    $scope.homebody = function() {
        $(document).ready(function(){
            $('.materialboxed').materialbox();
        });
    }
})
