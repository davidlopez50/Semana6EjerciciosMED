/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordenamientonombresalfabeticamente;

import java.util.Scanner;
/**
 *
 * @author david
 */
public class OrdenamientoNombresAlfabeticamente {

    public static void main(String[] args) {
        Scanner alfabeto = new Scanner(System.in);

        System.out.print("Cuantos nombres deseas ingresar? ");
        int n = alfabeto.nextInt();
        alfabeto.nextLine();

        String[] nombres = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa el nombre " + (i + 1) + ": ");
            nombres[i] = alfabeto.nextLine();
        }
        ordenacionInsercionNombres(nombres);

        System.out.println("\nLista de nombres ordenada alfabeticamente:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("- " + nombres[i]);
        }

        alfabeto.close();
    }

    private static void ordenacionInsercionNombres(String[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}