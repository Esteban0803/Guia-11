package Service;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

public class JuegoServicio {
    private Scanner leer = new Scanner(System.in);
    public Juego nuevoJuego() {
        try {
            ArrayList<Jugador> jugadores = new ArrayList<>();
            System.out.println("Ingrese la cantidad de jugadores. Si excede 6, se pondrán 6 jugadores");
            Integer cantJugadores = leer.nextInt();
            if (cantJugadores > 6) {
                cantJugadores = 6;
            }
            if (cantJugadores < 1) {
                cantJugadores = 1;
            }

            for (int i = 0; i < cantJugadores; i++) {
                jugadores.add(new Jugador(i + 1));
            }
            Revolver r = new Revolver();                                       
            return new Juego(jugadores, r);
        } catch (Exception e) {
            e.printStackTrace();                                                //Si ocurre una excepcion a la hora de crear el juego
            System.out.println("Error creando nuevo juego: " + e.getMessage()); //ej: Un Error, el catch y e.printStackTrace(), mostraran
            throw e;                                                            //el error y donde se produjo.
        }
    }
}
