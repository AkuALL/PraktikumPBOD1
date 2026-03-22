package Latihan;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;
    private static final int B = 3;

    public Pengusaha(){
        super();
        counterPengusaha++;
    }

    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public String getNPWP(){
        return npwp;
    }

    public void setNPWP(String npwp){
        this.npwp = npwp;
    }

    public static int getCounterPengusaha(){
        return counterPengusaha;
    }

    public int hitungMasaKerja(){
        LocalDate now = LocalDate.now();
        int selisihHari = (int) ChronoUnit.DAYS.between(tgl_mulai_kerja, now);
        return selisihHari + B;
    }

    public double hitungPajak(){
        return 0.15 * getPendapatan();
    }


    @Override
    public void cetakInfo(){
        System.out.println("NPWP                : " + getNPWP());
        super.cetakInfo();
        System.out.println("Pajak                : " + hitungPajak());
    }
}
