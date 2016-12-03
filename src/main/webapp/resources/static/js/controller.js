app.controller('controller', function($scope,$q,$http,moment) {
$scope.noteObj = {};
$scope.testData = "MyTestData";
$scope.notes = [];

     $scope.addNote = function(){
        $http({
            method: "POST",
            headers: {'Content-Type': 'application/json'},
            data: $scope.noteObj,
            url : "http://localhost:8080/spring-hibernate-example/addNote",
            transformResponse: [function(data){
                return data;
            }]
        }).then(function onSuccess(response){
            alert("success");
            //$scope.notes.push($scope.noteObj);
            $scope.noteObj = {};
        });
                
    };

    $scope.fetchNotes = function(){
        alert("");
        $http({
            method: "GET",
            headers: {'Content-Type': 'application/json'},
            url : "http://localhost:8080/spring-hibernate-example/getNotes"

        }).then(function onSuccess(response){
            alert("success in fetchNotes");
            $scope.notes = response.data;
        });
    }

    $scope.fetchNotes();
    

});
