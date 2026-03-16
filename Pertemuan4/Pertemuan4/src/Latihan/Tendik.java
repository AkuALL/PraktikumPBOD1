/* Nama file    : Tendik.java
 * Deskripsi    : berisi atribut dan method dalam class Tendik
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 15 Maret 2026
 */

package Latihan;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Tendik extends Pegawai{
    // ======================= ATRIBUT =======================
    private String bidang;
    private static final int bup = 55;
    private static int counterTendik = 0;

    // ======================= METHOD =======================
    // Konstruktor tanpa parameter
    public Tendik(){
        counterTendik++;
    }

    // Konstruktor dengan parameter
    public Tendik(String NIP, String nama, String bidang, LocalDate tglLahir, LocalDate TMT, double gajiPokok){
        super(NIP, nama, tglLahir, TMT, gajiPokok);
        this.bidang = bidang;
        counterTendik++;
    }

    // Mengubah value dari Bidang Tendik
    public void setBidang(String bidang){
        this.bidang = bidang;
    }

    // Mengembalikan bidang dari Tendik
    public String getBidang(){
        return bidang;
    }

    // Mengembalikan counterTendik
    public int getCounterTendik(){
        return counterTendik;
    }

    // Mengembalikan Tanggal Pensiun dari Tendik
    public LocalDate hitungTglPensiun() {
        return getTglLahir().plusYears(bup).plusMonths(1).withDayOfMonth(1);
    }

    // Menghitung tunjangan dari tendik dengan overriding method
    @Override
    public double hitungTunjangan(){
        Period range = Period.between(getTMT(), LocalDate.now());
        return  0.01 * range.getYears() * getGajiPokok();
    }

    // Menampilkan detail informasi dari Tendik dengan overriding method
    @Override
    public void printInfo(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));        
        String strGajiPokok = String.format(new Locale("id", "ID"), "Rp %,.2f", getGajiPokok());
        String strTunjangan = String.format(new Locale("id", "ID"), "Rp %,.2f", hitungTunjangan());
        Period range = Period.between(getTMT(), LocalDate.now());

        super.printInfo();
        System.out.println("Nama            : " + getNama());
        System.out.println("Tanggal Lahir   : " + getTglLahir().format(formatter));
        System.out.println("TMT             : " + getTMT().format(formatter));
        System.out.println("Jabatan         : Tendik" );
        System.out.println("Bidang          : " + getBidang());
        System.out.println("Masa Kerja      : " + hitungMasaKerja());
        System.out.println("Tanggal Pensiun : "  + hitungTglPensiun().format(formatter));
        System.out.println("Gaji Pokok      : " + strGajiPokok);
        System.out.println("Tunjangan       : 1% x " + range.getYears() + " x " + strGajiPokok + " = " + strTunjangan);
    }

}
