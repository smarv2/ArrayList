/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistejemplo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author MXI01020253A
 */
public class ArrayListEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
        ArrayList de Strings y lo rellenamos con 10 Strings (Elemento i). Esto lo hacemos con el método “add()”. 
        Después añadimos un nuevo elemento al ArrayList en la posición ‘2’ (con el metodo “add(posición,elemento)”) que le llamaremos “Elemento 3” 
        posteriormente imprimiremos el contenido del ArrayList, recorriendolo con un Iterador.
         */
        // Declaración el ArrayList
        ArrayList<String> nombreArrayList = new ArrayList<String>();

        // Añadimos 10 Elementos en el ArrayList
        for (int i = 1; i <= 10; i++) {
            nombreArrayList.add("Elemento " + i);
        }

        // Añadimos un nuevo elemento al ArrayList en la posición 2
        nombreArrayList.add(2, "Elemento 3");

        // Declaramos el Iterador e imprimimos los Elementos del ArrayList
        Iterator<String> nombreIterator = nombreArrayList.iterator();
        while (nombreIterator.hasNext()) {
            String elemento = nombreIterator.next();
            System.out.println(elemento);
        }

        // Recordar que previamente ya hemos declarado el ArrayList y el Iterator de la siguiente forma:
        // ArrayList<String> nombreArrayList = new ArrayList<String>();
        // Iterator<String> nombreIterator = nombreArrayList.iterator();
        // Obtenemos el numero de elementos del ArrayList
        int numElementos = nombreArrayList.size();
        System.out.println("El ArrayList tiene " + numElementos + " elementos");
        System.out.println("");

        // Eliminamos el primer elemento del ArrayList, es decir el que ocupa la posición '0'
        System.out.println("Eliminamos el primer elemento del ArrayList (" + nombreArrayList.get(0) + ")...");
        nombreArrayList.remove(0);

        numElementos = nombreArrayList.size();
        System.out.println("Ahora el ArrayList tiene " + numElementos + " elementos");

        nombreIterator = nombreArrayList.iterator();
        while (nombreIterator.hasNext()) {
            String elemento = nombreIterator.next();
            System.out.println(elemento);
        }

        // Eliminamos los elementos de ArrayList que sean iguales a "Elemento 3"
        System.out.println("");
        System.out.println("Eliminamos los elementos de ArrayList que sean iguales a 'Elemento 3'");
        nombreIterator = nombreArrayList.iterator();
        while (nombreIterator.hasNext()) {
            String elemento = nombreIterator.next();
            if (elemento.equals("Elemento 3")) {
                nombreIterator.remove();	// Eliminamos el Elemento que hemos obtenido del Iterator
            }
        }

        // Imprimimos el ArrayList despues de eliminar los elementos iguales a "Elemento 3"
        System.out.println("Imprimimos los elementos del ArrayList tras realizar las eliminaciones: ");
        nombreIterator = nombreArrayList.iterator();
        while (nombreIterator.hasNext()) {
            String elemento = nombreIterator.next();
            System.out.println(elemento);
        }

        // Mostramos el numero de elementos que tiene el ArrayList tras las eliminaciones:
        numElementos = nombreArrayList.size();
        System.out.println("Numero de elementos del ArrayList tras las eliminaciones = " + numElementos);

    }

}
