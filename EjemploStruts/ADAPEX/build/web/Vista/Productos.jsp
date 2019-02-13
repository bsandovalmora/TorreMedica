<%-- 
    Document   : Productos
    Created on : 09-feb-2019, 1:02:56
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
  	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0,minimun-scale=1.0">
	<title>Productos</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <style>
            body{
	font-family: arial;
}
.colum1{
	text-align: center;
	margin-top: 1%;
	border: 1px solid #343a40;
	border-radius: 50px 20px;
	width: 20%;
	height: auto;
}

.colum1 p{
	margin-top: 5%;
	text-align: left;
	margin-left: 5%;
}

.foo{
	margin-top: 5%;
	border: 1 px;
	padding: 3%;
	width: auto;
	height: auto;
	color: white;
	font-family: arial;
	background-color: #343a40;
	font-size: 0.9em;

}

.img-rounded{
	margin-top: 2%;
	height: auto;
	width: auto;

}

.row h4{
	text-align: left;
	color: white;
	border: 1px;
	padding: 8%;
	background-color: #343a40;
	border-radius: 50px 20px;
}

@media screen and (max-width: 1200px){
	.colum1{
		width:40%;
		margin-top: 3%
	}
 	
}

@media screen and (max-width: 575px){
	.colum1{
		margin-top: 40%;
	}
 	
}

@media screen and (max-width: 550px){
	.colum1{
		width:100%;
	}
 	
}
        </style>

	
</head>
<body>
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark fixed-top">
  		<a class="navbar-brand" href="#"><img src="../img/logo_tienda_2361.png" style="width: 40%; height: 10%"></a>
  		<ul class="navbar-nav">
    		<li class="nav-item">
      			<a class="nav-link" href="#">Productos</a>
    		</li>
    		<li class="nav-item">
      			<a class="nav-link" href="#">Distribudores</a>
    		</li>
    		<li class="nav-item">
      			<a class="nav-link" href="#">Rutas</a>
    		</li>
    		<li class="nav-item">
      			<a class="nav-link" href="#">¿Quienes somos?</a>
    		</li>
    		<li class="nav-item">
      			<a class="nav-link" href="#">Contactenos</a>
    		</li>
  		</ul>
	</nav>
            
  		<div class="container">
  			<h1 style="margin-top: 10%;">Productos</h1>
  			<div class="row">
                            <s:iterator value="lista">
  				<div class="colum1" style="margin-left: 5%;">
  					<h4><s:property value="nombre"></s:property></h4>
  					<img src="../img/<s:property value="img"></s:property>.png" class="img-rounded" alt="">
      				<p>Valor: <s:property value="valor"></s:property></p>
      				<hr>
      				<a href="ver.html" class="btn btn-info" role="button">Ver</a>
      				<hr>
      				
  				</div>
                            </s:iterator>
  			</div>
		</div>
		<div class="foo">
			<footer >
				<h2>Secciones</h2>
				<nav style="margin-left: 5%;">
					<li><a href="">Inicio</a></li>
					<li><a href="">Distribudores</a></li>
					<li><a href="">Productos</a></li>
					<li><a href="">¿Quienes somos?</a></li>
					<li><a href="">Terminos condiciones</a></li>
					<li><a href="">Contactenos</a></li>
				</nav>


			</footer>
		</div>
</body>
</html>
