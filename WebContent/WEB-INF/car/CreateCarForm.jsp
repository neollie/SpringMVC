<html>
<body>
	<h3>Form triggering /FirstSpringMVCProject/car/create method which manually bind request params to object </h3>
	<form action="/FirstSpringMVCProject/car/create" method="post">
		<p>
			Name <input type="text" name="carModel">
		</p>
		<p>
			Age <input type="text" name="maxSpeed">
		</p>
		<input type="submit" value="Submit">
	</form>
	<br>
		<h3>Form triggering /FirstSpringMVCProject/car/create2 method using @ModuleAttribute</h3>
	<form action="/FirstSpringMVCProject/car/create2" method="post">
		<p>
			Name <input type="text" name="carModel">
		</p>
		<p>
			Age <input type="text" name="maxSpeed">
		</p>
		<input type="submit" value="Submit">
	</form>
</body>
</html>