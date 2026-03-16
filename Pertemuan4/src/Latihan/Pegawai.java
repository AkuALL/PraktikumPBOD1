/* Nama file    : Pegawai.java
 * Deskripsi    : berisi atribut dan method dalam class Pegawai
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 15 Maret 2026
 */

package Latihan;

import java.time.LocalDate;
import java.time.Period;

public class Pegawai {
    // ======================= ATRIBUT =======================
    private String NIP;
    private String nama;
    private LocalDate tglLahir;
    private LocalDate TMT;
    private double gajiPokok;
    private static int counterPegawai = 0;

    // ======================= METHOD =======================
    // Konstruktor tanpa parameter
    public Pegawai(){
        counterPegawai++;
    }

    // Konstruktor dengan parameter
    public Pegawai(String NIP, String nama, LocalDate tglLahir, LocalDate TMT, double gajiPokok){
        this.NIP = NIP;
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
        counterPegawai++;
    }

    // Merubah value dari NIP Pegawai
    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    // Merubah value dari Nama Pegawai
    public void setNama(String nama){
        this.nama = nama;
    }

    // Merubah value dari Tanggal Lahir Pegawai
    public void setTglLahir(LocalDate tglLahir){
        this.tglLahir = tglLahir;
    }

    // Merubah value dari TMT Pegawai
    public void setTMT(LocalDate TMT){
        this.TMT = TMT;
    }

    // Merubah value dari Gaji Pokok pegawai
    public void setGajiPokok(double gajiPokok) { 
        this.gajiPokok = gajiPokok; 
    }

    // Mengembalikan NIP Pegawai
    public String getNIP(){
        return NIP;
    }

    // Mengembalikan Nama Pegawai
    public String getNama(){
        return nama;
    }

    // Mengembalikan Tanggal Lahir Pegawai
    public LocalDate getTglLahir(){
        return tglLahir;
    }

    // Mengembalikan TMT Bekerja Pegawai
    public LocalDate getTMT(){
        return TMT;
    }

    // Mengembalikan Gaji Pokok Pegawai
    public double getGajiPokok(){
        return gajiPokok;
    }

    // Menghitung Masa Kerja Pegawai 
    public String hitungMasaKerja() {
        Period range = Period.between(TMT, LocalDate.now());
        return range.getYears() + " tahun " + range.getMonths() + " bulan";
    }

    // Menghitung tunjangan dari Pegawai
    public double hitungTunjangan(){
        return 0;
    }

    // Mengembalikan counterPegawai
    public int getCounterPegawai(){
        return counterPegawai;
    }

    // Mengembalikan detail informasi pegawai
    public void printInfo(){
        System.out.println("NIP             : " + getNIP());
    }
}
