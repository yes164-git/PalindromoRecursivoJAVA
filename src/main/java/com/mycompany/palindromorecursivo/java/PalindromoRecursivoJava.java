/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindromorecursivo.java;


public class PalindromoRecursivoJava {

    // Método Wrapper (Público) 🎁
    public boolean esPalindromo(String palabra) {
        return esPalindromoAux(palabra, 0, palabra.length() - 1);
    }

    // Método Auxiliar Recursivo (Privado) 🔄
    private boolean esPalindromoAux(String palabra, int inicio, int fin) {
        // Caso Base 1: Éxito (se cruzaron o igualaron los índices) 🟢
        if (inicio >= fin) {
            return true;
        }
        
        // Caso Base 2: Fallo (los caracteres no coinciden) 🔴
        if (palabra.charAt(inicio) != palabra.charAt(fin)) {
            return false;
        }
        
        // Paso Recursivo: Avanzar inicio y retroceder fin 🔄
        return esPalindromoAux(palabra, inicio + 1, fin - 1);
    }

    // Método Main para probar en NetBeans 🚀
    public static void main(String[] args) {
        PalindromoRecursivoJava solver = new PalindromoRecursivoJava();
        
        String prueba1 = "reconocer";
        String prueba2 = "java";
        
        System.out.println("¿'" + prueba1 + "' es palíndromo?: " + solver.esPalindromo(prueba1));
        System.out.println("¿'" + prueba2 + "' es palíndromo?: " + solver.esPalindromo(prueba2));
    }
}