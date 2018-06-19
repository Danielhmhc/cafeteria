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
public class Pedido {
    private String nombre;
    private int cantidad;
    private float costot;

    public Pedido(){
        ;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getCostot() {
        return costot;
    }

    public void setCostot(float costot) {
        this.costot = costot;
    }

    public Pedido(String nombre, int cantidad, float costot) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.costot = costot;
    }
    
}
