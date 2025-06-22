<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Home | AMZ</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/MyStyles.css">
</head>

    <header>
       <h1>Welcome to Amz!</h1>
   </header>
<body>

<%@ include file="header.jsp" %>

<div class="container">
       <h2>Featured Products</h2>

       <div class="product-grid">
           <div class="product-item">
               <img src="images/mobile.jpeg" alt="Product 1">
               <h3>Mobile</h3>
               <p>Description of product 1.</p>
               <p class="price">$19.99</p>
               <a href="#">Add to Cart</a>
           </div>

           <div class="product-item">
               <img src="images/tshirt.jpeg" alt="Product 2">
               <h3>T-Shirt</h3>
               <p>Description of product 2.</p>
               <p class="price">$29.99</p>
               <a href="#">Add to Cart</a>
           </div>

           <div class="product-item">
               <img src="images/bag.jpeg" alt="Product 3">
               <h3>Bag</h3>
               <p>Description of product 3.</p>
               <p class="price">$39.99</p>
               <a href="#">Add to Cart</a>
           </div>

           <!-- Add more product items here -->
       </div>
	   <h2>About Us</h2>
	   	   <p>Welcome to Amz, your one-stop shop for all your needs!  We offer a wide variety of products at competitive prices.  Browse our selection and find something you love!</p>


<%@ include file="footer.jsp" %>

</body>
</html>
