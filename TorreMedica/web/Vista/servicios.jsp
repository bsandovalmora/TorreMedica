<%-- 
    Document   : servicios
    Created on : 16-feb-2019, 1:45:03
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
		<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="	anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		<script src="https://code.jquery.com/jquery-1.12.4.js"></script> 
  		<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
		<meta charset="utf-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge" />
		<title>Servicios</title>
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
		<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/"
		 crossorigin="anonymous" />
		<link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet" />
		<link rel="stylesheet" type="text/css" media="screen" href="css/main.css" />
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

		<style>
			@keyframes fadein {
				from {
					opacity: 0;
				}

				to {
					opacity: 1;
				}
			}

			@keyframes slideInFromLeft {
				0% {
					transform: translateX(-100%);
				}

				100% {
					transform: translateX(0);
				}
			}

			html {
				scroll-behavior: smooth;
			}

			body {
				
				font-size: 40px;
				text-align: center;
				font-family: 'Open Sans', sans-serif;
				color: #555;

			}

			nav.navbar {
				padding: 2vh;
				background-color: transparent !important;
				border-bottom: 0px transparent;
				transition: 1s;
			}

			nav.navbar.faded {
				background-color: #3a560bd5 !important;
			}

			.navbar-right {
				position: absolute;
				right: 30%;
			}

			.nav-link {
				border-bottom: rgba(255, 255, 255, 0.753) solid;
				transition: 0.5s;
			}

			.nav-link:hover {
				border-bottom: #f1b802 solid;
			}
			.colum1{
				margin-top: 3%;
				display: none;
				margin-left: 5%;
			}

			.boton{
				background-color: #007bff; /* Green */
				border: none;
				border-radius: 25px;
				color: white;
				padding: 15px 32px;
				text-align: center;
				text-decoration: none;
				display: inline-block;
				font-size: 16px;
				margin: 4px 2px;
				cursor: pointer;
				-webkit-transition-duration: 0.4s; /* Safari */
				transition-duration: 0.4s;
			}
			.boton:hover {
				box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24),0 17px 50px 0 rgba(0,0,0,0.19);
			}

			
		</style>

		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>


		<script>
		$(document).ready(function(){
		  $("#bus").click(function(){
		    $(".colum1").fadeIn("slow"); 
		  });
		});
		</script>
</head>
<body>
	<hr>
	<div class="navbar-container" style="margin-top: 5%">
		<nav id="menu" class="navbar navbar-expand-lg navbar-light bg-light">
			<button class="navbar-toggler hidden-lg-up" type="button" data-toggle="collapse" data-target="#collapsibleNavId"
			 aria-controls="collapsibleNavId" aria-expanded="false" aria-label="Toggle navigation">
				<i class="fa fa-ellipsis-v" aria-hidden="true"></i>
			</button>
			<div class="collapse navbar-collapse" id="collapsibleNavId">
				<ul class="navbar-right navbar-nav">
					
					
					<li class="nav-item active">
						<a class="nav-link" href="servicios.jsp">Servicios <span class="sr-only">(current)</span></a>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="usuarios.jsp">Usuarios</a>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="medicos.jsp">Medicos</a>
					</li>

				</ul>
			</div>
		</nav>
	</div>
	<hr>
	<div class="container">
  			<h1 style="margin-top: 5%;">Servicios</h1>
  			<div class="buscar">

  				<input type="text" name="nombre">
  				<button type="button" id="bus" class="btn btn-primary">Buscar</button>
  				
  			</div>

  			<div>
  				<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">
			    Agregar Servicio
			  </button>
			  <hr>

			  
			  <div class="modal" id="myModal">
					<div class="modal-dialog">
						<div class="modal-content">
						      
						       
							<div class="modal-header">
						          <h4 class="modal-title">Agregar Medico</h4>
						          <button type="button" class="close" data-dismiss="modal">&times;</button>
						    </div>
						        
						        
						    <div class="modal-body">
							    <input type="text" class="form-control form-control-sm" placeholder="Tipo" style="margin-top: 2%;">
							    <input type="text" class="form-control form-control-sm" placeholder="Descripción" style="margin-top: 2%;">
							   
							    <hr>
							    <button type="button" id="bus" class="btn btn-primary">Agregar</button>
							    <hr>
						    </div>
						        
						       
						    <div class="modal-footer">
						    	<button type="button" class="btn btn-danger" data-dismiss="modal">Cerrar</button>
						    </div>
						        
						</div>
					</div>
				</div>
			</div>

  			<div class="row">
  				<div class="colum1">
  					<img src="img/user.png" class="img-rounded" alt="">
      				<p>Nombre</p>
      				<hr>
      				<a href="" class="boton" role="button">Ver</a>
      				<button type="button" class="boton">Eliminar</button>
      				<hr>
      				
  				</div>
  			</div>
  	</div>

</body>
</html>