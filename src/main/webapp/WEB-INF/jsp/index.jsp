<!DOCTYPE HTML>
<html>
<head>

<meta charset="utf-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">
<title>Welcome</title>

</head>
<body>
	<div style="padding: 30px;" class ="text-table">
	<h3>${message}</h3>
	<a class="btn btn-secondary btn-lg" href="${pageContext.request.contextPath}/moneyList" role="button">Get</a>
	</div>
	<div style="padding: 30px;" class ="text-table">
		<h2>Get Offices Income</h2>
		<form role="form" style="width: 300px" action="officeList" method="POST">
			<div class="form-group">
				<label for="email">Date from:</label> <input type="date" name="date1"
					class="form-control" id="date1">
			</div>
			<div class="form-group">
				<label for="email">Date to:</label> <input type="date" name="date2"
					class="form-control" id="date2">
			</div>
			
			<button type="submit" class="btn btn-secondary btn-lg">Send</button>
		</form>
	</div>
	
</body>
</html>