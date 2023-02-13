/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module2lab;

/**
 *
 * @author Haris Khan
 */
import java.util.Scanner;

public class CalculatingSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int productNumber;
        int quantitySold;
        double totalRetailValue = 0.0;

        System.out.print("Enter product number (1 to 5, 0 to exit): ");
        productNumber = input.nextInt();

        while (productNumber != 0) {
            System.out.print("Enter quantity sold: ");
            quantitySold = input.nextInt();

            switch (productNumber) {
                case 1:
                    totalRetailValue += 2.98 * quantitySold;
                    break;
                case 2:
                    totalRetailValue += 4.50 * quantitySold;
                    break;
                case 3:
                    totalRetailValue += 9.98 * quantitySold;
                    break;
                case 4:
                    totalRetailValue += 4.49 * quantitySold;
                    break;
                case 5:
                    totalRetailValue += 6.87 * quantitySold;
                    break;
                default:
                    System.out.println("Invalid product number.");
                    break;
            }

            System.out.print("Enter product number (1 to 5, 0 to exit): ");
            productNumber = input.nextInt();
        }

        System.out.println("Total retail value: $" + totalRetailValue);
    }
}



