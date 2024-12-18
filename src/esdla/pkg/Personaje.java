package esdla.pkg;

import java.util.Scanner;

public class Personaje {
    static Scanner scan = new Scanner(System.in);
    //ATRIBUTOS
    String nombre;
    int vida;
    int ataque;
    int defensa;
    int danyo;

    //MÉTODOS
    boolean estaVivo(){
        if(vida > 0){
            return true;
        } else {
            return false;
        }
    }

    void mostrarEstado(){
        System.out.println("Vida: " + this.vida);
    }

   void atacar(Personaje p){
        danyo = this.ataque - p.defensa;
        if(danyo > 0){
            p.vida = p.vida - danyo;
            System.out.println(nombre + " ataca a " + p.nombre + " y causa " + danyo + " puntos de daño.");
            System.out.println("La vida de " + p.nombre + " es de: " + p.vida + "\n");
        } else {
            System.out.println(p.nombre +" ataca a " + p.nombre + " pero no logra causar daño" + "\n");
        }
    }

    public static void pulsarEnter(){

        System.out.println("Presiona Enter para continuar...");
        scan.nextLine();

    }

}
