/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question02;

/**
 *
 * @author Kavindu Dilshan
 */
import java.util.Scanner;
public class Question02 {

    public static void main(String[] args) {
        
        Scanner scalarproduct = new Scanner(System.in);

        System.out.print("Enter the length of the arrays: ");
        int length = scalarproduct.nextInt();

        // Create two arrays to store input from the user
        int[] array1 = new int[length];
        int[] array2 = new int[length];

        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array1[i] = scalarproduct.nextInt();
        }

        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array2[i] = scalarproduct.nextInt();
        }

        // Calculate the scalar product
        int scalarProduct = 0;
        for (int i = 0; i < length; i++) {
            scalarProduct += array1[i] * array2[i];
        }

        System.out.println("Scalar product of the two arrays: " + scalarProduct);

        scalarproduct.close();
    }
}
