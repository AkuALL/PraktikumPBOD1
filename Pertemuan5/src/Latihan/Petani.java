/* Nama file    : Petani.java
 * Deskripsi    : berisi atribut dan method dalam class Petani
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 20 Maret 2026
 */

package Latihan;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Petani extends Manusia implements Pajak {
    // ======================= ATRIBUT =======================
    private String asal_kota;
    private static int counterPetani = 0;
    private static final int C = 0;

    // ======================= METHOD =======================
    // Konstruktor tanpa parameter
    public Petani(){
        super();
        counterPetani++;
    }

    // Konstruktor dengan parameter
    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    // Mengembalikan asal_kota Petani
    public String getAsalKota(){
        return asal_kota;
    }

    // Merubah value dari asal_kota Petani
    public void setAsalKota(String asal_kota){
        this.asal_kota = asal_kota;
    }

    // Mengembalikan counterPetani
    public static int getCounterPetani(){
        return counterPetani;
    }

    // Implementasi Abstract Method hitungMasaKerja pada class Manusia
    public int hitungMasaKerja(){
        LocalDate now = LocalDate.now();
        int selisihHari = (int) ChronoUnit.DAYS.between(tgl_mulai_kerja, now);
        return selisihHari + C;
    }

    // Implementasi method yang ada pada Interface Class Pajak
    public double hitungPajak(){
        return 0;
    }

    // Overriding method cetakInfo
    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Asal Kota           : " + getAsalKota());
        System.out.println("Pajak                : " + hitungPajak());
    }

}
