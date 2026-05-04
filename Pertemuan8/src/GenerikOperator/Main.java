package GenerikOperator;
/* Nama file    : Main.java
 * Deskripsi    : berisi pemanggilan Main 
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 03 Mei 2026
 */

public class Main {
        public static void main(String[] args) {
        //Kamus
        double totalBobot;

        //Algoritma
        Datum<Integer> A = new Datum<>(3);
        Datum<Integer> B = new Datum<>(6);
        Datum<Anabul> C = new Datum<>(new Kucing("Mochi", 4));
        Datum<Anabul> D = new Datum<>(new Anjing("Melky"));

        System.out.println("=========== Penerapan prosedur Tukar ===========");
        System.out.println("=========== Sebelum Tukar ===========");
        System.out.println("A = " + A.getIsi());
        System.out.println("B = " + B.getIsi());

        System.out.println("=========== Setelah Tukar ===========");
        OperatorGenerik.Tukar(A, B);
        System.out.println("A = " + A.getIsi());
        System.out.println("B = " + B.getIsi());
        System.out.println();

        System.out.println("=========== Sebelum Tukar ===========");
        C.isi.Gerak();
        C.isi.Bersuara();
        D.isi.Gerak();
        D.isi.Bersuara();
        System.out.println();

        System.out.println("=========== Setelah Tukar ===========");
        OperatorGenerik.Tukar(C, D);
        C.isi.Gerak();
        C.isi.Bersuara();
        D.isi.Gerak();
        D.isi.Bersuara();
        System.out.println();

        System.out.println("=========== Penerapan fungsi Bobot2 ===========");
        Anggora A1 = new Anggora("Oyen", 3.2);
        System.out.println("Nama kucing 1: " + A1.getNama());
        System.out.println("Bobot kucing 1: " + A1.getBobot());

        KembangTelon K1 = new KembangTelon("Molly", 4.3);
        System.out.println("Nama kucing 2: " + K1.getNama());
        System.out.println("Bobot kucing 2: " + K1.getBobot());
        
        totalBobot = OperatorGenerik.Bobot2(A1, K1);
        System.out.println("Jumlah bobot = " + totalBobot);   
    }
}