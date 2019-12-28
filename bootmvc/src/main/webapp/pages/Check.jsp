<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

    <title>Hellow From Ujash</title>
</head>
<body>

<h1>Hellow From</h1>



<form:form action="processForm" modelAttribute="student">

    First name: <form:input path="firstName" />

    <br><br>

    Last name: <form:input path="secondName" />

    <br><br>

    Country:
    <form:select path="country1">

        <form:options items="${student.country}" />

    </form:select>

    <br><br>

    Favorite Language:

    Java <form:radiobutton path="lang" value="Java" />
    C# <form:radiobutton path="lang" value="C#" />
    PHP <form:radiobutton path="lang" value="PHP" />
    Ruby <form:radiobutton path="lang" value="Ruby" />

    <br><br>

    Operating Systems:

    Linux <form:checkbox path="OS" value="Linux" />
    Mac OS <form:checkbox path="OS" value="Mac OS" />
    MS Windows <form:checkbox path="OS" value="MS Window" />

    <br><br>


    <input type="submit" value="Submit" />

</form:form>




</body>
</html>