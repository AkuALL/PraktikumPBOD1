/* Nama file    : DosenTamu.java
 * Deskripsi    : berisi atribut dan method dalam class DosenTamu
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 15 Maret 2026
 */

package Latihan;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DosenTamu extends Pegawai {
    // ======================= ATRIBUT =======================
    private String NIDK;
    private String fakultas;
    private LocalDate tglAkhirKontrak;
    private static int counterDosenTamu = 0;

    // ======================= METHOD =======================
    // Konstruktor tanpa parameter
    public DosenTamu(){
        counterDosenTamu++;
    }

    // Konstruktor dengan parameter
    public DosenTamu(String NIP, String NIDK, String nama, String fakultas, LocalDate tglLahir, LocalDate TMT, LocalDate tglAkhirKontrak, double gajiPokok){
        super(NIP, nama, tglLahir, TMT, gajiPokok);
        this.NIDK = NIDK;
        this.fakultas = fakultas;
        this.tglAkhirKontrak = tglAkhirKontrak;
        counterDosenTamu++;
    }

    // Mengubah value NIDK Dosen Tamu
    public void setNIDK(String NIDK){
        this.NIDK = NIDK;
    }

    // Mengembalikan NIDK Dosen Tamu
    public String getNIDK(){
        return NIDK;
    }

    // Mengubah value fakultas dosen tamu
    public void setFakultas(String fakultas){
        this.fakultas = fakultas;
    }

    // Mengembalikan fakultas dosen tamu
    public String getFakultas(){
        return fakultas;
    }

    // Mengubah value tanggal akhir kontrak dosen tamu
    public void setTglAkhirKontrak(LocalDate tglAkhirKontrak){
        this.tglAkhirKontrak = tglAkhirKontrak;
    }

    // Mengembalikan tanggal akhir kontrak dosen tamu
    public LocalDate getTglAkhirKontrak(){
        return tglAkhirKontrak;
    }

    // Mengembalikan counterDosenTamu
    public int getCounterDosenTamu(){
        return counterDosenTamu;
    }

    // Menghitung tunjangan dosen tamu dengan overriding method
    @Override
    public double hitungTunjangan(){
        return  0.025 * getGajiPokok();
    }
 
    // Mengembalikan detail informasi dosen tamu dengan overriding method
    @Override
    public void printInfo(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));        
        String strGajiPokok = String.format(new Locale("id", "ID"), "Rp %,.2f", getGajiPokok());
        String strTunjangan = String.format(new Locale("id", "ID"), "Rp %,.2f", hitungTunjangan());

        super.printInfo();
        System.out.println("NIDK            : " + getNIDK());
        System.out.println("Nama            : " + getNama());
        System.out.println("Tanggal Lahir   : " + getTglLahir().format(formatter));
        System.out.println("TMT             : " + getTMT().format(formatter));
        System.out.println("Jabatan         : Dosen Tamu" );
        System.out.println("Fakultas        : " + getFakultas());
        System.out.println("Masa Kerja      : " + hitungMasaKerja());
        System.out.println("Akhir Kontrak   : "  + getTglAkhirKontrak().format(formatter));
        System.out.println("Gaji Pokok      : " + strGajiPokok);
        System.out.println("Tunjangan       : 2.5% x " + strGajiPokok + " = " + strTunjangan);
    }
}