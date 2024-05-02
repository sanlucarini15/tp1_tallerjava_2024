package org.tp1_tallerjava.ej3;

public class Node {

    private int data;
    private Node left;
    private Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public boolean esHoja() {
        return (left == null && right == null);
    }

    // Método para calcular la altura de un árbol
    public int calcularAltura() {
        return calcularAltura(this);
    }

    private int calcularAltura(Node nodo) {
        if (nodo == null) {
            return 0;
        }
        int alturaIzquierda = calcularAltura(nodo.left);
        int alturaDerecha = calcularAltura(nodo.right);
        return 1 + Math.max(alturaIzquierda, alturaDerecha);
    }

    public boolean esArbolBinarioDeBusqueda() {
        return esArbolBinarioDeBusqueda(this, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean esArbolBinarioDeBusqueda(Node nodo, int min, int max) {
        if (nodo == null) {
            return true;
        }
        if (nodo.data < min || nodo.data > max) {
            return false;
        }
        return esArbolBinarioDeBusqueda(nodo.left, min, nodo.data - 1) &&
                esArbolBinarioDeBusqueda(nodo.right, nodo.data + 1, max);
    }

}
