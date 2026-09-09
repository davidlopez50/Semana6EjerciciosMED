/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palabradiccionario;

import java.util.Scanner;
/**
 *
 * @author david
 */
public class PalabraDiccionario {

    public static void main(String[] args) {
        String[] diccionario = {"Campero", "Hola", "Mesa", "Exhibicion", "Termonuclear", "Kaizo", "Gamecube", "Juego"};

        Scanner palabra = new Scanner(System.in);
        System.out.print("Ingresa la palabra que deseas buscar en el diccionario: ");
        String palabraBuscada = palabra.nextLine().trim().toLowerCase();

        int resultado = busquedaSecuencial(diccionario, palabraBuscada);

        if (resultado != -1) {
            System.out.println("Palabra encontrada! Está presente en el diccionario en el índice: " + resultado);
        } else {
            System.out.println("La palabra no esta en el diccionario.");
        }

        palabra.close();
    }

    public static int busquedaSecuencial(String[] arreglo, String valorBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i].equals(valorBuscado)) {
                return i;
            }
        }
        return -1;
    }
}