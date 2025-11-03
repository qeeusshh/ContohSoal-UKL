/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal1sulit;

import java.util.Scanner;

/**
 *
 * @author GIGABYTE
 */
public class Soal1Sulit {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();

        double totalNilai = 0;

        // Memasukkan nilai setiap siswa
        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + i + ": ");
            double nilai = input.nextDouble();
            totalNilai += nilai;
        }

        // Menghitung rata-rata
        double rataRata = totalNilai / jumlahSiswa;

        System.out.printf("\nRata-rata nilai ujian Produktif RPL adalah: %.2f\n", rataRata);
    }
}
