<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>First Form</title>
</head>
<body>

	<h1>Person full name: ${person.firstName} |${person.lastName}| from ${person.planet} </h1>
	<h2>Mother tongue: ${person.language}</h2>
	
	<ul>
		Operating systems: 
		<c:forEach var="os" items="${person.operatingSystems}">
			<li>
				${os}
			</li>	
		</c:forEach>
	</ul>
	
	<p>
		Postal code: ${person.postalCode}
	</p>
	
	<p>
		Lucky number: ${person.luckyNumber}
	</p>

	<p>
		<a href="/spring_MVC_01/v01/form">Go Back to first form.</a>
	</p>
	<p>
		<a href="/spring_MVC_01/v02/form">Go Back to second form.</a>
	</p>
</body>
</html>