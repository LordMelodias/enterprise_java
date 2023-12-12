<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>

<html>
    <body>
        <h3>Formatting Number Tag</h3><!-- comment -->
        <c:set var="vegetables">
        <vegetables>  
            <vegetable>  
                <name>onion</name>  
                <price>400</price>  
             </vegetable>  
            <vegetable>  
                <name>Potato</name>  
                <price>30</price>  
            </vegetable> 
        </vegetables>
        </c:set>  
        <x:parse xml="${vegetables}" var="output"/>  
        <x:if select="$output/vegetables/vegetable/price < 100">  
            Vegetables prices are very low.  
        </x:if>
    </body>
</html>
