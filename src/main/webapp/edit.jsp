<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mettre a jour un CV</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
	<%@include file="header.jsp" %>
	<p></p>
	<div class="container col-md-6 col-md-offset-2">
		<div class="card">
			<div class="card-header text-center text-white" style="background-color: #412b8a;">EDITER UN CV</div>
			<div class="card-body">
				<form action="update.php" method="post">
					<div class="form-group">
						<label class="form-label">ID :</label> 
						<input type="text"name="" value="${postulant.id}" class="form-control" disabled/>
					</div>
					<div class="form-group">
						<label class="form-label">ID :</label> 
						<input type="hidden"name="id" value="${postulant.id}" class="form-control"  />
					</div>
					<div class="form-group">
						<label class="form-label">NOM :</label> 
						<input type="text"name="nom" value="${postulant.nom}" class="form-control"/>
					</div>
					<div class="form-group">
						<label class="form-label">PRENOM :</label> 
						<input type="text"name="prenom" value="${postulant.prenom}" class="form-control" />
					</div>
					<div class="form-group">
						<label class="form-label">AGE :</label> 
						<input type="number"name="age" value="${postulant.age}" class="form-control" />
					</div>
					<div class="form-group">
						<label class="form-label">ADRESSE :</label> 
						<input type="text"name="adresse" value="${postulant.adresse}" class="form-control" />
					</div>
					<div class="form-group">
						<label class="form-label">EMAIL :</label> 
						<input type="text"name="email" value="${postulant.email}" class="form-control" />
					</div>
					
					<div class="form-group">
						<label class="form-label">TELEPHONE :</label> 
						<input type="text"name="telephone" value="${postulant.telephone}" class="form-control" />
					</div>
					<div class="form-group">
						<label class="form-label">SPECIALITE :</label> 
						<input type="text"name="specialite" value="${postulant.specialite}" class="form-control" />
					</div>
					<div class="form-group">
						<label class="form-label">NIVEAU :</label> 
						<input type="text"name="niveau" value="${postulant.niveau}" class="form-control" />
					</div>
					<div class="form-group">
						<label class="form-label">EXPERIENCE PRO :</label> 
						<input type="text"name="experience" value="${postulant.experiencepro}" class="form-control"/>
					</div>
					<p></p> 
					<div class="d-grid gap-2 col-6 mx-auto" >
						<button type="submit" class="btn text-white" style="background-color: #412b8a;">METTRE A JOUR</button>
					</div>
					
				</form>
				<p></p>
				
			</div>
		</div>
	</div>

</body>
</html>