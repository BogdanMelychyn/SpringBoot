<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="j"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">
<title>Office Income</title>

</head>
<body>
	<h1>Office Income</h1>


	<div>
		<table class="table">
			<thead>
				<tr>
					<th scope="col">Office Code</th>
					<th scope="col">City</th>
					<th scope="col">Country</th>
					<th scope="col">Amount</th>
				</tr>
			</thead>
			<tbody>
				<j:forEach items="${officeList}" var="office">
					<tr>
						<td>${office.officeCode}</td>
						<td>${office.city}</td>
						<td>${office.country}</td>
						<td>${String.format("%.2f", office.income)}</td>
					</tr>
				</j:forEach>
			</tbody>
		</table>
	</div>


</body>
</html>