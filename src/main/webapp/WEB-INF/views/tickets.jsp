<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>File d’attente</title>
    <style>
        body { font-family: Arial; padding: 2em; background-color: #f4f4f4; }
        table { width: 60%; margin: auto; border-collapse: collapse; background: #fff; }
        th, td { padding: 10px; border: 1px solid #ccc; text-align: center; }
        th { background-color: #007BFF; color: #fff; }
        h2 { text-align: center; color: #333; }
        form { display: inline-block; margin: 10px; text-align: center; }
        button { background-color: #007BFF; color: #fff; border: none; padding: 10px 20px; border-radius: 4px; cursor: pointer; }
        button:hover { background-color: #0056b3; }
    </style>
</head>
<body>
<h2>Tickets en attente</h2>

<table>
    <tr>
        <th>ID</th>
        <th>Position</th>
        <th>Personnes Devant</th>
    </tr>
    <c:forEach var="ticket" items="${tickets}">
        <tr>
            <td>${ticket.id}</td>
            <td>${ticket.position}</td>
            <td>${ticket.personnesDevant}</td>
        </tr>
    </c:forEach>
</table>

<div style="text-align:center;">
    <form action="ajouter" method="post"><button>Ajouter Ticket</button></form>
    <form action="avancer" method="post"><button>Avancer</button></form>
    <form action="reculer" method="post"><button>Reculer</button></form>
</div>

</body>
</html>
