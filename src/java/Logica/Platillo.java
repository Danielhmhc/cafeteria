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
public class Platillo {
    private String nomplatillo;
    private float costo;
    
    public Platillo(){
        ;
    }
    
    public Platillo(String c,float d){
       
        nomplatillo=c;
        costo=d;
    }

    public String getNomplatillo() {
        return nomplatillo;
    }

    public void setNomplatillo(String nomplatillo) {
        this.nomplatillo = nomplatillo;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

   
}
