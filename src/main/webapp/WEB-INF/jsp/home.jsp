<!DOCTYPE html>
<html lang="en" ng-app="app" class="no-js">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">

<title>Spring-MVC Hibernate Example</title>
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="resources/static/css/app.css">
<link rel="stylesheet" href="resources/static/css/bootstrap.min.css">
</head>
<body ng-controller="controller">

	<div>

		<nav class="navbar navbar-default">
			<div class="container">
				<div class="navbar-header">
					<a class="navbar-brand" href="#/">SpringMVC-Hiberante-App</a>
				</div>

				<ul class="nav navbar-nav navbar-right">
					<li><a href="#/"><i class="fa fa-home"></i> Dashboard</a></li>
					<li><a href="#about"><i class="fa fa-shield"></i> About Me</a></li>
					<li><a href="#contact"><i class="fa fa-comment"></i>
							Contact Me</a></li>
				</ul>
			</div>
		</nav>

		<div id="main">

			<div ng-view></div>

		</div>
	</div>

	<script src="resources/static/js/angular.min.js"></script>
	<script src="resources/static/js/angular-route.js"></script>
	<script src="resources/static/js/app.js"></script>
	<script src="resources/static/js/controller.js"></script>

	<script src="resources/static/pages/about/aboutController.js"></script>
	<script src="resources/static/pages/contact/contactController.js"></script>
	<script src="resources/static/pages/dashboard/dashboardController.js"></script>

	<script src="resources/static/js/jquery-3.1.1.min.js"></script>
</body>
</html>