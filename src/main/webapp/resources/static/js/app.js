var app = angular.module('app',  ['ngRoute']);

app.config(function($routeProvider) {
	$routeProvider
		.when('/', {
			templateUrl : 'resources/static/pages/dashboard/dashboard.html',
			controller  : 'dashboardController'
		})

		.when('/about', {
			templateUrl : 'resources/static/pages/about/about.html',
			controller  : 'aboutController'
		})

		.when('/contact', {
			templateUrl : 'resources/static/pages/contact/contact.html',
			controller  : 'contactController'
		});
});
