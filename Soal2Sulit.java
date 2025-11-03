/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal2sulit;

import java.util.Scanner;

/**
 *
 * @author GIGABYTE
 */
public class Soal2Sulit {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.print("Masukkan jumlah baris matriks: ");
        int baris = input.nextInt();
        System.out.print("Masukkan jumlah kolom matriks: ");
        int kolom = input.nextInt();

        int[][] matriksA = new int[baris][kolom];
        int[][] matriksB = new int[baris][kolom];
        int[][] hasil = new int[baris][kolom];

        // Input matriks A
        System.out.println("\nMasukkan elemen-elemen matriks A:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                matriksA[i][j] = input.nextInt();
            }
        }

        // Input matriks B
        System.out.println("\nMasukkan elemen-elemen matriks B:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                matriksB[i][j] = input.nextInt();
            }
        }

        // Proses penjumlahan
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }

        // Menampilkan hasil
        System.out.println("\nHasil penjumlahan matriks (A + B):");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(hasil[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
