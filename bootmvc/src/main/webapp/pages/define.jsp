
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <title>Hellow From Ujash</title>
</head>

<body>
<h1> FirstName : ${student.firstName}</h1> <br><br>
<h2> SecondName : ${student.secondName}</h2><br><br>
<h3> Contry : ${student.country1}</h3><br><br>
<h3> Language :${student.lang}</h3>
<h4>

    <c:forEach var="temp" items="${student.OS}">
        <li> ${temp}</li>
    </c:forEach>

</h4>



</body>
</html>
