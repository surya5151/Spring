<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<title>Wellcome Spring MVC</title>

</head>
<body
	style="background-image: url('C:/Users/Surya/Desktop/JAVA images/pile-fresh-morning-newspapers-on-260nw-786606589.jpg'); background-repeat: no-repeat; background-size: 100%;">


	<header
		style="color: navy; margin-top: 0%; text-align: center; font-style: oblique; border-style: groove; border-color: aqua; background-color: fuchsia;">
		<h1>Welcome to NewsPaper App</h1>
	</header>
	<header style="color: red;">
		<h1>${ValidationMessage}</h1>
	</header>

	<form action="subimtNewspaper.do">
		<pre style="color: black; font-size: large;">
	
		NAME:<input type="text" name="newsPaperName"
				placeholder="Enter news paper Name" inputRef=(register({required:"Nameshouldenter"}))>
		<p style="color: red">${validateName}</p> 
		
		
		PRICE:<input type="text" name="price" placeholder="Enter Price">
	<p style="color: red">${validateLanguage}</p>
		
		
		LANGUAGE:<input type="text " name="language"
				placeholder="Enter Language">		
		<p style="color: red">${validatePrice}</p> 
		
		NO_OF_PAGES:<input type="text" name="noOFPages"
				placeholder="Enter NoOfPages">
		<p style="color: red">${validatePages}</p> 
		
		 <input type="submit" value="Save" onclick="validate()"
				style="color: red; background-color: yellow;">

		</pre>

	</form>

	<h1>${searchvalidationMessage}</h1>
	<form action="searchNewsPaper.do">
		<label>Search News Paper:</label><input type="text"
			name="searchNewsPaper" placeholder="Enter News Paper Name"> <input
			type="submit" value="searchNewsPaper" style="color: red;">

	</form>

	<h1>${NOTFOUND}</h1>
	<ol>
		<li>${NEWSPAPERNAME}</li>
		<li>${PRICE}</li>
		<li>${LANGUAGE}</li>
		<li>${NOOFPAGES}</li>

	</ol>

	<h1>${SearchValidation}</h1>
	<form action="searchLanguage.do">
		<label>Search Language:</label><input type="text"
			name="searchLanguage" placeholder="Enter Language"> <input
			type="submit" value="searchLanguage">


		<div>
		<br><br>
			<a href="getAllNewsPaper.do">ViewAllNewsPaper</a> <br>
			<br><br>
			<c:forEach items="${ListOfNewspaper}" var="newsPaperObj">

				<tr>
					<td>${newsPaperObj.newsPaperName}</td>
					<br><br>
					<td>${newsPaperObj.price}</td>
					<br><br>
					<td>${newsPaperObj.language}</td>
					<br><br>
					<td>${newsPaperObj.noOFPages}</td>
					<br><br>
				</tr>

			</c:forEach>
		</div>
		
	</form>
	
	<h1>${validateDeleteMessage}</h1>
		<form action="deleteNewsPaper.do">
		<label>Delete News Paper:</label><input type="text"
			name="newsPaperName" placeholder="Enter News Paper"> <input
			type="submit" value="deleteNewsPaper" style="color: red;">	
			
	</form>




	<footer
		style="color: gray; margin-top: 5%; text-align: center; font-style: oblique; border-style: groove; border-color: teal; background-color: maroon;">

		<h3>@Copy Right</h3>
	</footer>

</body>

</html>
