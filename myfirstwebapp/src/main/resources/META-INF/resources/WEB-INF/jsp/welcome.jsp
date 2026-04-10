<html>
<head>
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css"
	rel="stylesheet">
<title>Welcome Page</title>
</head>
<body>
	<%@ include file="common/navigation.jspf"%>
	<div class="container">
		<h1>Welcome ${name}</h1>

		<a href="list-todos">Manage</a> your todos
	</div>


</body>
</html>