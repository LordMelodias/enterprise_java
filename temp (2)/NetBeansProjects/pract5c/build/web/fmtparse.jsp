<%-- 
    Document   : index
    Created on : 28-Aug-2023, 11:58:53?am
    Author     : Rohit
--%>

</-- parseNumber: Parses the string representation of a currency, percentage, or number.-->

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
  
<html>  
  <head>  
 <title>fmt:parseNumber tag</title>  
  </head>  
  <body>  
<h3>The fmt:parseNumber tag Example is:</h3>  
  
<c:set var="Amount" value="786.970" />  
  
    <fmt:parseNumber var="j" type="number" value="${Amount}" />  
    <p><i>Amount is:</i>  <c:out value="${j}" /></p>  
  
    <fmt:parseNumber var="j" integerOnly="true" type="number" value="${Amount}" />  
    <p><i>Amount is:</i>  <c:out value="${j}" /></p>  
  </body>  
</html>  
