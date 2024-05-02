package org.tp1_tallerjava.ej1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PalabraMasUsada {

    private String texto;

    public PalabraMasUsada(String texto) {
        this.texto = texto;
    }

    public Map.Entry<String, Integer> getPalabraMasUsada(int n){
        String[] palabras = texto.split("\\s+"); // Dividimos por espacios

        // Creamos un HashMap para contar las ocurrencias de cada palabra => {palabra, cantOcurrencias}
        Map<String, Integer> contador = new HashMap<>();

        for (String palabra : palabras) {
            String palabraMinuscula = palabra.toLowerCase(); // Ignoramos mayúsculas y minúsculas al comparar palabras

            if (palabraMinuscula.length() >= n) {
                contador.put(palabraMinuscula, contador.getOrDefault(palabraMinuscula, 0) + 1);
            }
        }

        if (contador.isEmpty()) {
            // Si el contador está vacío, significa que no se encontraron palabras con tamano >= N
            throw new RuntimeException("No se encontraron palabras que cumplan los criterios");
        }

        // Utilizamos Collections.max() para encontrar la entrada con el valor máximo en el contador
        return Collections.max(contador.entrySet(), Map.Entry.comparingByValue());
    }

}
