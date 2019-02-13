CREATE TABLE Usuario (
	IDUsuario INT not null IDENTITY(1,1) PRIMARY KEY,
	_nombre VARCHAR(128),
	_Apellidos VARCHAR(128),
	_Edad DECIMAL(2,0),
	_Dirreccion VARCHAR(128)
)

GO

CREATE TABLE cita (
	IDCita INT not null IDENTITY(1,1) PRIMARY KEY,
	_Tipo VARCHAR(128)
)

GO

CREATE TABLE servicios (
	IDServicios INT not null IDENTITY(1,1) PRIMARY KEY,
	_Tipo VARCHAR(128),
	_descrip VARCHAR(128)
)

GO

CREATE TABLE empleado (
	IDEmpleado INT not null IDENTITY(1,1) PRIMARY KEY,
	_nombre VARCHAR(128),
	_Apellidos VARCHAR(128),
	_Cargo DECIMAL(2,0),
	_Edad VARCHAR(128)
)

GO

CREATE TABLE credenciales(
	IDCredencial INT not null IDENTITY(1,1) PRIMARY KEY,
	IDUsuario INT,
	_Usuario VARCHAR(128),
	_password VARCHAR(128), --MD5 INVESTIGA 
	_tipo int,
	FOREIGN KEY (IDUsuario) REFERENCES Usuario(IDUsuario)
)

GO



CREATE TABLE historial(
	IDHistorial  INT NOT NULL IDENTITY(1,1) PRIMARY KEY,
	IDUsuario INT,
	IDCita INT, 
	_descrip VARCHAR(128),
	FOREIGN KEY (IDUsuario) REFERENCES Usuario(IDUsuario),
	FOREIGN KEY (IDCita) REFERENCES cita (IDCita)

)
GO

CREATE TABLE Citas_Usuario(
	IDCita INT,
	IDUsuario INT,
	IDServicio INT,
	IDEmpleado INT, 
	_Sala VARCHAR(128),
	FOREIGN KEY (IDUsuario) REFERENCES Usuario(IDUsuario),
	FOREIGN KEY (IDCita) REFERENCES cita (IDCita),
	FOREIGN KEY (IDServicio) REFERENCES Servicios (IDServicios),
	FOREIGN KEY (IDEmpleado) REFERENCES empleado (IDEmpleado),
)

GO
CREATE TABLE Servicios_Usuario (
	IDServicios INT,
	IDUsuario INT,
	FOREIGN KEY (IDServicios) REFERENCES Servicios (IDServicios),
	FOREIGN KEY (IDUsuario) REFERENCES empleado (IDEmpleado)
)

GO