angular.module('app', []).controller('indexController', function ($scope, $http) {
    const contextPath = 'http://localhost:8084/app';

   $scope.loadProducts = function () {
           $http.get(contextPath + '/product/all')
               .then(function (response) {
                   $scope.products = response.data;
               });
       };
    $scope.delProduct = function(prodId){
    $http.get(contextPath+'/product/delete'+ prodId)
    .then(function(response)){
    $scope.loadProducts();
    }
    };
});