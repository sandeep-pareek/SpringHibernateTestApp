<!DOCTYPE html>
<html lang="en" ng-app="app" class="no-js">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    
    <title>Spring Hibernate Example</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="resources/static/css/app.css">
    <link rel="stylesheet" href="resources/static/css/bootstrap.min.css">
</head>
<body ng-controller="controller">
	<div class="jumbotron text-center">
		<h1>Welcome tp Spring MVC with Hibernate demo App by Sandeep</h1>
	</div>

	<div class="container">
		<div class="row">
			<div class="col-sm-4">
				Id: <input type="text" id="noteid" ng-model='noteObj.id' /><br/>
				Header: <input type="text" id="noteheader" ng-model='noteObj.header' /><br/>
				Desc: <input type="text" id="notedesc" ng-model='noteObj.description'/><br/>
				<button class="btn btn-primary" ng-click="addNote()">Add Note</button>
				</div>
		</div>
	</div>
	
	<div class="container">
		<div class="row">
		</div>
		<table class="table table-striped table-bordered table-hover table-condensed">
			<tbody>
				<tr ng-repeat="note in notes">
					<td> {{note.id}} </td>
					<td> {{note.header}} </td>
					<td> {{note.description}} </td>
					<td>
<!-- 						<button class="btn btn-success" ng-show="true" ng-click="CalculateTime(card.sl)">Calculate </button> -->
					</td>
				</tr>
			</tbody>
		</table>
		<br/>
		<br/>

	</div>
	
<script src="resources/static/js/angular.min.js"></script>
<script src="resources/static/js/moment.min.js"></script>
<script src="resources/static/js/angular-moment.min.js"></script>
<script src="resources/static/js/app.js"></script>
<script src="resources/static/js/controller.js"></script>
<script src="resources/static/js/jquery-3.1.1.min.js"></script>
</body>
</html>