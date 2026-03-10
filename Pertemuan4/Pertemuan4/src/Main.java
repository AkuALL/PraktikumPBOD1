/* Nama file    : Main.java
 * Deskripsi    : berisi file Main
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 10 Maret 2026
 */

public class Main {
    public static void main(String[] args) {
        // BAGIAN 1
        // Nomor 2
        // Apakah konstruktor berparameter pada kelas Persegi dapat direalisasikan seperti berikut? Mengapa?
        // Jawab: Tidak bisa, dikarenakan atribut yang digunakan oleh Persegi merupakan atribut yang diwariskan oleh class BangunDatar.
        // Dan atribut tersebut memiliki class modifier private, sehingga tidak dapat untuk langsung diakses.
        
        // Nomor 3
        // Implementasikan ke Main
        Persegi Square1 = new Persegi(5, "Merah", "Solid");
        System.out.println("Sisi dari Square1: " + Square1.getSisi());
        System.out.println("Luas dari Square1: " + Square1.getLuas());
        System.out.println("Keliling dari Square1: " + Square1.getKeliling());
        System.out.println("Diagonal dari Square1: " + Square1.getDiagonal());
        System.out.println("======= Informasi Square1 =======");
        Square1.printInfo();

        Persegi Square2 = new Persegi();
        Square2.setSisi(7);
        Square2.setWarna("Pink");
        Square2.setBorder("Solid");
        System.out.println("======= Informasi Square2 =======");
        Square2.printInfo();

        Lingkaran circle1 = new Lingkaran(5, "Orange", "Solid");
        System.out.println("Jari-jari dari circle1: " + circle1.getJari());
        System.out.println("Luas dari circle1: " + circle1.getLuas());
        System.out.println("Keliling dari circle1: " + circle1.getKeliling());
        System.out.println("======= Informasi circle1 =======");
        circle1.printInfo();

        Lingkaran circle2 = new Lingkaran();
        circle2.setJari(7);
        circle2.setWarna("Pink");
        circle2.setBorder("Solid");
        System.out.println("======= Informasi circle2 =======");
        circle2.printInfo();

        // BAGIAN 2
        // Nomor 1
        // Jawab: Sudah diimplementasikan
        // Nomor 2
        // Jawab: Sudah diimplementasikan

        // BAGIAN 3
        // Nomor 1
        // Jawab: Sudah diimplementasikan
        // Nomor 2
        // Jawab: Sudah diimplementasikan
        // Nomor 3
        // Jawab: Terjadi error jika ditambahkan override untuk method static printCounterBangunDatar

        // BAGIAN 4
        // Jawab: Konstruktor dengan parameter tersebut dapat direalisasikan karena class Persegi merupakan subclass dari BangunDatar.
        // Dan itu masih masuk ke dalam lingkup akses protected.

        // BAGIAN 5
        // Nomor 1
        // Jawab: Akibat keyword final pada class BangunDatar, menjadikan class BangunDatar tidak dapat diwariskan ke subclassnya yaitu Lingkaran dan Persegi. Dan terjadi error
        // Nomor 2
        // Jawab: Akibat keyword final pada method printInfo(), menjadikan method tersebut tidak dapat di override pada subclassnya. Dan terjadi error
    }
}
