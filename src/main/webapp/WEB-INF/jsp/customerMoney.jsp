<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="j"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">
<title>Customer money</title>

</head>
<body>
	<h1>Customer List</h1>


	<div>
		<table class="table">
			<thead>
				<tr>
					<th scope="col">Customer Number</th>
					<th scope="col">Name</th>
					<th scope="col">City</th>
					<th scope="col">Amount</th>
				</tr>
			</thead>
			<tbody>
				<j:forEach items="${customerMoney}" var="customer">
					<tr>
						<td>${customer.customerNumber}</td>
						<td>${customer.name}</td>
						<td>${customer.city}</td>
						<td>${String.format("%.2f", customer.moneySpended)}</td>
					</tr>
				</j:forEach>
			</tbody>
		</table>
	</div>


</body>
</html>