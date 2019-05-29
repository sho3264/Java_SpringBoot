<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:forEach items="${errorList}" var="String">
	<font color="red">${String}</font>
</c:forEach>