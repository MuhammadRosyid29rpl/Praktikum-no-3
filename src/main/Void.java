/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author ASUS TUF A15
 */
public class Void {
    String merk,plat,warna;
    int tahunkeluaran;
   

    void data(){
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan data Mobil : ");
        System.out.print("Merk           : ");
        merk = input.nextLine();
        System.out.print("Warna          : ");
        warna = input.nextLine();
        System.out.print("Plat           : ");
        plat = input.nextLine();
        System.out.print("Tahun Keluaran : ");
        tahunkeluaran = input.nextInt();

        System.out.println("------------------------");
        System.out.println("Hasil Data Mobil Anda adalah :");
        System.out.println("Merk           : "+merk);
        System.out.println("Warna          : "+warna);
        System.out.println("Plat           : "+plat);
        System.out.println("Tahun Keluaran : "+tahunkeluaran);
    }    
}
    

