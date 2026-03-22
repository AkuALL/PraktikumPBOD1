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
    public Manusia(){
        counterMns++;
    }

    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan){
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setTgl_mulai_kerja(LocalDate tgl_mulai_kerja){
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }

    public String getNama(){
        return nama;
    }

    public LocalDate getTgl_mulai_kerja(){
        return tgl_mulai_kerja;
    }

    public String getAlamat(){
        return alamat;
    }

    public double getPendapatan(){
        return pendapatan;
    }

    public static int getCounterMns(){
        return counterMns;
    }

    public void cetakInfo(){
        System.out.println("Nama                : " + getNama());
        System.out.println("Tanggal Mulai Kerja : " + getTgl_mulai_kerja());
        System.out.println("Alamat              : " + getAlamat());
        System.out.println("Pendapatan          : " + getPendapatan());
        System.out.println("Masa Kerja          : " + hitungMasaKerja());
    }

    public abstract int hitungMasaKerja();
}
