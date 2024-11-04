/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan.pertemuan6;

import java.util.Scanner;

/**
 *  Nama      : MOHAMMAD FAJAR SUBECHI
 *  NIM       : 23176012
 *  Prodi     : Sistem Infprmasi
 *  Deskripsi : 
 * @author ACER
 */
public class SI_RegPagi_23176012_KataGanti {
public static void main(String[] args) {
        // Deklarasi variabel
        String kalimat, kataAsal, kataGanti, kalimatBaru;
        
        // Input kalimat dari user
        System.out.println("===== Program Mengganti Kata =====");
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        kalimat = inputan.nextLine();

        // Inputan kata yang akan diganti
        System.out.print("Ganti kata: ");
        kataAsal = inputan.nextLine();

        // Inputan kata pengganti
        System.out.print("Menjadi kata: ");
        kataGanti = inputan.nextLine();

        // Ganti kata dalam kalimat
        kalimatBaru = kalimat.replaceAll(kataAsal, kataGanti);

        // Tampilkan hasil
        System.out.println("\n===== Hasil Formatting =====");
        System.out.println("Kalimat awal\t: " +kalimat);
        System.out.println("Kalimat baru\t: " + kalimatBaru);
    }    
}
