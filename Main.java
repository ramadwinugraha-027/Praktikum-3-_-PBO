package app;

import model.Mahasiswa;
import model.MenuItem;
import model.Pesanan;

public class Main {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("241511001", "Asep");
        MenuItem item1 = new MenuItem("M01", "Nasi Goreng", 20000);

        System.out.println("Pengujian Diskon Menu =");
        System.out.println("Harga Normal: Rp" + item1.getHarga());
        item1.setDiskon(0.25); 
        System.out.println("Harga Setelah Diskon 25%: Rp" + item1.getHarga());

        System.out.println("\n Pengujian Pembatalan Pesanan =");
        Pesanan p1 = new Pesanan(m1, item1, 2);
        System.out.println(p1.ringkasan());
        
        p1.batalkan();
        System.out.println("Setelah dibatalkan:");
        System.out.println(p1.ringkasan());
    }
}