//Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
//un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
//se dispara y se moja. Las clases por hacer del juego son las siguientes:
package ej2;

import Entidades.Juego;
import Service.JuegoServicio;

public class Ej2 {
    public static void main(String[] args) throws Exception {
        JuegoServicio servicio = new JuegoServicio();

        Juego j = servicio.nuevoJuego();
        while (j.estanJugando()) {
            j.ronda();
        }
        System.out.println("La partida ha finalizado. El jugador mojado es " + j.getJugadorMojado().getNombre());
    }
}
