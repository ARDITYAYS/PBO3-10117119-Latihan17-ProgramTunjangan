/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117119latihan17programtunjangan;

import java.util.Scanner;

/**
 *
 * @author Yogaputra 
 * Nama : Arditya Yogaputra S 
 * Kelas : IF-3 / PBO-3 
 * Nim : 10117119 
 * Deskripsi : Program ini dapat menghitung Total Gaji yang di dapat
 */
public class PBO310117119Latihan17ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double gajipokok, tunjangan, totalgaji;
        String status;

        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("==========Program Tunjangan===========");
        System.out.print("Berapa gaji pokok anda perbulan?\t: Rp. ");
        gajipokok = scanner.nextInt();
        System.out.print("Status Anda? (Menikah/Belum) \t: ");
        
        
        status = scanner.next();
        
        if ("Menikah".equals(status)) {
            tunjangan = 0.35 * gajipokok;
            totalgaji = gajipokok + tunjangan;
        } else {
            tunjangan = 0 * gajipokok;
            totalgaji = gajipokok + tunjangan;
            
        }
        
        System.out.println("==========Hasil Perhitungan Gaji Anda===========");
        System.out.println("Gaji Pokok\t: " + gajipokok);
        System.out.println("Tunjangan\t:" + tunjangan);
        System.out.println("Total Gaji\t:" + totalgaji);

    }

}
