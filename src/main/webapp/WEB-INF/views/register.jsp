<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Register</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/MyStyles.css">
</head>
<body>
	
	<header>
	       <h1>Welcome to Amz!</h1>
	   </header>

<%@ include file="header.jsp" %>

<div class="register-container">
    <h2>Register at AMZ</h2>
    <form action="${pageContext.request.contextPath}/register-customer" method="post">
        <input type="text" name="name" placeholder="Full Name" required />
        <input type="email" name="email" placeholder="Email Address" required />
        <input type="password" name="password" placeholder="Password" required />
        <input type="text" name="address" placeholder="Address" required />
        <input type="number" name="mobile" placeholder="Mobile Number" required />
        <input type="submit" value="Register" />
    </form>
    <div class="footer">
        <p>Already have an account? <a href="login.jsp">Login</a></p>
    </div>
</div>

<%@ include file="footer.jsp" %>

</body>
</html>
