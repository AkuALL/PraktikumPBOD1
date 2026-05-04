package GenerikClass;
/* Nama file    : Main.java
 * Deskripsi    : berisi pemanggilan Main
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 03 Mei 2026
 */

public class Main {
     public static void main(String[] args) {
        //Kamus
        Kucing Kucing;
        Datum<Anabul> anu;

        //Algoritma
        Kucing = new Kucing("Mochi", 5.4);
        anu = new Datum<>();

        anu.setIsi(Kucing);
        anu.getIsi().Gerak();
        anu.getIsi().Bersuara();
        System.out.println("Bobot Kucing adalah: " + Kucing.getBobot());
        System.out.println();

        anu.setIsi(new Anjing("Melky"));
        anu.getIsi().Gerak();
        anu.getIsi().Bersuara();
        System.out.println();

        anu.setIsi(new Burung("KicauMania"));
        anu.getIsi().Gerak();
        anu.getIsi().Bersuara();
    }
}
