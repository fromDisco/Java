<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>First Form</title>
</head>
<body>

	<h1>original request data: ${param.personName}</h1>
	<h1>Processed data: ${name}</h1>
	
	<p>
		${pageContext.request.contextPath}
	</p>
	
	<p>
		<a href="/spring_MVC_01/v01/form">Go Back to first form.</a>
	</p>
	<p>
		<a href="/spring_MVC_01/v02/form">Go Back to second form.</a>
	</p>
	
    
</body>
</html>