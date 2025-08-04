/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stoplight;

import java.util.Scanner;

/**
 *
 * @author 30128198
 */
public class StopLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a colour code (1: red, 2: green, 3: yellow)");
        System.out.print("Colour code: ");
        int colourIn = sc.nextInt();
        switch (colourIn) {
            case 1 -> {
                System.out.println("Next Traffic Light is Green");
            }
            case 2 -> {
                System.out.println("Next Traffic Light is Yellow");
            }
            case 3 -> {
                System.out.println("Next Traffic Light is Red");
            }
            default -> {
                System.out.println("Invalid colour");
            }
        }
    }
}
