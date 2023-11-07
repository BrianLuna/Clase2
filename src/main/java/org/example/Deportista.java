package org.example;

import lombok.Data;

@Data
public abstract class Deportista implements Corredor, Nadador {

    private int energia = 100;

    public void bajarEnergia(int energiaABajar){
        this.energia -= energiaABajar;
    }

    public void aumentarEnergia(int energiaAAumentar){
        this.energia += energiaAAumentar;
    }

}
