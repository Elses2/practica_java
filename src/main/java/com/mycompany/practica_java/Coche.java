/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_java;

/**
 *
 * @author eberc
 */
public class Coche {
    
    
    public int puertas;
    
    public Coche(){
    
        puertas=4;
    }
    
    public void cambiar_puertas(int cantidad){
        
        puertas= puertas+cantidad;
    
    }
    public void mostrar_puertas(){
    
        System.out.println("La cantidad de puertas de este coche es de: "+puertas);
    
    }
    
}
