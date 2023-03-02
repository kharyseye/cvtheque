<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Confirmation</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
<%@include file="header.jsp" %>
<p></p>

  <div class="container">
  	<div class="card">
  		<div class="card-header text-center text-white" style="background-color:#3c57f0;">CONFIRMATION DE L' AJOUT</div>
  		<div class="card-body">
  			<div class="form-group">
					<label>ID:</label>
					<label>${postulant.id}</label>
				</div>
				<div class="form-group">
					<label>NOM :</label>
					<label>${postulant.nom}</label>
				</div>
				<div class="form-group">
					<label>PRENOM :</label>
					<label>${postulant.prenom}</label>
				</div>
				<div class="form-group">
					<label>AGE :</label>
					<label>${postulant.age}</label>
				</div>
				<div class="form-group">
					<label>ADRESSE :</label>
					<label>${postulant.adresse}</label>
				</div>
				<div class="form-group">
					<label>EMAIL :</label>
					<label>${postulant.email}</label>
				</div>
				<div class="form-group">
					<label>TELEPHONE :</label>
					<label>${postulant.telephone}</label>
				</div>
				<div class="form-group">
					<label>SPECIALITE :</label>
					<label>${postulant.specialite}</label>
				</div>
				<div class="form-group">
					<label>NIVEAU :</label>
					<label>${postulant.niveau}</label>
				</div>
				<div class="form-group">
					<label>EXPERIENCE PRO :</label>
					<label>${postulant.experiencepro}</label>
				</div>
				
				
  			
  		</div>
  	</div>
    
  </div>
</body>
</html>