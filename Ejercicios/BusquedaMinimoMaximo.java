/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.busquedaminimomaximo;

import java.util.Scanner;
/**
 *
 * @author david
 */
public class BusquedaMinimoMaximo {

    public static void main(String[] args) {
        Scanner MinMax = new Scanner(System.in);

        System.out.print("¿Cuántos números deseas ingresar en el arreglo? ");
        int n = MinMax.nextInt();

        int[] arr = new int[n];

        System.out.println("Ingresa los números:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arr[i] = MinMax.nextInt();
        }
        ordenacionIntercambio(arr);

        System.out.println("\nArreglo ordenado de menor a mayor utilizando Ordenacion por Intercambio:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        MinMax.close();
    }

    public static void ordenacionIntercambio(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}