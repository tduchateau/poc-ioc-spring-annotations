<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
   href="http://twitter.github.com/bootstrap/1.4.0/bootstrap.min.css">
</head>
<body class="body">
   <div class="container">

      <div class="hero-unit">
         <h1>POC Spring IoC Annotations</h1>
         <br />
         <p>
            <a class="btn primary large" href="<%=request.getContextPath()%>">Retour à l'accueil</a>
         </p>
      </div>

      <div class="row">
         <h3>Liste des clients</h3>
         <ul>
            <c:forEach var="client" items="${clients}">
               <li><c:out value="${client.firstname}" />&nbsp;<c:out value="${client.lastname}" /></li>
            </c:forEach>
         </ul>
      </div>
   </div>
</body>
</html>