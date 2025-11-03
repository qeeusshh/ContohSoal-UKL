/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2mudah;

import java.util.Scanner;

/**
 *
 * @author GIGABYTE
 */
public class Soal2Mudah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);

        int bilangan1 = 0;
        System.out.print("Masukkan Bilangan : ");
        bilangan1 = masukan.nextInt();

        if (bilangan1 % 2 == 0) {
            System.out.println("Bilangan Genap");
            System.out.println("Bilangan ini bisa dibagi 2");
        } else {
            System.out.println("Bilngan Ganjil");
            System.out.println("Bilangan ini tidak bisa" + "dibagi 2");
            System.out.println("Karena hasil bagi = sisa 1");

        }
    }

}
