/* Nama file    : PNS.java
 * Deskripsi    : berisi atribut dan method dalam class PNS
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 20 Maret 2026
 */

package Latihan;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PNS extends Manusia implements Pajak{
    // ======================= ATRIBUT =======================
    private String nip;
    private static int counterPNS = 0;
    private static final int A = 0;

    // ======================= METHOD =======================
    // Konstruktor tanpa parameter
    public PNS(){
        super();
        counterPNS++;
    }

    // Konstruktor dengan parameter
    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // Merubah value dari nip PNS
    public void setNIP(String nip){
        this.nip = nip;
    }

    // Mengembalikan value dari nip PNS
    public String getNIP(){
        return nip;
    }
   
    // Mengembalikan counterPNS
    public static int getCounterPNS(){
        return counterPNS;
    }

    // Implementasi Abstract Method hitungMasaKerja pada class Manusia
    public int hitungMasaKerja(){
        LocalDate now = LocalDate.now();
        int selisihHari = (int) ChronoUnit.DAYS.between(tgl_mulai_kerja, now);
        return selisihHari + A;
    }

    // Implementasi method yang ada pada Interface Class Pajak
    @Override
    public double hitungPajak(){
        return 0.1 * getPendapatan();
    }

    // Overriding method cetakInfo
    @Override
    public void cetakInfo(){
        System.out.println("NIP                : " + getNIP());
        super.cetakInfo();
        System.out.println("Pajak                : " + hitungPajak());
    }
}