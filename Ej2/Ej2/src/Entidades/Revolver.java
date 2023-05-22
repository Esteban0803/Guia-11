//Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
//del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
//tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.

//Métodos:
//• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
//deben ser aleatorios.
//• mojar(): devuelve true si la posición del agua coincide con la posición actual
//• siguienteChorro(): cambia a la siguiente posición del tambor
//• toString(): muestra información del revolver (posición actual y donde está el agua)
package Entidades;
import java.util.Random;

public class Revolver {

    private Integer posicion;
    private Integer agua;
    private Random r;

    public Revolver() {
        r = new Random();
        this.llenarRevolver();
    }

    public void llenarRevolver() {
        this.posicion = r.nextInt(6);
        this.agua = r.nextInt(6);
    }

    public boolean mojar() {
        return this.posicion == this.agua;
    }

    public void siguienteChorro() {
        this.posicion++;
        this.agua = this.posicion % 6;
        //Como hay 6 lugares (0 a 5) dará como resultado un numero
        //que será donde se alojará el agua
    }
}
