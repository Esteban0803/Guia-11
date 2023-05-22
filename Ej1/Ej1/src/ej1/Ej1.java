//Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
//clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
//atributos: nombre, apellido, edad, documento y Perro.
//Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
//pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
//la clase Persona, la información del Perro y de la Persona.
package ej1;
import Entidades.Mascotas;
import Entidades.Persona;
import Service.PersonaServicio;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        boolean encontrado;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList <Persona> p1= new ArrayList();
        ArrayList <Mascotas> m1 = new ArrayList();
        PersonaServicio s1 = new PersonaServicio();
        String respuesta;
        System.out.println("PERSONA");
        do {
            p1.add(s1.crearPersona());
            System.out.println("Quiere ingresar otra persona?");
            respuesta = leer.next();
        } while (respuesta.equalsIgnoreCase("si"));
        System.out.println("--------------------");
        System.out.println("MASCOTA");
        do {
            m1.add(s1.crearMascota());
            System.out.println("Quiere ingresar otra mascota?");
            respuesta = leer.next();
        } while (respuesta.equalsIgnoreCase("si"));
        System.out.println("--------------------");
        s1.mostrarMascota(m1);
        System.out.println("--------------------");
        s1.mostrarPersona(p1);
        
        //APARTIR DE ACA ES EL EJERCICIO EXTRA SIN TERMINAR
        
        System.out.println("----------------------");
        System.out.println("Elige una persona");
        String persona = leer.next();
        Iterator<Persona> it = p1.iterator();
        encontrado = false;
        while(it.hasNext()){
            Persona per = it.next();
            if (per.getNombre().equals(persona)){
               encontrado = true; 
            }
        }
        if (encontrado){
            System.out.println("La persona fue encontrada");
        }else{
            System.out.println("No esta en la lista");
        }
        
        System.out.println("----------------------");
        System.out.println("Elige una mascota");
        String mascota = leer.next();
        Iterator<Mascotas> ut = m1.iterator();
        encontrado = false;
        while(it.hasNext()){
            Mascotas mas = ut.next();
            if (mas.getNombre().equals(mascota)){
               encontrado = true; 
            }
        }
        if (encontrado){
            System.out.println("La mascota fue encontrada");
        }else{
            System.out.println("No esta en la lista");
        }
        System.out.println("La mascota "+mascota+" se va con "+persona);
    }   
}
