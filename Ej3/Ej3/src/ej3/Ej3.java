package ej3;
import Entidad.Cartas;
import Service.Baraja;
import java.util.ArrayList;

public class Ej3 {
    public static void main(String[] args) {
        Baraja b1 = new Baraja();
        System.out.println("------------------");
        System.out.println("Cantidad de cartas disponibles: "+b1.cartasDisponibles());
        System.out.println("------------------");
        System.out.println("Se le van a dar cinco cartas");
        ArrayList<Cartas> cartasRepartidas = b1.darCartas(5);
        for (Cartas carta : cartasRepartidas) {
            System.out.println(carta);
        }
        System.out.println("------------------");
        System.out.println("Estas son las cartas disponibles "+b1.cartasDisponibles());
        System.out.println("El resto de cartas que quedan");
        b1.cartasMonton();
        System.out.println("------------------");
        System.out.println("Sacando 10 cartas:");
        cartasRepartidas = b1.darCartas(10);
        System.out.println("------------------");
        System.out.println("Mostrando el montón de cartas:");
        b1.cartasMonton();
        System.out.println("------------------");
        System.out.println("Esta es la baraja completa");
        b1.mostrarBaraja();
    }
}
