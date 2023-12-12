<%-- 
    Document   : login
    Created on : 01-Sept-2023, 8:57:52?pm
    Author     : Rohit
--%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Login</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="hello-box">
        <h2>Login</h2>
        <form method="post" action="LoginServlet">
            <div class="user-box">
                <input type="text" name="username" id="username" required>
                <label >Username</label>
            </div>
            <div class="user-box">
                <input type="password" name="password" id="password" required>
                <label >Password</label>
            </div>
            <div name="btn">
                <span></span>
                <span></span>
                <span></span>
                <span></span>
                <button type="Submit" name="submit">Submit</button>
            </div>
        </form>
    </div>

    <p>
        <%-- Display error messages if there are any --%>
        <c:if test="${param.error ne null}">
            <span style="color: red">${param.error}</span>
        </c:if>
    </p>
</body>
</html>

