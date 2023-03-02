<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
<%@include file="header.jsp" %>
<p></p>

  <div class="container">
  	<div class="card">
  		<div class="card-header text-center text-white" style="background-color:#57e7fa;">LISTE DES CV</div>
  		<div class="card-body">
  			<p></p>
  			<table class="table table-striped table-hover">
  				<tr>
  					<th>ID</th>
  					<th>NOM</th>
  					<th>PRENOM</th>
  					<th>AGE</th>
  					<th>ADRESSE</th>
  					<th>EMAIL</th>
  					<th>TELEPHONE</th>
  					<th>SPECIALITE</th>
  					<th>NIVEAU</th>
  					<th>EXPERIENCEPRO</th>
  					<th>SUPPRIMER</th>
  					<th>EDITER</th>
  				</tr>
  				<c:forEach items="${postulant}" var="p">
						<tr>
							<td>${p.id}</td>
							<td>${p.nom}</td>
							<td>${p.prenom}</td>
							<td>${p.age}</td>
							<td>${p.adresse}</td>
							<td>${p.email}</td>
							<td>${p.telephone}</td>
							<td>${p.specialite}</td>
							<td>${p.niveau}</td>
							<td>${p.experiencepro}</td>
							<td><a onclick="return confirm('voules-vous supprimer?')" href="supprimer.php?id=${p.id}"> <img alt="" src="icone/delete.png"></a></td>
							<td><a href="editer.php?id=${p.id}" > <img src="icone/edit.png"> </a></td>
						</tr>
					</c:forEach>
  			</table>
  			
  		</div>
  	</div>
    
  </div>
</body>
</html>