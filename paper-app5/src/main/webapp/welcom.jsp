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
	
		NAME:<input type="text" name="newsPaperName"><br> 
		
		PRICE:<input type="text" name="price"><br> 
		
		LANGUAGE:<input type="text " name="language"><br>
		
		NO_OF_PAGES:<input type="text" name="noOFPages"><br>
		 
		 <input type="submit" value="Save"
				style="color: red; background-color: yellow;">

		</pre>

	</form>


	<h1>${searchvalidationMessage}</h1>
	<form action="searchNewsPaper.do">
		<label>Search News Paper:</label><input type="text"
			name="searchNewsPaper"> <input type="submit"
			value="searchNewsPaper" style="color: red;">

	</form>
	<h1>${NOTFOUND}</h1>
	<ol>
		<li>${NEWSPAPERNAME}</li>
		<li>${PRICE}</li>
		<li>${LANGUAGE}</li>
		<li>${NOOFPAGES}</li>

	</ol>



	<footer
		style="color: gray; margin-top: 5%; text-align: center; font-style: oblique; border-style: groove; border-color: teal; background-color: maroon;">

		<h3>@Copy Right</h3>
	</footer>



</body>

</html>
