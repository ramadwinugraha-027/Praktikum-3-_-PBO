package app;

import model.Mahasiswa;
import model.MenuItem;
import model.Pesanan;

public class Main {
    public static void main(String[] args) {
    
        Mahasiswa m1 = new Mahasiswa("241001", "Asep");
        Mahasiswa m2 = new Mahasiswa("241002", "Siti");

        // program utama
        System.out.println(m1.getNim() + " - " + m1.getNama());
        System.out.println(m2.getNim() + " - " + m2.getNama());

        MenuItem nasi = new MenuItem("M01", "Nasi Goreng", 18000);
        MenuItem kopi = new MenuItem("M02", "Kopi Susu", 12000);

        kopi.tandaiHabis();

        System.out.println(nasi.getNama() + " tersedia: " + nasi.isTersedia());
        System.out.println(kopi.getNama() + " tersedia: " + kopi.isTersedia());

        Pesanan p1 = new Pesanan(m1, nasi,2);
        Pesanan p2 = new Pesanan(m2, kopi, 1);
        System.out.println("P1 dapat diproses: " + p1.dapatDiproses());
        System.out.println("Total P1: " + p1.hitungTotal());
        System.out.println("P2 dapat diproses: " + p2.dapatDiproses());

        //Eksperimen 1
        // nasi.tersedia = false;
        // catatan eror: tersedia has private access in MenuItem

        nasi.tandaiHabis();

        //eksperimen 2 
        //1. Mahasiswa m3 = new Mahasiswa();

        /*error: constructor Mahasiswa in class Mahasiswa cannot be applied to given types;
        Mahasiswa m3 = new Mahasiswa();
                       ^
        required: String,String
        found:    no arguments
        reason: actual and formal argument lists differ in length */

        Mahasiswa m3 = new Mahasiswa();
        System.out.println(m3.getNim());//output: null
        System.out.println(m3.getNama());//output: null 

        //eksperimen 3
        Pesanan p3 = new Pesanan(m1, nasi, 2);
        Pesanan p4 = new Pesanan(m2, kopi, 1);
        Pesanan p5 = new Pesanan(m1, nasi, 1);

        System.out.println("P3: " + p3.getNomor());
        System.out.println("P4: " + p4.getNomor());
        System.out.println("P5: " + p5.getNomor());
        // output pengujian sebelum diubah P3: 3, P4: 4, P5: 5
        // output pengujian setelah diubah P3: 1, P4: 1, P5: 1

        /* Eksperimen 4 Desain A yang dipilih
        private Mahasiswa pemesan;
        private MenuItem menu; */ 

        /* Eksperimen 5 
        error: cannot find symbol
        Pesanan p5 = new Pesanan(m1, nasi, 1);
        ^
        symbol:   class Pesanan
        location: class Main*/ 

    }
}