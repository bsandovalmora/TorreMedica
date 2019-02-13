<%-- 
    Document   : index
    Created on : 09-feb-2019, 2:32:00
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge" />
	<title>ADAPEX</title>
	<meta name="viewport" content="width=device-width, initial-scale=1" />
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/"
	 crossorigin="anonymous" />
	<link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet" />
	<link rel="stylesheet" type="text/css" media="screen" href="./css/main.css" />
	<link rel="icon" href="./assets/images/fav.jpeg">
</head>
<header></header>

<body>
	<div class="navbar-container">
		<nav id="menu" class="navbar navbar-expand-lg navbar-light bg-light">
			<a class="navbar-brand" href="#"><img id="logo" src="./assets/images/logo/logo_200x55.png" alt=""></a>
			<button class="navbar-toggler hidden-lg-up" type="button" data-toggle="collapse" data-target="#collapsibleNavId"
			 aria-controls="collapsibleNavId" aria-expanded="false" aria-label="Toggle navigation">
				<i class="fa fa-ellipsis-v" aria-hidden="true"></i>
			</button>
			<div class="collapse navbar-collapse" id="collapsibleNavId">
				<ul class="navbar-right navbar-nav">
					<li class="nav-item active">
						<a class="nav-link" href="#">Inicio <span class="sr-only">(current)</span></a>
					</li>
					<li class="nav-item dropdown">
						<a class="nav-link dropdown-toggle" id="dropdownId" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Nuestros
							productos</a>
						<div class="dropdown-menu" aria-labelledby="dropdownId">
							<a class="dropdown-item" href="Productos">Especialidades</a>
							<a class="dropdown-item" href="#services">Minivegetales</a>
							<a class="dropdown-item" href="#services">Procesados</a>
							<a class="dropdown-item" href="#services">Hierbas aromáticas</a>
						</div>
					</li>
					<li class="nav-item dropdown">
						<a class="nav-link dropdown-toggle" id="dropdownId" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Conózcanos</a>
						<div class="dropdown-menu" aria-labelledby="dropdownId">
							<a class="dropdown-item" href="#services">¿Quiénes somos?</a>
							<a class="dropdown-item" href="#services">Proceso</a>
							<a class="dropdown-item" href="#services">Distribuidores</a>
							<a class="dropdown-item" href="#services">Rutas de reparto</a>
						</div>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="#contact-us">Contacto</a>
					</li>

				</ul>
			</div>
		</nav>
	</div>
	<div id="services" class="jumbotron jumbotron-fluid main">
		<div class="container">
			<h1 class="title display-1">Fácil de preparar.</h1>
			<h2 class="sub">Los colores de los vegetales en tu cocina.</h2>
			<!-- <p class="lead button-container">
				<a class="btn btn-primary btn-lg" href="#services" role="button"></a>
			</p> -->
		</div>
	</div>
	<div class="card-container">
		<h1 class="title">Productos</h1>
		<div class="row card-group">
			<div class="col-xlg-3 col-lg-3 col-md-6 col-sm-12">
				<div class="card">
					<div class="card-header"></div>
					<img class="card-img-top" src="./assets/images/productos/minivegetales.jpg" alt="Card image cap">

					<div class="card-body">
						<h4 class="card-title">Minivegetales</h4>
						<p class="card-text">Vegetales en porciones que no se pierden</p>
						<a href="#" class="btn btn-primary"><i class="fa fa-arrow-right" aria-hidden="true"></i></a>
					</div>
				</div>
			</div>
			<div class="col-xlg-3  col-lg-3 col-md-6 col-sm-12">
				<div class="card">
					<div class="card-header"></div>
					<img class="card-img-top" src="./assets/images/productos/especial.jpg" alt="Card image cap">

					<div class="card-body">
						<h4 class="card-title">Especialidades</h4>
						<p class="card-text">Vegetales que vienen de cosechas cuidadas como oro</p>
						<a href="#" class="btn btn-primary"><i class="fa fa-arrow-right" aria-hidden="true"></i></a>
					</div>
				</div>
			</div>
			<div class="col-xlg-3  col-lg-3 col-md-6 col-sm-12">
				<dic class="card">
					<div class="card-header"></div>
					<img class="card-img-top" src="./assets/images/productos/procesados.jpg" alt="Card image cap">

					<div class="card-body">
						<h4 class="card-title">Procesados</h4>
						<p class="card-text">Productos listos para ser parte de tu próxima gran comida</p>
						<a href="#" class="btn btn-primary"><i class="fa fa-arrow-right" aria-hidden="true"></i></a>
					</div>
				</dic>
			</div>
			<div class="col-xlg-3  col-lg-3 col-md-6 col-sm-12">
				<div class="card">
					<div class="card-header"></div>
					<img class="card-img-top" src="./assets/images/productos/hierbas.jpg" alt="Card image cap">

					<div class="card-body">
						<h4 class="card-title">Hierbas aromáticas</h4>
						<p class="card-text">Dale a tu comida ese toque que nadie se espera</p>
						<a href="#" class="btn btn-primary"><i class="fa fa-arrow-right" aria-hidden="true"></i></a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div id="about-us" class="container info-container">
		<div class="row">
			<div class="col col-12">
				<h1>¿Quienes somos?</h1>
				<p> La Asociación de Desarrollo Agrícola para la Exportación ( ADAPEX ); una alternativa
					de diversificación agrícola para la zona norte de Cartago. Hemos logrado altos estándares de <strong>calidad</strong>,
					preservando
					su <strong>sabor</strong>, buena <strong>presentación</strong> y <strong>frescura</strong></p>
				<a href="#" class="btn btn-primary">Conoce más</a>
			</div>
		</div>
	</div>
</body>
<footer>
	<div class="container">
		<div class="row">
			<div class="col col-md-6 col-lg-4 col-sm-6">
				<a href="#"><img src="./assets/images/logo/logo_200x55_white.png" alt=""></a>
			</div>
			<div class="col col-md-6 col-lg-3 col-sm-6">
				<ul class="links">
					<li><a href="#about-us">About us</a></li>
					<li><a href="#services">Services</a></li>
					<li><a href="#contact-us">Contact us</a> </li>
				</ul>
			</div>
			<div class="col col-md-12 col-sm-12 col-lg-5">
				<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d31447.633866113938!2d-83.94269899234695!3d9.854206898871597!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x8fa0df1021af2921%3A0xb5e5548558a39c52!2sProvincia+de+Cartago%2C+Cartago!5e0!3m2!1ses-419!2scr!4v1548480350376"
				 frameborder="0" style="border:0" allowfullscreen></iframe>
			</div>
		</div>
	</div>
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>

</footer>

</html>
