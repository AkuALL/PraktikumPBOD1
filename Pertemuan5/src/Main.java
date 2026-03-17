/* Nama file    : Main.java
 * Deskripsi    : berisi file Main
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 10 Maret 2026
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("\n============== PERTEMUAN 4 ==============");
                // BAGIAN 1
        // Nomor 2
        // Apakah konstruktor berparameter pada kelas Persegi dapat direalisasikan seperti berikut? Mengapa?
        // Jawab: Tidak bisa, dikarenakan atribut yang digunakan oleh Persegi merupakan atribut yang diwariskan oleh class BangunDatar.
        // Dan atribut tersebut memiliki class modifier private, sehingga tidak dapat untuk langsung diakses.
        
        // Nomor 3
        // Implementasikan ke Main
        Persegi Square1 = new Persegi(5, "Merah", "Solid");
        System.out.println("======= Implementasi Method Pertemuan 4 =======");
        System.out.println("Sisi dari Square1: " + Square1.getSisi());
        System.out.println("Luas dari Square1: " + Square1.getLuas());
        System.out.println("Keliling dari Square1: " + Square1.getKeliling());
        System.out.println("Diagonal dari Square1: " + Square1.getDiagonal());
        System.out.println("\n======= Informasi Square1 =======");
        Square1.printInfo();

        Persegi Square2 = new Persegi();
        Square2.setSisi(7);
        Square2.setWarna("Pink");
        Square2.setBorder("Solid");
        System.out.println("\n======= Informasi Square2 =======");
        Square2.printInfo();

        Lingkaran circle1 = new Lingkaran(5, "Orange", "Solid");
        System.out.println("Jari-jari dari circle1: " + circle1.getJari());
        System.out.println("Luas dari circle1: " + circle1.getLuas());
        System.out.println("Keliling dari circle1: " + circle1.getKeliling());
        System.out.println("\n======= Informasi circle1 =======");
        circle1.printInfo();

        Lingkaran circle2 = new Lingkaran();
        circle2.setJari(7);
        circle2.setWarna("Pink");
        circle2.setBorder("Solid");
        System.out.println("\n======= Informasi circle2 =======");
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
        // Jawab: Terjadi error jika ditambahkan override untuk method static
        // printCounterBangunDatar

        // BAGIAN 4
        // Jawab: Konstruktor dengan parameter tersebut dapat direalisasikan karena
        // class Persegi merupakan subclass dari BangunDatar.
        // Dan itu masih masuk ke dalam lingkup akses protected.

        // BAGIAN 5
        // Nomor 1
        // Jawab: Akibat keyword final pada class BangunDatar, menjadikan class
        // BangunDatar tidak dapat diwariskan ke subclassnya yaitu Lingkaran dan
        // Persegi. Dan terjadi error
        // Nomor 2
        // Jawab: Akibat keyword final pada method printInfo(), menjadikan method
        // tersebut tidak dapat di override pada subclassnya. Dan terjadi error
    
        System.out.println("\n\n============== PERTEMUAN 5 ==============");
        // BAGIAN 1
        // Nomor 1
        // Jawab: sudah

        // Nomor 2
        // Jawab: sudah

        // Nomor 3
        // BangunDatar B1 = new BangunDatar();
        BangunDatar P1 = new Persegi(10, "Merah", "Solid");
        Persegi P2 = new Persegi(5, "Merah", "Solid");
        BangunDatar L1 = new Lingkaran(7, "Merah", "Solid");
        Lingkaran L2 = new Lingkaran(14, "Merah", "Solid");

        System.out.println("======= Implementasi Luas dan Keliling Abstract Method =======");
        System.out.println("Luas dari P1: " + P1.getLuas());
        System.out.println("Keliling dari P1: " + P1.getKeliling());
        System.out.println("Luas dari P2: " + P2.getLuas());
        System.out.println("Keliling dari P2: " + P2.getKeliling());
        System.out.println("Luas dari L1: " + L1.getLuas());
        System.out.println("Keliling dari L1: " + L1.getKeliling());
        System.out.println("Luas dari L2: " + L2.getLuas());
        System.out.println("Keliling dari L2: " + L2.getKeliling());

        System.out.println("\n======= Implementasi isEqualLuas dan isEqualKeliling =======");
        System.out.println("Apakah luas P1 sama dengan L2? " + P1.isEqualLuas(L2));
        System.out.println("Apakah keliling P1 sama dengan L2? " + P1.isEqualKeliling(L2));
        
        // Nomor 4
        // Jawab: Sudah

        // Nomor 5
        // Jawab: Tidak bisa, karena method isEqual tersebut menggunakan method abstract yang ada pada class BangunDatar yaitu getLuas dan getKeliling. 
        // Jika class BangunDatar bukan abstract, maka akan error karena method getLuas dan getKeliling merupakan abstract method. Sehingga class BangunDatar pun harus abstract class juga
        // Kelebihannya kita bisa menggunakan method isEqualLuas dan isEqualKeliling, karena kedua method tersebut menggunakan method abstract
        
        
        // BAGIAN 2
        System.out.println("\n======= Implementasi ZoomOut =======");
        // P1.zoomOut(); /*ERROR*/
        // System.out.println("Sisi P1 setelah zoomOut: " + P1.getSisi());
        P2.zoomOut();
        System.out.println("Sisi P2 setelah zoomOut: " + P2.getSisi());
        // L1.zoomOut(); /*ERROR*/
        // System.out.println("Jari-jari L1 setelah zoomOut: " + L1.getJari());
        L2.zoomOut();
        System.out.println("Jari-jari L2 setelah ZoomOut: " + L2.getJari());

        System.out.println("\n======= Implementasi ZoomIn =======");
        // P1.zoomIn(); /*ERROR*/
        // System.out.println("Sisi P1 setelah zoomIn: " + P1.getSisi());
        P2.zoomIn();
        System.out.println("Sisi P2 setelah zoomIn: " + P2.getSisi());
        // L1.zoomIn(); /*ERROR*/
        // System.out.println("Jari-jari L1 setelah zoomIn: " + L1.getJari());
        L2.zoomIn();
        System.out.println("Jari-jari L2 setelah zoomIn: " + L2.getJari());
        
        System.out.println("\n======= Implementasi Zoom dengan parameter percent =======");
        // P1.zoom(25); /*ERROR*/
        // System.out.println("Sisi P1 setelah zoom 25%: " + P1.getSisi());
        P2.zoom(25);
        System.out.println("Sisi P2 setelah zoom 25%: " + P2.getSisi());
        // L1.zoom(25); /*ERROR*/
        // System.out.println("Jari-jari L1 setelah zoom 25%: " + L1.getJari());
        L2.zoom(25);
        System.out.println("Jari-jari L2 setelah zoom 25%: " + L2.getJari());

        // Keunggulan utama interface terletak pada dukungannya terhadap multiple interface implementation. 
        // Hal ini memungkinkan sebuah class (seperti Persegi atau Lingkaran) untuk mengadopsi berbagai kontrak perilaku dari beberapa interface sekaligus. 
        // Sementara itu, abstract class terikat pada prinsip single inheritance, di mana satu sub-class hanya diperbolehkan memiliki satu super-class.
        // Sehingga method zoomIn(), zoomOut(), dan zoom() lebih baik dibuat menjadi interface
    }
}
