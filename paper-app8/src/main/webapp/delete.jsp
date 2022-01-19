<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<title>Delete operation file</title>

</head>
<body
	style="background-image: url('C:/Users/Surya/Desktop/JAVA images/pile-fresh-morning-newspapers-on-260nw-786606589.jpg'); background-repeat: no-repeat; background-size: 100%;">


	<header
		style="color: navy; margin-top: 0%; text-align: center; font-style: oblique; border-style: groove; border-color: aqua; background-color: fuchsia;">
		<h1>Welcome to NewsPaper App</h1>
	</header>
	
	<header style="color: red;">
		<h1>${Message}</h1>
	</header>

	<form action="deleteNewsPaper.do">
		<label>Delete News Paper:</label><input type="text"
			name="newsPaperName" placeholder="Enter News Paper"> <input
			type="submit" value="delete" style="color: red;">

	</form>

	
	<footer
		style="color: gray; margin-top: 5%; text-align: center; font-style: oblique; border-style: groove; border-color: teal; background-color: maroon;">

		<h3>@Copy Right</h3>
	</footer>

</body>

</html>
