//Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
//y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
//contener un método toString() que retorne el número de carta y el palo. La baraja estará
//compuesta por un conjunto de cartas, 40 exactamente.
package Service;
import Entidad.Cartas;
import java.util.ArrayList;
import java.util.Collections;

public class Baraja {
    private ArrayList<Cartas> cartas;
    private ArrayList<Cartas> monton;
    public Baraja() {
        cartas = new ArrayList<>();
        monton = new ArrayList<>();
        String[] palos = {"Espadas", "Bastos", "Oros", "Copas"};

        for (int i = 1; i <= 12; i++) {
            for (String palo : palos) {
                if (i != 8 && i != 9) {
                    cartas.add(new Cartas(i, palo));
                }
            }
        }
    }

    public void barajar() {
        Collections.shuffle(cartas);//El shuffle es para que se ordene de manera random
    }

    public Cartas siguienteCarta() {
        if (cartas.isEmpty()) {//isEmpty es para verificar que la Lista no este vacia
            System.out.println("No hay más cartas en la baraja.");
            return null;
        }//Si la lista no esta el vacia el .remove(0) elimina el objeto
         //y lo vuelve a la posicion 0 donde se agrega y se muestra con 
         //la variable "siguiente"
        Cartas siguiente = cartas.remove(0);
        monton.add(siguiente);
        return siguiente;
    }

    public int cartasDisponibles() {
        return cartas.size();
    }

    public ArrayList<Cartas> darCartas(int cantidad) {
        ArrayList<Cartas> cartasRepartidas = new ArrayList<>();
        if (cantidad > cartasDisponibles()) {
            System.out.println("No hay suficientes cartas disponibles.");
        } else {
            //Si la cantidad pedida es menor a cartasDisponibles, el bucle for
            //se repetira la cantidad de veces pedidas para obtener la carta 
            //le sigue
            for (int i = 0; i < cantidad; i++) {
                Cartas carta = siguienteCarta();
                if (carta != null) {//null = cartasRepetidas, si da null
                                    //la carta esta repetida e ir al Arraylist
                                    //de cartasRepetidas
                    cartasRepartidas.add(carta);
                }
            }
        }
        return cartasRepartidas;
    }

    public void cartasMonton() {
        if (monton.isEmpty()) {
            System.out.println("No se ha sacado ninguna carta aún.");
        } else {
            for (Cartas carta : monton) {
                System.out.println(carta);
            }
        }
    }
    public void mostrarBaraja(){
        for (Cartas carta : cartas) {
            System.out.println(carta);
        }
    }
}
