/* Nama file    : DosenTetap.java
 * Deskripsi    : berisi atribut dan method dalam class DosenTetap
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 15 Maret 2026
 */

package Latihan;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DosenTetap extends Pegawai {
    // ======================= ATRIBUT =======================
    private String NIDN;
    private String fakultas;
    private static final int bup = 65;
    private static int counterDosenTetap = 0;

    // ======================= METHOD =======================
    // Konstruktor tanpa parameter
    public DosenTetap(){
        counterDosenTetap++;
    }

    // Konstruktor dengan parameter
    public DosenTetap(String NIP, String NIDN, String nama, String fakultas, LocalDate tglLahir, LocalDate TMT, double gajiPokok){
        super(NIP, nama, tglLahir, TMT, gajiPokok);
        this.NIDN = NIDN;
        this.fakultas = fakultas;
        counterDosenTetap++;
    }

    // Merubah value dari NIDN Dosen Tetap
    public void setNIDN(String NIDN){
        this.NIDN = NIDN;
    }

    // Mengembalikan NIDN Dosen Tetap
    public String getNIDN(){
        return NIDN;
    }

    // Merubah value fakultas Dosen Tetap
    public void setFakultas(String fakultas){
        this.fakultas = fakultas;
    }

    // Mengembalikan fakultas Dosen Tetap
    public String getFakultas(){
        return fakultas;
    }

    // Mengembalikan counterDosenTetap
    public int getCounterDosenTetap(){
        return counterDosenTetap;
    }

    // Mengembalikan Tanggal Pensiun dari Dosen Tettap
    public LocalDate hitungTglPensiun() {
        return getTglLahir().plusYears(bup).plusMonths(1).withDayOfMonth(1);
    }

    // Menghitung tunjangan dari dosen tetap dengan overriding method
    @Override
    public double hitungTunjangan(){
        Period range = Period.between(getTMT(), LocalDate.now());
        return  0.02 * range.getYears() * getGajiPokok();
    }

    // Menampilkan detail informasi dari Dosen Tetap dengan overriding method
    @Override
    public void printInfo(){        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        String strGajiPokok = String.format(new Locale("id", "ID"), "Rp %,.2f", getGajiPokok());
        String strTunjangan = String.format(new Locale("id", "ID"), "Rp %,.2f", hitungTunjangan());
        Period range = Period.between(getTMT(), LocalDate.now());

        super.printInfo();
        System.out.println("NIDN            : " + getNIDN());
        System.out.println("Nama            : " + getNama());
        System.out.println("Tanggal Lahir   : " + getTglLahir().format(formatter));
        System.out.println("TMT             : " + getTMT().format(formatter));
        System.out.println("Jabatan         : Dosen Tetap" );
        System.out.println("Fakultas        : " + getFakultas());
        System.out.println("Masa Kerja      : " + hitungMasaKerja());
        System.out.println("Tanggal Pensiun : "  + hitungTglPensiun().format(formatter));
        System.out.println("Gaji Pokok      : " + strGajiPokok);
        System.out.println("Tunjangan       : 2% x " + range.getYears() + " x " + strGajiPokok + " = " + strTunjangan);
    }

    
}
