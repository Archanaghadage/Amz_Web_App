<html>
<head>
	<head>
	    <meta charset="UTF-8">
	    <title>Amz-Online Shopping</title>
	    <link rel="stylesheet" href="styles/MyStyles.css"> <!-- Link to your CSS file -->
	   
	</head>
</head>

<header>
       <h1>Welcome to Amz!</h1>
   </header>
<body>
	<%@ include file="header.jsp" %>

    <h2>${msg}</h2>

    <form action="/" method="get">
        <button type="submit" class="btn">Proceed</button>
    </form>
	
	<%@ include file="footer.jsp" %>
	<h2>About Us</h2>
	<p>Welcome to Amz, your one-stop shop for all your needs!  We offer a wide variety of products at competitive prices.  Browse our selection and find something you love!</p>

</body>
</html>
