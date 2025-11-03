/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal.pkg1.mudah;

/**
 * a
 *
 * @author GIGABYTE
 */
import java.util.Scanner;

public class Soal1Mudah {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("PROGRAM HITUNG BIAYA PENGIRIMAN");

        int hasil = 0;
        System.out.println("Selamat datang di layanan ekspedisi kami!");
        System.out.print("Masukkan berat barang (kg): ");
        int berat = input.nextInt();
        System.out.println("Masukan jarak tempuh pengiriman (km): ");
        int jarak = input.nextInt();
        System.out.println("Masukkan Panjang Barang");
        int panjang = input.nextInt();
        System.out.println("Masukkan Lebar Barang");
        int lebar = input.nextInt();
        System.out.println("Masukkan Tinggi Barang");
        int tinggi = input.nextInt();

        if (jarak < 10 || jarak == 10) {
            hasil += 4250 * berat;
        } else if (jarak > 10) {
            hasil += 6000 * berat;
        }
        int volume = panjang * lebar * tinggi;
        if (volume > 100) {
            hasil += 50000;

            System.out.println("Total Biaya Pengiriman. Rp " + hasil);

        }
    }
}
