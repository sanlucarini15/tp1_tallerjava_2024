package org.tp1_tallerjava.ej4;

public class FotografiaArtistica {

    static char[] arreglo;

    public FotografiaArtistica(char[] arreglo) {
        this.arreglo = arreglo;
    }

    public static int contarFotosArtisticas(int X, int Y) {

        int cant = 0;

        for (int i = 0; i < arreglo.length; i++) {

            if (arreglo[i] == 'f') {
                // Si encontramos un fotógrafo en la posición actual
                // Buscamos un artista dentro de la distancia X e Y desde la posición del fotógrafo
                for (int j = i + X; j <= i + Y && j < arreglo.length; j++) {
                    if (arreglo[j] == 'a') {
                        // Si encontramos un artista, buscamos un escenario dentro de la distancia X e Y desde la posición del artista
                        for (int k = j + X; k <= j + Y && k < arreglo.length; k++) {
                            // Si encontramos un escenario en el rango, incrementamos el contador de fotografías artísticas
                            if (arreglo[k] == 'e') {
                                cant++;
                            }
                        }
                    }
                }
            }
        }

        // Retornamos la cantidad total de fotografías artísticas encontradas
        return cant;
    }

}
