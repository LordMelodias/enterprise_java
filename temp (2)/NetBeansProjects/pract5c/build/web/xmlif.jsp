<%-- 
    Document   : index
    Created on : 28-Aug-2023, 10:53:59?am
    Author     : Rohit
--%>

<!-- xml tag -->
<!-- if core tag -->

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>  
<html>  
<head>  
  <title>x:if Tags</title>  
</head>  
<body>  
<h2>XML if tag:</h2>  
<c:set var="values">  
<values>  
    <value>  
      <user>40</user>  
    </value>    
</values>  
</c:set>  
<x:parse xml="${values}" var="output"/>  
<x:if select="$output/values/value/user < 100">  
   User value are low.  
</x:if>  
</body>  
</html> 