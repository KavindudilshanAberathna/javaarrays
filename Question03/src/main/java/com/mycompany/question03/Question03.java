/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question03;

/**
 *
 * @author Kavindu Dilshan
 */
import java.util.Scanner;
public class Question03 {

    public static void main(String[] args) {
        
        Scanner combinedarrays = new Scanner(System.in);
        
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        
        // Input for the first array
        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array1[i] = combinedarrays.nextInt();
        }

        // Input for the second array
        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array2[i] = combinedarrays.nextInt();
        }

        // Combine the arrays into one
        int[] combinedArray = new int[10];
        for (int i = 0; i < 5; i++) {
            combinedArray[i] = array1[i];
            combinedArray[i + 5] = array2[i];
        }

        // Find the minimum and maximum values in the combined array
        int min = combinedArray[0];
        int max = combinedArray[0];
        for (int i = 1; i < 10; i++) {
            if (combinedArray[i] < min) {
                min = combinedArray[i];
            }
            if (combinedArray[i] > max) {
                max = combinedArray[i];
            }
        }

        // Display the combined array, minimum, and maximum values
        System.out.println("Combined Array:");
        for (int num : combinedArray) {
            System.out.print(num + " ");
        }
        System.out.println("\nMinimum Value: " + min);
        System.out.println("Maximum Value: " + max);

        combinedarrays.close();
    }
}


