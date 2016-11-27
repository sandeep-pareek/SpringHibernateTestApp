app.controller('controller', function($scope,$q,$http,moment) {
$scope.noteObj = {};
$scope.testData = "MyTestData";
$scope.notes = [];

  
    $scope.addNote = function(){
    	$http({
            method: "POST",
            headers: {'Content-Type': 'application/json'},
            data: $scope.noteObj,
            url : "http://localhost:8080/spring-hibernate-example/addNote"
            //transformResponse: [function(data){
             //   return data;
            //}]
        }).then(function onSuccess(response){
            alert("success");
        });
    			
    }
    

});
