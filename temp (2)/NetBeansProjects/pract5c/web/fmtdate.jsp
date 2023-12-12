<%-- 
    Document   : index
    Created on : 03-Sept-2023, 6:18:02?pm
    Author     : Rohit
--%>

<!-- date = parses the string representation of a time and date -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
  
<html>  
<head>  
  <title>fmt:parseDate Tag</title>  
</head>  
<body>  
<h3>Parsed Date:</h3>  
<c:set var="date" value="12-08-2016" />  
  
<fmt:parseDate value="${date}" var="parsedDate"  pattern="dd-MM-yyyy" />  
<p><c:out value="${parsedDate}" /></p>  
  
</body>  
</html>  
