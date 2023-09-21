/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question01;

/**
 *
 * @author Kavindu Dilshan
 */
import java.util.Scanner;
public class Question01 {

    public static void main(String[] args) {
        
        Scanner eligible = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = eligible.nextLine();

        System.out.print("Enter your age: ");
        int age = eligible.nextInt();

        if (age >= 18) {
            System.out.println(name + ", you are eligible to vote.");
        } else {
            System.out.println(name + ", you are not eligible to vote.");
        }

        eligible.close();
    }
}
    

