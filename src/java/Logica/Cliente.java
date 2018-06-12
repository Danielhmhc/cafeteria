/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Daniel
 */
public class Cliente {
    public String nomusuario,email,contraseña;
    public int idusuario,estado;

    public Cliente(String nomusuario, String email, String contraseña, int idusuario, int estado) {
        this.nomusuario = nomusuario;
        this.email = email;
        this.contraseña = contraseña;
        this.idusuario = idusuario;
        this.estado = estado;
    }
    
    
}
