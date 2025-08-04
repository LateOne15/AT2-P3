/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.colourrange;

import java.util.Scanner;

/**
 *
 * @author 30128198
 */
public class ColourRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter a wavelength (in nm): ");
        double wavelength = sc.nextDouble();
        
        if (wavelength >= 380 && wavelength < 450) {
            System.out.println("The colour is Violet");
        }
        else if (wavelength >= 450 && wavelength < 495) {
            System.out.println("The colour is Blue");
        }
        else if (wavelength >= 495 && wavelength < 570) {
            System.out.println("The colour is Green");
        }
        else if (wavelength >= 570 && wavelength < 590) {
            System.out.println("The colour is Yellow");
        }
        else if (wavelength >= 590 && wavelength < 620) {
            System.out.println("The colour is Orange");
        }
        else if (wavelength >= 620 && wavelength < 750) {
            System.out.println("The colour is Red");
        }
        else {
            System.out.println("That wavelength is not on the visible spectrum.");
        }
    }
}
