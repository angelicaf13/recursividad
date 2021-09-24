/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labalgoritmos3;

import java.util.Scanner;

/**
 *
 * @author Angelica Figueroa Muñiz
 * Marzo 04, 2018
 * Programa en el cual se permite al usuario seleccionar una de las opciones,
 * con las cuales se puede determinar si una cadena es palindromo, invertir una
 * cadena, mostrar una cadena, mostrar los caracteres que no son ni letras ni
 * números y saber si un número es primo, todas las anteriores utilizando
 * metodos de la clase RecursividadMetodos, en los cuales se implementa la 
 * recursividad.
 */
public class LabAlgoritmos3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RecursividadMetodos objeto = new RecursividadMetodos();
        Scanner lector = new Scanner(System.in);
        String opcion;

        do{
        System.out.println("      == Menú de Opciones ==");//se muestran las opciones
        System.out.println("1. Palindromo     2. Invertir");
        System.out.println("3. Mostrar        4. Ni letras ni números");
        System.out.println("5. Primo          6. Salir");
        do {
            System.out.println("Ingrese una opción: ");//se pide una opción al usuario
            opcion = lector.nextLine();//se lee el valor y se asigna a la variable opcion
        } while (!opcion.matches("[1-6]"));//se repite mientras que no se ingrese un valor valido

        switch (opcion) {//switch case para cada una de las opciones
            case "1"://palindromo
                System.out.println("Ingrese la cadena: ");//se pide que ingrese la cadena
                String cadena1 = lector.nextLine();//se lee la cadena
                cadena1 = cadena1.toLowerCase();//se convierte a minusculas
                cadena1 = cadena1.replaceAll(" ", "");//se eliminan espacios en blanco
                if(objeto.esPalindromo(cadena1)){//se envia la cadena al método esPalindromo()
                    System.out.println("Si es palindromo");//en caso de ser true
                }else{
                    System.out.println("No es palindromo");//en caso de ser false
                }
                break;//fin del case
            case "2"://invertir
                System.out.println("Ingrese la cadena: ");//se pide que ingrese la cadena
                String cadena2 = lector.nextLine();//se lee la cadena
                System.out.println(objeto.invertir(cadena2));//se envia la cadena al método invertir() y se imprime el resultado
                break;//fin del case
            case "3"://mostrar
                System.out.println("Ingrese la cadena: ");//se pide que ingrese la cadena
                String cadena3 = lector.nextLine();//se lee la cadena
                System.out.println(objeto.mostrar(cadena3));//se envia la cadena al método mostrar() y se imprime el resultado
                break;//fin del case
            case "4"://ni letras ni números
                System.out.println("Ingrese la cadena: ");//se pide que ingrese la cadena
                String cadena4 = lector.nextLine();//se lee la cadena
                //se envia la cadena al método niLetrasNiNumeros() y se imprime el resultado
                System.out.println(objeto.niLetrasNiNumeros(cadena4));
                break;//fin del case
            case "5"://primo
                System.out.println("Ingrese un número: ");//se pide que ingrese un número
                int numero = lector.nextInt();
                //se envia el numero ingresado al metodo esPrimo()
                if (objeto.esPrimo(numero, 2)) {//en caso de ser true
                    System.out.println("El número " + numero + " si es primo");
                } else {//en caso de ser false
                    System.out.println("El número " + numero + " no es primo");
                }
                break;
            case "6"://salir
                System.exit(0);//termina la ejecución
                break;
        }
        }while(!opcion.matches("6"));//mientras que la opción no sea igual a 6
    }
}//fin de la clase
