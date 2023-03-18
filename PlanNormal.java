/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miaunet;

/**
 *
 * @author jaime
 */
public class PlanNormal {
    public int precio;
    public int minutos;
    public String tipo;

    public PlanNormal(int precio, int minutos,String tipo) {
        this.precio = precio;
        this.minutos = minutos;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    public int CalcularMin(int minutos){
        int total = 0;
        if (minutos<0) {
            System.out.println("Ingrese una cantidad correcta!!!");
        } else {
            total = minutos;
    }
        return total;
    }
    
    public int Calcular()
    {
        return (this.getMinutos()* precio)+7000;
    }
}
