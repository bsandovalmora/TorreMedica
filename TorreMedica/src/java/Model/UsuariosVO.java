/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Usuario
 */
public class UsuariosVO {
    String n_user;
    String nombre;
    int edad;
    String apellidos;
    String direccion;
    String correo;
    
    String pass;
    String tipo_sangre;
    String alcohol;
    String altura;
    String peso;
    String psicologica;
    String antecendentes;
    String tratamientos;
    String alergias;
    String dolores;

    public UsuariosVO() {
    }

    public UsuariosVO(String n_user, String nombre, int edad, String apellidos, String direccion, String correo, String pass, String tipo_sangre, String alcohol, String altura, String peso, String psicologica, String antecendentes, String tratamientos, String alergias, String dolores) {
        this.n_user = n_user;
        this.nombre = nombre;
        this.edad = edad;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.correo = correo;
        this.pass = pass;
        this.tipo_sangre = tipo_sangre;
        this.alcohol = alcohol;
        this.altura = altura;
        this.peso = peso;
        this.psicologica = psicologica;
        this.antecendentes = antecendentes;
        this.tratamientos = tratamientos;
        this.alergias = alergias;
        this.dolores = dolores;
    }

    public String getN_user() {
        return n_user;
    }

    public void setN_user(String n_user) {
        this.n_user = n_user;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }

    public String getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(String alcohol) {
        this.alcohol = alcohol;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getPsicologica() {
        return psicologica;
    }

    public void setPsicologica(String psicologica) {
        this.psicologica = psicologica;
    }

    public String getAntecendentes() {
        return antecendentes;
    }

    public void setAntecendentes(String antecendentes) {
        this.antecendentes = antecendentes;
    }

    public String getTratamientos() {
        return tratamientos;
    }

    public void setTratamientos(String tratamientos) {
        this.tratamientos = tratamientos;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getDolores() {
        return dolores;
    }

    public void setDolores(String dolores) {
        this.dolores = dolores;
    }

    
    
    
    
    
}
