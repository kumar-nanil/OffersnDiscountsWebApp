var app = angular.module("myApp", ["ngRoute"]);
app.config(function($routeProvider) {
    $routeProvider
        .when("/", {
            templateUrl : "../app/ondhome.html"
        })
        .when("/flipkart", {
            templateUrl : "red.htm"
        })
        .when("/green", {
            templateUrl : "green.htm"
        })
        .when("/blue", {
            templateUrl : "blue.htm"
        });
});

app.directive('topheader',function() {
    return {
        restrict : 'A',
        replace : true,
        templateUrl : "../app/topheader.html"
    }
});

app.directive('headercarousel',function() {
    return {
        restrict : 'A',
        replace : true,
        templateUrl : "../app/headercarousel.html"
    }
});

app.directive('handpickedoffers',function() {
    return {
        restrict : 'A',
        replace : true,
        templateUrl : "../app/handpickedoffers.html"
    }
});

app.directive('footer',function() {
    return {
        restrict : 'A',
        replace : true,
        templateUrl : "../app/footer.html"
    }
});

