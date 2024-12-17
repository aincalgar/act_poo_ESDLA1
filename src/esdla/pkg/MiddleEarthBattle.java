package esdla.pkg;

import static esdla.pkg.Personaje.pulsarEnter;

public class MiddleEarthBattle {
    public static void main(String[] args) {
        Personaje[] p = new Personaje[2];

        p[0] = new Personaje();
        p[0].nombre = "Frodo";
        p[0].vida = 50;
        p[0].ataque = 10;
        p[0].defensa = 5;

        p[1] = new Personaje();
        p[1].nombre = "Orco";
        p[1].vida = 60;
        p[1].ataque = 15;
        p[1].defensa = 3;

        System.out.println("¡Bienvenido a la batalla en la Tierra Media!");
        System.out.println("Frodo contra un Orco. ¡Que comience el combate!");

        do {
            p[0].atacar(p[1]);
            System.out.println("");
            pulsarEnter();
            p[1].atacar(p[0]);
            pulsarEnter();
        } while (p[0].estaVivo() || p[1].estaVivo());





    }
}