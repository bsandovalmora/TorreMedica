<%-- 
    Document   : citas
    Created on : 16/02/2019, 06:05:14 AM
    Author     : jif_c
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
    <script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <script src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
    <script src="/bootstrap/js/bootstrap.bundle.min.js"></script>
    <link rel="stylesheet" type="text/css" media="screen" href="bootstrap/css/bootstrap.min.css">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Solicutar cita</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
    <header style="background-color:#33CC33; height: 50px;">
    <a href="Citas.html" style="color: white; margin-right: 8px; margin-left:70%;">Citas</a>
        <a href="Servicios.html" style="color: white; margin-right: 8px;">Servicios</a>
        <a href="Perfil.html" style="color: white; margin-right: 8px;">Promociones</a>
         <a href="Perfil.html" style="color: white; margin-right: 8px;">Promociones</a>
         <a href="Perfil.html" style="color: white; margin-right: 8px;">Salir</a>
    </header>
    <div class="container" style="margin-top:100px;"> 
        <h3>Elige el servicio para su cita</h3>
        <form action="cita">
            <div class="card" style="width: 18rem; float: left; margin-right:20px;">
                <img class="card-img-top" src="img/Neurocirugia.jpg" alt="Card image cap">
                <div class="card-body">
                    <h5 class="card-title">Neurocirugia</h5>
                    <p class="card-text">.</p>
                    <a href="#" class="btn btn-primary"  style="background-color: #33CC33">Elegir</a>
                </div>
            </div>
            <div class="card" style="width: 18rem; float: left; margin-right:20px;">
                <img class="card-img-top" src="img/cardiaca.jpg" alt="Card image cap">
                <div class="card-body">
                    <h5 class="card-title">Cirugia Cardiaca</h5>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    <a href="#" class="btn btn-primary"  style="background-color: #33CC33">Elegir</a>
                </div>
            </div>
            <div class="card" style="width: 18rem; margin-right:20px;">
            <img class="card-img-top" src="img/anestecia.jpg" alt="Card image cap">
            <div class="card-body">
                <h5 class="card-title">Anestecia</h5>
                <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                <a href="#" class="btn btn-primary" style="background-color: #33CC33">Elegir</a>
            </div>
        </div>
        
        </form>
    </div>
    <div class="container">
        <hr class="mb-5" />
        <h3>Medicos Disponibles<h3>
        <div class="form-group">
            <select type="email" class="form-control">
                <option> DR. carvajal zuma</option>
                <option> DR. Randy chiri</option>
            </select>
        </div>
        <hr class="mb-5"/>
        <h3>Otros datos<h3>
        <label>Fecha de solicitud</label>
        <input type="date" class="form-control">
        <label>Anotaciones extra</label>
        <textarea class="form-control"></textarea>
    </div>
    <div class="container">
        <a href="#" class="btn btn-primary" style="background-color: #33CC33; margin-bottom: 40px;">Solicitar Cita</a>
    </div>
    <footer style="background-color:#33CC33; height: 50px;">
    </footer>
</body>
</html>
