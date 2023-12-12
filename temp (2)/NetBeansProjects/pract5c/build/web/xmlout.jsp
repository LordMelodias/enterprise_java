<%-- 
    Document   : index
    Created on : 28-Aug-2023, 10:37:28?am
    Author     : Rohit
--%>

<!-- Xml tag = provide way of manipulating and creating XML documents -->
<!-- out tag = used to display -->

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
 <%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>  
  
<html>  
<head>  
 <title>XML Tags</title>  
</head>  
<body style="background-image: linear-gradient(skyblue, gray)">  
<h2>Vegetable Information:</h2>  
<c:set var="vegetable">  
<vegetables>  
    <vegetable>  
      <name>onion</name>    
    </vegetable>    
</vegetables>  
</c:set>  
<x:parse xml="${vegetable}" var="output"/>  
<b>Name of the vegetable is</b>:  
<x:out select="$output/vegetables/vegetable[1]/name" />
</body>  
</html>  
