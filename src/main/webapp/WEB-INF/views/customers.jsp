<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<title>Customers</title>
</head>
<body>
	<section>
		<div class='jumbotron'>
			<div class='container'>
				<h1>Customers</h1>
				<p>All our customers in our store</p>
			</div>
		</div>
	</section>
	<section class="container">
		<div class="row">
			<c:forEach items="${customers}" var="customer">
				<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
					<div class="thumbnail">
						<h3>${customer.customerId}</h3>
						<p>${customer.name}</p>
						<p>${customer.address} USD</p>
						<p>Available ${customer.noOfOrdersMade} </p>
					</div>
				</div>
			</c:forEach>
		</div>
	</section>
</body>
</html>

