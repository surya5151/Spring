<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${ValidationMessage}</h1>
	
	
	
	<header
		style="color: navy; margin-top: 0%; text-align: center; font-style: oblique; border-style: groove; border-color: aqua; background-color: fuchsia;">
		<h1>Thanks for given Details</h1>
	</header>


	NAME:
	<input type="text" value=${NAME}>
	<br> PRICE:
	<input type="text" value=${PRICE} >
	<br> LANGUAGE:
	<input type="text " value=${LANGUAGE} >
	<br> NO_OF_PAGES:
	<input type="text" value=${NOOFPAGES} >
	<br>





	<footer
		style="color: gray; margin-top: 20%; text-align: center; font-style: oblique; border-style: groove; border-color: teal; background-color: maroon;">

		<h3>@Copy Right</h3>
</body>
</html>