<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../common/tag.jsp"%>
<html>
<head>
    <title>BOOK LIST</title>
</head>
<body>
<table style="border: 1px solid">
    <c:forEach items="${books}" var="book">
        <tr>
            <td>${book.bookId}</td>
            <td>${book.name}</td>
            <td>${book.number}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
