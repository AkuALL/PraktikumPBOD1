/* Nama file    : Pengusaha.java
 * Deskripsi    : berisi atribut dan method dalam class Pengusaha
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 20 Maret 2026
 */

package Latihan;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pengusaha extends Manusia implements Pajak {
    // ======================= ATRIBUT =======================
    private String npwp;
    private static int counterPengusaha = 0;
    private static final int B = 3;

    // ======================= METHOD =======================
    // Konstruktor tanpa parameter
    public Pengusaha(){
        super();
        counterPengusaha++;
    }

    // Konstruktor dengan parameter
    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    // Mengembalikan npwp Pengusaha
    public String getNPWP(){
        return npwp;
    }

    // Merubah value npwp Pengusaha
    public void setNPWP(String npwp){
        this.npwp = npwp;
    }

    // Mengembalikan counterPengusaha
    public static int getCounterPengusaha(){
        return counterPengusaha;
    }

    // Implementasi Abstract Method hitungMasaKerja pada class Manusia
    public int hitungMasaKerja(){
        LocalDate now = LocalDate.now();
        int selisihHari = (int) ChronoUnit.DAYS.between(tgl_mulai_kerja, now);
        return selisihHari + B;
    }

    // Implementasi method yang ada pada Interface Class Pajak
    @Override
    public double hitungPajak(){
        return 0.15 * getPendapatan();
    }

    // Overriding method cetakInfo
    @Override
    public void cetakInfo(){
        System.out.println("NPWP                : " + getNPWP());
        super.cetakInfo();
        System.out.println("Pajak                : " + hitungPajak());
    }
}
