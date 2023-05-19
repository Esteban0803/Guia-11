//Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
//Revolver

//Métodos:
//• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
//y el revolver para guardarlos en los atributos del juego.
//• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
//aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
//moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
//mojar. Al final del juego, se debe mostrar que jugador se mojó.
//Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
package Entidades;
import java.util.ArrayList;

public class Juego {

    private Integer indiceTurno;
    private ArrayList<Jugador> jugadores;
    private Revolver revolver;
    private Boolean estanJugando;
    private Jugador jugadorMojado;
    
    public Juego(ArrayList<Jugador> jugadores, Revolver r){
        this.indiceTurno = 0;
        this.llenarJuego(jugadores,r);
        this.estanJugando = true;
    }
    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver r){
        this.jugadores = jugadores;
        this.revolver = r;
    }
    public void ronda() throws Exception {
        if (!this.estanJugando) {
            throw new Exception("La partida ya terminó");
        }
        this.estanJugando = !this.jugadores.get(this.indiceTurno++).disparo(this.revolver);
        if (!this.estanJugando) {
            this.jugadorMojado = this.jugadores.get(this.indiceTurno - 1);
        }
        this.indiceTurno = this.indiceTurno % this.jugadores.size();
    }
    	public boolean estanJugando() {
		return this.estanJugando;
	}
	
	public Jugador getJugadorMojado() {
		return this.jugadorMojado;
	}

}
