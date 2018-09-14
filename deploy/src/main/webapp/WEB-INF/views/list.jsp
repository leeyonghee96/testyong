<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>
<script type=”text/javascript” src=”/path/to/jquery.js”></script>
<script>

		var  result = '${msg}';
		
		if (result = "success") {
			alert("success")
		}
		else{
			
			alert("error")
		}

</script>



<table >

   <tr>	
   		<td>NAME</td>
    	<td>AGE</td>
    	<td>HOBBY</td>
  </tr>
	<c:forEach items="${list }" var="list">
  	<tr>
  		<td>${list.name }</td>
  		<td>${list.age }</td>
  		<td>${list.hobby }</td>
  	</tr>
	</c:forEach>
</table>
		






