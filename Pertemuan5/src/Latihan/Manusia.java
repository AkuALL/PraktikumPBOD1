/* Nama file    : Manusia.java
 * Deskripsi    : berisi atribut dan method dalam class Manusia
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 20 Maret 2026
 */

package Latihan;

import java.time.LocalDate;

public abstract class Manusia {
    // ======================= ATRIBUT =======================
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    // ======================= METHOD =======================
    // Konstruktor tanpa parameter
    public Manusia(){
        counterMns++;
    }

    // Konstruktor dengan parameter
    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan){
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    // Merubah value dari nama Manusia
    public void setNama(String nama){
        this.nama = nama;
    }

    // Merubah value dari tgl_mulai_kerja Manusia
    public void setTgl_mulai_kerja(LocalDate tgl_mulai_kerja){
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    // Merubah value dari alamat Manusia
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    // Merubah value dari Pendapatan Manusia
    public void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }

    // Mengembalikan nama Manusia
    public String getNama(){
        return nama;
    }

    // Mengembalikan tgl_mulai_kerja Manusia
    public LocalDate getTgl_mulai_kerja(){
        return tgl_mulai_kerja;
    }

    // Mengembalikan alamat Manusia
    public String getAlamat(){
        return alamat;
    }

    // Mengembalikan pendapatan Manusia
    public double getPendapatan(){
        return pendapatan;
    }

    // Mengembalikan counterMns
    public static int getCounterMns(){
        return counterMns;
    }

    // Menampilkan detail informasi 
    public void cetakInfo(){
        System.out.println("Nama                : " + getNama());
        System.out.println("Tanggal Mulai Kerja : " + getTgl_mulai_kerja());
        System.out.println("Alamat              : " + getAlamat());
        System.out.println("Pendapatan          : " + getPendapatan());
        System.out.println("Masa Kerja          : " + hitungMasaKerja());
    }

    // abstract method menghitung masa kerja
    public abstract int hitungMasaKerja();
}
