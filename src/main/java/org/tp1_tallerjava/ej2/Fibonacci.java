package org.tp1_tallerjava.ej2;

public class Fibonacci {

    //Utilizamos long para poder calcular el fibonacci de numeros grandes
    public static long calcularFibonacci(int n) {
        if (n < 0 || n > 1000) {
            throw new IllegalArgumentException("El valor de n debe estar en el rango de 0 a 1000");
        }

        long a = 0; // Valor de Fibonacci para n - 2
        long b = 1; // Valor de Fibonacci para n - 1

        for (int i = 0; i < n; i++) {
            long temp = a;
            a = b;
            b = temp + b;
        }

        return a;
    }

}
