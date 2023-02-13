/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module2lab;

/**
 *
 * @author Haris Khan
 */
public class TabularOutput {
    public static void main(String[] args) {
        System.out.println("N\t10*N\t100*N\t1000*N");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + "\t" + (10 * i) + "\t" + (100 * i) + "\t" + (1000 * i));
        }
    }
}
