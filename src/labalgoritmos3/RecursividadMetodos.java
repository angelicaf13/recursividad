/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labalgoritmos3;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;

/**
 *
 * @author Angelica Figueroa Muñiz
 * Marzo 04, 2018.
 * Clase que contiene metodos en los cuales se utiliza la 
 * recursividad para obtener un resultado.
 */
public class RecursividadMetodos {

    /**
     * Método recursivo para obtener el factorial de un número entero.
     * @param n
     * @return El factorial de n
     */
    static int factorial(int n) {
        if (n > 1) {
            return factorial(n - 1) * n;
        } else {
            return 1;
        }
    }

    /**
     * Método para determinar si una cadena es palindromo.
     * @param cadena
     * @return true si la cadena es palindromo, si no false
     */
    static boolean esPalindromo(String cadena) {
        if(cadena.length() <= 1)
        return true;
        else if(cadena.charAt(0) == (cadena.charAt(cadena.length() - 1))){
            return esPalindromo(cadena.substring(1, cadena.length()- 1));
        }
        else 
            return false;
    }

    /**
     * Método para invertir una cadena.
     * @param cadena
     * @return La cadena invertida
     */
    static String invertir(String cadena) {
        if(cadena.length() == 1)
            return cadena;
        else
        return invertir(cadena.substring(1)) + cadena.charAt(0);
    }
    
    /**
     * Método para mostrar una cadena de forma recursiva.
     * @param cadena
     * @return La cadena
     */
    static String mostrar(String cadena){
        if(cadena.length() <= 1)
            return cadena;
        else
            return cadena.charAt(0) + " " + mostrar(cadena.substring(1));
    }
    
    /**
     * Método para obtener los caracteres que no son números ni letras
     * de una cadena.
     * @param cadena
     * @return Una cadena con los caracteres obtenidos.
     */
    static String niLetrasNiNumeros(String cadena) {
        if (cadena.length() == 0) {
            return "La cadena esta vacia";
        } else if (cadena.length() == 1) {
            if (!isDigit(cadena.charAt(0)) && !isLetter(cadena.charAt(0))) {
                return "" + cadena.charAt(0);
            } else {
                return "";
            }
        } else {
            char a = cadena.charAt(0);
            if (!isDigit(a) && !isLetter(a)) {
                return "" + cadena.charAt(0) + niLetrasNiNumeros(cadena.substring(1));
            } else {
                return "" + niLetrasNiNumeros(cadena.substring(1));
            }
        }
    }
    
    /**
     * Método para determinar si un número es primo.
     * @param numero
     * @param divisor
     * @return true si es primo, si no false
     */
    static boolean esPrimo(int numero, int divisor){
                if (divisor < numero) {
            if (numero % divisor != 0) {
                return esPrimo(numero, ++divisor);
            } else {
                return false;
            }
        }
        return true;
    }
}
