app.controller('controller', function($scope,$q,$http,moment) {
$scope.noteObj = {};
$scope.testData = "MyTestData";
$scope.notes = [];
$scope.deleteId = '';

     $scope.addNote = function(){
    	 $scope.noteObj.id = new Date().getTime();
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
            $scope.notes.push($scope.noteObj);
            url : "http://localhost:8080/spring-hibernate-example/getNotes"
        });
    };
    
    $scope.deleteNote = function(id){
    	//alert("id:"+id);
    	$scope.deleteId = id;
    	$http({
    		method: "GET",
    		 headers: {'Content-Type': 'application/json'},
    		 url : "http://localhost:8080/spring-hibernate-example/deleteNote/"+$scope.deleteId
    	}).then(function onSuccess(response){
    		alert("success in delete()");
    	});
    };

    $scope.fetchNotes = function(){
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
