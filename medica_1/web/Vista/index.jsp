<%-- 
    Document   : index
    Created on : 15-feb-2019, 23:33:01
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge" />
		<title>Sitio</title>
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
				
				font-size: 22px;
				text-align: center;
				font-family: 'Open Sans', sans-serif;
				color: #555;
			}



			.card-group {
				color: #333;
			}

			.card {
				display: block;
				border-radius: 10px !important;
				border: none;
				padding: 0;
				box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
				transition: 0.3s;
			}

			.card:hover {
				box-shadow: 0 10px 12px 0 rgba(102, 102, 102, 0.678);
			}

			.card>img {
				min-height: 25vh;
				padding: 10px;
			}

			.card-header {
				border-top-left-radius: 10px !important;
				border-top-right-radius: 10px !important;
				border-bottom: none;
			}


			.card .card-header {
				background-color: #f1b802a8;
			}

			.card-container {
				margin: auto;
				padding: 5vh 5vw 5vh 5vw;
				width: 90%;
			}

			.card-container .title {
				text-align: center;

				margin: 5vh 0 5vh 0;

				font-size: 4rem;
			}

			#colum_1{
				margin-left: 12%;
			}


		</style>
		


	</head>
	<body>

		<div class="card-container">
		<h1 class="title">Sitio Administrativo</h1>
		<div class="row card-group" style="margin-top: 5%;">

			<div class="col-xlg-3 col-lg-3 col-md-6 col-sm-12" id="colum_1">
				<div class="card">
					<div class="card-header"></div>
					
					<a href="Vista/servicios.jsp"><img class="card-img-top" src="img/servicio.jpg" alt="Card image cap"></a>

					<div class="card-body">
						<h4 class="card-title">Servicios</h4>
						
					</div>
				</div>
			</div>
			<div class="col-xlg-3  col-lg-3 col-md-6 col-sm-12" id="colum_2">
				<div class="card">
					<div class="card-header"></div>
					
					<a href="Vista/usuarios.jsp"><img class="card-img-top" src="img/usuario.png" alt="Card image cap"></a>

					<div class="card-body">
						<h4 class="card-title">Usuarios</h4>
						
					</div>
				</div>
			</div>
			<div class="col-xlg-3  col-lg-3 col-md-6 col-sm-12" id="colum_3">
				<dic class="card">
					<div class="card-header"></div>
					
					<a href="Vista/medicos.jsp"><img class="card-img-top" src="img/medico.jpg" alt="Card image cap"></a>

					<div class="card-body">
						<h4 class="card-title">Médicos</h4>
						
					</div>
				</dic>
			</div>
			
			
		</div>
	</div>

		<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>

	</body>
</html>