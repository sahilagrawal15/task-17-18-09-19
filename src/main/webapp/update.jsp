<%@page isELIgnored="false" %>




<html>
<body>
<form action="UpdateController">

Enter ID:   <input type="text" name="id">
<input type="submit" value="submit">


<table>

<tr>
<th>Enter ID : </th>
<td><input type="text" name="id" value=${up.id}></td>
</tr>

<tr>
<th> Name : </th>
<td><input type="text" name="name" value=${up.name}></td>
</tr>

<tr>
<th> City : </th>
<td><input type="text" name="city" value=${up.city}></td>
</tr>

<tr>
<th> Mobile : </th>
<td><input type="text" name="mobile" value=${up.mobile}></td>
</tr>

</table>

</form>
	
</body>
</html>