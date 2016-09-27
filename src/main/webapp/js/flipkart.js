/**
 * Created by vdraj on 9/14/2016.
 */
app.controller('FlipkartController', function($scope, $http) {
    console.log("Flipkart Controller");
    self.offersOfTheDay = [{}];
    $http.get("http://localhost:8080/service/flipkartdod").then(function(response) {
        $scope.offersOfTheDay = response.data;
    })
})
