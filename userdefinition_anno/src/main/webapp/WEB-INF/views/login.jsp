<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="wrapper">
	<br><br><br><br><br><br><br><br><br><br><br><br>
	<div class="col-sm-4"></div>
	
	<div class="col-sm-4">
		<form class="form-signin" action="/login">
			<h2 class="form-signin-heading">Please login</h2>
			<input type="text" class="form-control" name="id" placeholder="ID" required="" autofocus="" />
			<br>
		 	<input type="password" class="form-control" name="password" placeholder="Password" required="" /> 
			<br><br>
			<button class="btn btn-lg btn-primary btn-block" type="submit">Login</button>
		</form>
	</div>
	
	<div class="col-sm-4"></div>
 
</div>
</body>
</html>
