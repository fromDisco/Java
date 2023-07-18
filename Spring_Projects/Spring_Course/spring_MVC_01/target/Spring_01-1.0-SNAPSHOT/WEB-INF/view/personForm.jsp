<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>First Form</title>
    <style>
    	.error {
    		color: red;
    	}
    </style>
</head>
<body>
	<form:form action="processForm" modelAttribute="person">
		<p>
			First name: <form:input path="firstName" />
		</p>
		<p>
			Last name: <form:input path="lastName" />
			<form:errors path="lastName" cssClass="error" />
		</p>
		
		<p>
			Place of origin:
			<form:select path="planet">
				<form:options items="${person.planets}" />
			</form:select>
		</p>
		
		<p>
			Mother tongue:
			<form:radiobuttons path="language" items="${person.languages}" />
		</p>

		<p>
			Operating systems:
			<form:checkboxes path="operatingSystems" items="${person.operatingSystemsChoice}" />
		</p>
		<p>
			Postal Code:
			<form:input path="postalCode" />
			<form:errors path="postalCode" cssClass="error" />
		</p>
		<p>
			Lucky Number:
			<form:input path="luckyNumber" />
			<form:errors path="luckyNumber" cssClass="error" />
		</p>
		<input type="submit" value="Submit">
	</form:form>
    
</body>
</html>
