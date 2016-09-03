/**
 * Created by vdraj on 8/16/2016.
 */
//Header Controller
app.controller('OfferSetCtrl', function($scope,$http) {
    console.log("Jai Sri Ram!");
    self.offersSet = [{}];
    $http.get("js/package.json").then(function(response) {
        $scope.offerSet = response;
        console.log(response.data.name);
    })

});
