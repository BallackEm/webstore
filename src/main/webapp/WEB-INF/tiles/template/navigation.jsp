<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<li><a href="<spring:url value="/products"/>">Home</a></li>
<li><a href="<spring:url value="/products/"/>">Products</a></li>
<li><a href="<spring:url value="/products/add"/>">Add Product</a></li>
<li><a href="<spring:url value="/cart/"/>">Cart</a></li>
<li><a href="<c:url value="/j_spring_security_logout" />" class="btn btndanger btn-mini pull-right">logout</a></li>
<li><div class="pull-right"><a href="?language=en">English</a>|<a href="?language=nl">Dutch</a></div></li>			
				
			
