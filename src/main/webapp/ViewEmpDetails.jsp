<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>

<html>
<body>
	<h3>Student LIST</h3>
	<hr>
	<table>
		<tr>
			<th>Student ID</th>
			<th>Name</th>
			<th>City</th>
			
			<th>Mobile</th>
		</tr>



		<c:forEach var="stud" items="${List}">
			<tr>
				<td>${stud.getId()}</td>
				<td>${stud.getName()}</td>
				<td>${stud.getCity()}</td>
				<td>${stud.getMobile()}</td>
			</tr>
		</c:forEach>
	</table>

	<hr>
	<a href="index.jsp">Home</a>
</body>
</html>