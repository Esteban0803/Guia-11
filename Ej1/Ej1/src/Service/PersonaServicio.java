//Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
//clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
//atributos: nombre, apellido, edad, documento y Perro.
//Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
//pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
//la clase Persona, la información del Perro y de la Persona.
package Service;

import Entidades.Mascotas;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Persona crearPersona(){
        System.out.println("Ingrese el nombre");
        String nombre = leer.next();
        System.out.println("Ingrese el apellido");
        String apellido = leer.next();
        System.out.println("Ingrese la edad");
        Integer edad = leer.nextInt();
        System.out.println("Ingrese el documento");
        long documento = leer.nextLong();
        Persona p1 = new Persona(nombre, apellido, edad, documento, null);
        return p1;
    }
    public Mascotas crearMascota(){
        System.out.println("Ingrese el nombre");
        String nombree = leer.next();
        System.out.println("Ingrese la raza");
        String raza = leer.next();
        System.out.println("Ingrese la edad");
        Integer edadd = leer.nextInt();
        System.out.println("Ingrese el tamano");
        String tamaño = leer.next();
        Mascotas m1 = new Mascotas(nombree, raza, edadd, tamaño);
        return m1;
    }
    public void mostrarPersona(ArrayList<Persona> persona){
        for (Persona p1 : persona) {
            System.out.println(p1);
        }
    }
    public void mostrarMascota(ArrayList<Mascotas> mascota) {
        for (Mascotas m1 : mascota) {
            System.out.println(m1);
        }
    }
}
