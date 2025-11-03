/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal2sedang;

import java.util.Scanner;

/**
 *
 * @author GIGABYTE
 */
public class Soal2Sedang {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.println("asukkan jari jari tabung : ");
        double r = input.nextDouble();
        
        System.out.print("Masukkan tinggi tabung : ");
        double t = input.nextDouble();
        
        double phi = 3.1415;
        double volume = (phi) * r * r * t;
        System.out.println("Volume tabung adalah : " + volume);
    }
}
