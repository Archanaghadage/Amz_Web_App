<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/MyStyles.css">
</head>
<body>

	<header>
	       <h1>Welcome to Amz!</h1>
	   </header>
<%@ include file="header.jsp" %>

<div class="login-container">
    <h2>Login to AMZ</h2>
    <form action="${pageContext.request.contextPath}/verify-login" method="post">
        <input type="text" name="userId" placeholder="Enter User ID" required />
        <input type="password" name="pass" placeholder="Enter Password" required />
        <input type="submit" value="Login" />
    </form>
    <div class="footer">
        <p>Don't have an account? <a href="register.jsp">Register</a></p>
    </div>
</div>

<%@ include file="footer.jsp" %>

</body>
</html>
