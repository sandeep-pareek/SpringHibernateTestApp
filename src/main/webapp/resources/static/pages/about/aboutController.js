'use strict';

app
		.controller(
				'aboutController',
				function($scope) {
					$scope.message = 'This is Sandeep Pareek here.';
					$scope.shortBio = 'Hi Folks, \n'
							+ 'This is Sandeep Pareek. I work as Software developer in a Germany based IT company '
							+ 'in Pune, India. My area of interest in development includes JavaEE, '
							+ 'Hibernate, SpringMVC, AngularJS. \n'
							+ 'I am always a student and love to work on new challanges.'
							+ 'Have a question or query? You can email me directly.'
							+ 'Thanks for reading about me. Happy learning!';

				});