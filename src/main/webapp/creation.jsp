<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Creer son cv</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
	<%@include file="header.jsp" %>
	<p></p>
<div class="container col-md-8 col-md-offset-2">
		<div class="card">
			<div class="card-header text-center text-white" style="background-color: #b01aa3;">AJOUTER UN CV</div>
				<div class="card-body">
					<form action="ajouter.php" method="post">
					  <div class="mb-3">
					    <label  class="form-label">Nom :</label>
					    <input type="text" class="form-control" value="" name="nom">
					  </div>
					  <div class="mb-3">
					    <label class="form-label">Prenom :</label>
					    <input type="text" class="form-control" value="" name="prenom">
					  </div>
					  <div class="mb-3">
					    <label  class="form-label">age :</label>
					    <input type="text" class="form-control" value="" name="age">
					  </div>
					  <div class="mb-3">
					    <label  class="form-label">Adresse :</label>
					    <input type="text" class="form-control" value="" name="adresse">
					  </div>
					  <div class="mb-3">
					    <label class="form-label">Email :</label>
					    <input type="text" class="form-control" value="" name="email">
					  </div>
					  <div class="mb-3">
					    <label class="form-label">Téléphone :</label>
					    <input type="text" class="form-control" value="" name="telephone">
					  </div>
					  <div class="mb-3">
					    <label class="form-label">Specialité :</label>
					    <input type="text" class="form-control" value="" name="specialite">
					  </div>
					  <div class="mb-3">
					    <label class="form-label">Niveau :</label>
					    <input type="text" class="form-control" value="" name="niveau">
					  </div>
					  <div class="mb-3">
					    <label class="form-label">Expérience Pro :</label>
					    <input type="text" class="form-control" value="" name="experience">
					  </div>
					 <div class="d-grid gap-2 col-6 mx-auto">
					   <button type="submit" class="btn text-white" style="background-color: #b01aa3;">CREER</button>
					 
					 </div>
					 
				</form>
		</div>
	</div>
 </div>
		 
</body>
</html>