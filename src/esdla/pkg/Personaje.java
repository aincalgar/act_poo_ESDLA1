package esdla.pkg;

import java.util.Scanner;

public class Personaje {
    static Scanner scan = new Scanner(System.in);
    //ATRIBUTOS
    String nombre;
    int vida;
    int ataque;
    int defensa;

    //MÉTODOS
    boolean estaVivo(){
        if(this.vida > 0){
            return true;
        } else {
            return false;
        }
    }

    void mostrarEstado(){
        System.out.println("Vida: " + this.vida);
    }

   void atacar(Personaje p){
        //si daño mayor a 0 hay que restar el daño a la vida del personaje pasado por parámetro
        //si el daño no es >0 mostrar mensaje "no logra causar daño"
        int danyo;
        danyo = ataque - this.defensa;
        if(danyo > 0){
            this.vida = this.vida - danyo;
            System.out.println("La vida de " + p.nombre + " es de: " + this.vida);
        } else {
            System.out.println(p.nombre +" ataca a " + p.nombre + " pero no logra causar daño");
        }
    }

    public static void pulsarEnter(){
        try {
            System.out.println("Presiona Enter para continuar..."); scan.nextLine();
        } catch (Exception e){
            System.out.println("Error. No has pulsado enter." + e.getMessage());
        }

    }

}
