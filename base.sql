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
	_Tipo VARCHAR(128),
	_delete INT
)

GO

CREATE TABLE servicios (
	IDServicios INT not null IDENTITY(1,1) PRIMARY KEY,
	_Tipo VARCHAR(128),
	_descrip VARCHAR(128),
	_delete INT
)

GO

CREATE TABLE empleado (
	IDEmpleado INT not null IDENTITY(1,1) PRIMARY KEY,
	IDNUM VARCHAR(64) UNIQUE,
	_nombre VARCHAR(128),
	_Apellidos VARCHAR(128),
	_Cargo DECIMAL(2,0),
	_Edad INT,
	_delete int
)

GO

CREATE TABLE credenciales(
	IDCredencial INT not null IDENTITY(1,1) PRIMARY KEY,
	IDUsuario INT,
	_Usuario VARCHAR(128),
	_password VARCHAR(128), --MD5 INVESTIGA 
	_tipo INT,
	FOREIGN KEY (IDUsuario) REFERENCES Usuario(IDUsuario)
)

GO



CREATE TABLE historial(
	IDHistorial  INT NOT NULL IDENTITY(1,1) PRIMARY KEY,
	IDUsuario INT,
	IDCita INT, 
	_descrip VARCHAR(128),
	tipo_sangre VARCHAR(16),
	_alcohol VARCHAR(64,
	_altura VARCHAR(64),
	_peso VARCHAR(64),
	_psicologica VARCHAR(128),
	_antecedentes VARCHAR(128),
	_tratamientos VARCHAR(128),
	_alergias VARCHAR(128),
	_dolores VARCHAR(128)
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
	_delete INT,
	FOREIGN KEY (IDUsuario) REFERENCES Usuario(IDUsuario),
	FOREIGN KEY (IDCita) REFERENCES cita (IDCita),
	FOREIGN KEY (IDServicio) REFERENCES Servicios (IDServicios),
	FOREIGN KEY (IDEmpleado) REFERENCES empleado (IDEmpleado),
)

GO
CREATE TABLE Servicios_Usuario (
	IDServicios INT,
	IDUsuario INT,
	_delete INT
	FOREIGN KEY (IDServicios) REFERENCES Servicios (IDServicios),
	FOREIGN KEY (IDUsuario) REFERENCES empleado (IDEmpleado)
)

GO

SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

CREATE PROCEDURE LoginAutorization
	@user VARCHAR(128),
	@password VARCHAR (128)
	
AS
BEGIN
	SET NOCOUNT ON;
	
	SELECT TOP 1 * FROM credenciales 
	WHERE _Usuario = @user AND _password =@password   
END
GO


SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE CRUD_Services

	@Tipo VARCHAR(128),
	@IDServices INT,
	@descrip VARCHAR(128),
	@option VARCHAR(128)
	
AS
BEGIN
	SET NOCOUNT ON;
	IF(@option = 'INSERT')
	BEGIN
		INSERT INTO servicios(_Tipo, _descrip) VALUES (@Tipo, @option) 
	END
	
	ELSE IF (@option = 'UPDATE')
	BEGIN
		UPDATE servicios SET _Tipo= LTRIM(@Tipo), _descrip = @descrip WHERE IDServicios = @IDServices
	END 
	ELSE
		UPDATE servicios SET _delete= 1 WHERE IDServicios = @IDServices
END
GO

SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

CREATE PROCEDURE CRUD_Empleados
	@IDNUM VARCHAR(128),
	@nombre VARCHAR(128),
	@apellidos INT,
	@cargo VARCHAR(128),
	@edad INT,
	@option VARCHAR(128)
	
	
AS
BEGIN
	SET NOCOUNT ON;
	IF(@option = 'INSERT')
	BEGIN
		IF((SELECT COUNT(*) FROM empleados WHERE IDNUM = @IDNUM ) > 0)
			SELECT 0 AS response
		ELSE 
			BEGIN
			INSERT INTO empleado(_nombre, _Apellidos, _Cargo, _Edad) VALUES (@nombre, @apellidos, @cargo,@edad)
			SELECT 1 AS response 
			END
			 
	END
	
	ELSE IF (@option = 'UPDATE')
	BEGIN
		UPDATE empleado 
		SET _nombre= @nombre, 
			_Apellido = @apellidos, 
			_Cargo = @cargo, 
			_Edad = @edad 
			WHERE IDNUM = @IDNUM
	END 
	ELSE
		UPDATE empleado SET _delete= 1 WHERE IDNUM = @IDNUM
END
GO





