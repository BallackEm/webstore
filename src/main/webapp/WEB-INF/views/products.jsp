<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<title>Products</title>
</head>
<body>
	<section>
		<div class='jumbotron'>
			<div class='container'>
				<h1>Products</h1>
				<p>All our products in our store</p>
			</div>
		</div>
	</section>
	<section class="container">
		<div class="row">
			<c:forEach items="${products}" var="product">
				<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
					<div class="thumbnail">
						<h3>${product.name}</h3>
						<p>${product.description}</p>
						<p>${product.unitPrice} USD</p>
						<p>Available ${product.unitsInStock} units in stock</p>
						<p>
							<a href=" <spring:url value= "/products/product?id=${product.productId}" /> " class="btn btn-primary">
								<span class="glyphicon-info-sign glyphicon"/></span> Details
							</a>
						</p>
					</div>
				</div>
			</c:forEach>
		</div>
	</section>
</body>
</html>
