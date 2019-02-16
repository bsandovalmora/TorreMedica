<%-- 
    Document   : usuarios
    Created on : 16-feb-2019, 0:14:29
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge" />
		<title>Usuarios</title>
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

			#menu.faded .nav-link:hover {
				color: #f1b802;
			}
			.colum1{
				margin-top: 3%;
				display: none;
				margin-left: 5%;
			}

			.boton{
				background-color: #007bff; 
				border-radius: 25px;
				border: none;
				color: white;
				padding: 15px 32px;
				text-align: center;
				text-decoration: none;
				display: inline-block;
				font-size: 16px;
				margin: 4px 2px;
				cursor: pointer;
				-webkit-transition-duration: 0.4s; 
				transition-duration: 0.4s;
			}
			.boton:hover {
				box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24),0 17px 50px 0 rgba(0,0,0,0.19);
			}

			
		</style>

		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>


		<script>
		$(document).ready(function(){
		  $("button").click(function(){
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
					
					<li class="nav-item">
						<a class="nav-link" href="servicios.jsp">Servicios</a>
					</li>
					<li class="nav-item active">
						<a class="nav-link" href="usuarios.jsp">Usuarios <span class="sr-only">(current)</span></a>
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
  			<h1 style="margin-top: 5%;">Usuarios</h1>
                        <form action="consultar">
                            <div class="buscar">
                                    <input type="text" name="nombre">
                                    <button type="button" class="btn btn-primary">Buscar</button>
                            </div>
                        </form>
  			<hr>

  			<div class="row">
                            <s:iterator value="lista">
  				<div class="colum1">
                                <img src="img/user.png" class="img-rounded" alt="">
                                <h4><s:property value="nombre"></s:property> <s:property value="apellidos"></s:property></h4>
                                <p>ID: <s:property value="id"></s:property></p>
                                <p>Edad: <s:property value="edad"></s:property></p>
                                <p>Direccion: <s:property value="direccion"></s:property></p>
      				<hr>
      				<a href="perfil_usuario.html" class="boton" role="button">Ver</a>
      				<button type="button" class="boton">Eliminar</button>
      				<hr>
      				
  				</div>
                            </s:iterator>
  			</div>
  	</div>

</body>
</html>
