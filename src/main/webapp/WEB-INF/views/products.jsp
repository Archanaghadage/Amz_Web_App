<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Products</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/MyStyles.css">
</head>
<body><%@ include file="header.jsp"%>

	<header>
		<h1>AMZ Product Gallery</h1>
	</header>

	<div class="container">
		<div class="container">
    <h2>Featured Products</h2>

    <form action="/add-to-cart" method="post">
        <div class="product-grid">
            <c:forEach var="product" items="${productList}">
                <div class="product-item">
                    <img src="${product.imgUrl}" alt="${product.name}" />

                    <h3 class="product-title">${product.name}</h3>
                    <p class="product-desc">${product.description}</p>
                    <p class="product-price">₹ ${product.price}</p>
                </div>
            </c:forEach>
        </div>
    </form>
</div>

	</div>

	<%@ include file="footer.jsp"%>

</body>
</html>
