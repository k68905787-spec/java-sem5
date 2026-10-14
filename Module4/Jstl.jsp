
<%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body>
<c:set var="mark" value="90"/>
<c:if test="${mark >= 40}">
Pass
</c:if>
</body>
</html>
