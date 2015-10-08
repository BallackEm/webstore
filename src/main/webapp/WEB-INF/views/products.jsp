<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css"> 
<title>Products</title>
</head>
<body>
	         <section>
		<div class='jumbotron'>
			<div class='container'>
				<h1>Products</h1>
				<p>All our products in our store</p>
			</div>
		</div>
	</section>
	<section class="container">
		<div class="row">
			<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
				<div class="thumbnail">
					<h3>${product.name}</h3>
					<p>${product.description}</p>
					<p>${product.unitPrice} USD</p>
					<p>Available ${product.unitsInStock} units in stock</p>
				</div>
			</div>
		</div>
	</section>
</body>
</html>