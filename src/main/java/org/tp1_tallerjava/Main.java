package org.tp1_tallerjava;

import org.tp1_tallerjava.ej1.PalabraMasUsada;
import org.tp1_tallerjava.ej2.Fibonacci;
import org.tp1_tallerjava.ej3.Node;
import org.tp1_tallerjava.ej4.FotografiaArtistica;

import static org.tp1_tallerjava.ej4.FotografiaArtistica.contarFotosArtisticas;

public class Main {

    public static void main(String[] args) {

        //Ejercicio 1
        PalabraMasUsada p = new PalabraMasUsada("dos");
        System.out.println(p.getPalabraMasUsada(1));

        //Ejercicio 2
        System.out.println(Fibonacci.calcularFibonacci(1000));

        //Ejercicio 3
        Node raiz = new Node(4);
        Node leftChild = new Node(2);
        Node rightChild = new Node(6);
        raiz.setLeft(leftChild);
        raiz.setRight(rightChild);
        leftChild.setLeft(new Node(1));
        leftChild.setRight(new Node(3));
        rightChild.setLeft(new Node(5));
        rightChild.setRight(new Node(7));

        // Verificar si un nodo es una hoja
        System.out.println("¿El nodo 'raiz' es una hoja? " + raiz.esHoja());

        // Calcular la altura del árbol
        System.out.println("La altura del árbol es: " + raiz.calcularAltura());

        // Verificar si el árbol es un árbol binario de búsqueda
        System.out.println("¿Es un árbol binario de búsqueda? " + raiz.esArbolBinarioDeBusqueda());

        //Ejercicio 4
        // Arreglo de ejemplo
        char[] arreglo = {'f', '.', 'a', '.', '.', 'e', 'a', '.', 'f', 'e', 'a', '.', '.', '.'};

        // Distancias X e Y
        int X = 1;
        int Y = 2;

        // Crear una instancia de FotografiaArtistica
        FotografiaArtistica fotografiaArtistica = new FotografiaArtistica(arreglo);

        // Llamada al método para contar las fotografías artísticas
        int cantidadFotosArtisticas = contarFotosArtisticas(X, Y);

        // Impresión del resultado
        System.out.println("La cantidad de fotografías artísticas posibles es: " + cantidadFotosArtisticas);
    }

}