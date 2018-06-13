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
    private int idplatillo,dis;
    private String nomplatillo;
    private float costo;
    
    
    public Platillo(int a,int b,String c,float d){
        idplatillo=a;
        dis=b;
        nomplatillo=c;
        costo=d;
    }

    public int getIdplatillo() {
        return idplatillo;
    }

    public void setIdplatillo(int idplatillo) {
        this.idplatillo = idplatillo;
    }

    public int getDis() {
        return dis;
    }

    public void setDis(int dis) {
        this.dis = dis;
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
