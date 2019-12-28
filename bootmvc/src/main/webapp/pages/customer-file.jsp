<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>

    <style>
        .errr {color: red}
    </style>

</head>
<body>

<form:form  action="processFile" modelAttribute="Customer">

    First Name : <form:input path="firstName"></form:input> <br><br>

    Last Name : <form:input path="lastName"></form:input>
    <form:errors path="lastName" cssClass="error"></form:errors>

    <input type="submit">

</form:form>
</body>
</html>