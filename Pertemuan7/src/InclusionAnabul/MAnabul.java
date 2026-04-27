package InclusionAnabul;
/* Nama file    : MAnabul.java
 * Deskripsi    : berisi pemanggilan Main
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 25 April 2026
 */

public class MAnabul {
    public static void main(String[] args) {
        Anabul Hewan = new Anabul();
        Kucing Kucing1 = new Kucing("Tom");
        Anjing Anjing1 = new Anjing("Miky");
        Burung Burung1 = new Burung("Jago");

        System.out.println("========= Detail Informasi Hewan =========");
        Hewan.printInfoAnabul();
        System.out.println("========= Detail Informasi Kucing1 =========");        
        Kucing1.printInfoAnabul();
        System.out.println("========= Detail Informasi Anjing1 =========");
        Anjing1.printInfoAnabul();
        System.out.println("========= Detail Informasi Burung1 =========");
        Burung1.printInfoAnabul();        
    }
}
