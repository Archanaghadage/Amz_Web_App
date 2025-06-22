<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Cart</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/MyStyles.css">
</head>
<body>

<%@ include file="header.jsp" %>

<div class="container">
    <h2>🛒 Your Cart</h2>
    <c:if test="${empty cartList}">
        <p>Your cart is empty.</p>
    </c:if>
    <c:forEach var="item" items="${cartList}">
        <p>${item.name} - ₹${item.price}</p>
    </c:forEach>
	
	<h2>About Us</h2>
	<p>Welcome to Amz, your one-stop shop for all your needs!  We offer a wide variety of products at competitive prices.  Browse our selection and find something you love!</p>
</div>

<%@ include file="footer.jsp" %>

</body>
</html>
