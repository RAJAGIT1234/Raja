<%@page isELIgnored="false"  %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<form:form  modelAttribute="student" >
<table bgcolor="cyan" align="center">
<tr>
<td>Student Number::</td><td><form:input path="sno"/></td>
</tr>
<tr>
<td>Student Name::</td><td><form:input path="sname"/></td>
</tr>
<tr>
<td>Student Address::</td><td><form:input path="sadd"/></td>
</tr>
<tr>
<td>Student Mark Avg::</td><td><form:input path=name="avg"/></td>
</tr>
<tr>
   <td colspan="2"><input type="submit" value="register"/></td>
</tr>
</table>
</form:form>