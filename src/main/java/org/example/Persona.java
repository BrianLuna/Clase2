package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class Persona extends Deportista {
    private String nombre;
    private String apellido;

    @Override
    public void correr() {
        this.bajarEnergia(10);
        System.out.println("Estoy corriendo y me quedan " + this.getEnergia() + " puntos de energía");
    }

    @Override
    public void tomarAgua() {
        this.aumentarEnergia(20);
        System.out.println("Estoy tomando agua y me quedan " + this.getEnergia() + " puntos de energía");
    }

    @Override
    public void nadar() {
        this.bajarEnergia(20);
        System.out.println("Estoy nadando y me quedan " + this.getEnergia() + " puntos de energía");
    }

    public void suma(int n1, int n2, Suma operacion){
        operacion.sumar(n1, n2);
    }

    public void saludar(){
        System.out.println("Hola! Soy " + this.getNombre());
    }

    public static int cantidadDeOjos(){
        return 2;
    }

//    @Override
//    public void bajarEnergia(int energiaABajar){
//        if(this.getEnergia() < energiaABajar){
//            this.setEnergia(0);
//        } else {
////            this.energia -= energiaABajar;
//            super.bajarEnergia(energiaABajar);
//        }
//    }
}
