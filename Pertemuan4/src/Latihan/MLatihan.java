/* Nama file    : MLatihan.java
 * Deskripsi    : berisi pemanggilan main
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 15 Maret 2026
 */

package Latihan;

import java.time.LocalDate;

public class MLatihan {
    public static void main(String[] args) {
        // Deklarasi objek Dosen Tetap
        DosenTetap dosenTetap = new DosenTetap(
            "198005152005011001", 
            "0015058001", 
            "Ahmad Budi Santoso", 
            "Fakultas Peternakan & Pertanian", 
            LocalDate.of(1980, 5, 15), 
            LocalDate.of(2005, 1, 1), 
            6000000.0
        );

        // Deklarasi objek Dosen Tamu
        DosenTamu dosenTamu = new DosenTamu(
            "199010102021011002", 
            "8810109001", 
            "Dr. Siti Aminah", 
            "Fakultas Ekonomi Bisnis", 
            LocalDate.of(1990, 10, 10), 
            LocalDate.of(2021, 1, 1), 
            LocalDate.of(2026, 8, 20), 
            5000000.0
        );

        // Deklarasi objek Tendik (Tenaga Kependidikan)
        Tendik tendik = new Tendik(
            "198503032010122003", 
            "Hassan Ali", 
            "Akademik", 
            LocalDate.of(1985, 3, 3), 
            LocalDate.of(2010, 12, 1), 
            4000000.0
        );

        // MEMANGGIL FUNGSI printInfo() UNTUK SETIAP OBJEK
        System.out.println("=============================================");
        System.out.println("             DATA DOSEN TETAP                ");
        System.out.println("=============================================");
        dosenTetap.printInfo();
        
        System.out.println("=============================================");
        System.out.println("              DATA DOSEN TAMU                ");
        System.out.println("=============================================");
        dosenTamu.printInfo();
        
        System.out.println("=============================================");
        System.out.println("                DATA TENDIK                  ");
        System.out.println("=============================================");
        tendik.printInfo();

        // MEMANGGIL FUNGSI COUNTER
        System.out.println("=============================================");
        System.out.println("             STATISTIK PEGAWAI               ");
        System.out.println("=============================================");
        System.out.println("Jumlah Keseluruhan Pegawai : " + dosenTamu.getCounterPegawai());
        System.out.println("Jumlah Dosen Tetap         : " + dosenTetap.getCounterDosenTetap());
        System.out.println("Jumlah Dosen Tamu          : " + dosenTamu.getCounterDosenTamu());
        System.out.println("Jumlah Tendik              : " + tendik.getCounterTendik());
        System.out.println("=============================================");
    }
}