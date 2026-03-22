package Latihan;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani = 0;
    private static final int C = 0;

    public Petani(){
        super();
        counterPetani++;
    }

    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public String getAsalKota(){
        return asal_kota;
    }

    public void setAsalKota(String asal_kota){
        this.asal_kota = asal_kota;
    }

    public static int getCounterPetani(){
        return counterPetani;
    }

    public int hitungMasaKerja(){
        LocalDate now = LocalDate.now();
        int selisihHari = (int) ChronoUnit.DAYS.between(tgl_mulai_kerja, now);
        return selisihHari + C;
    }

    public double hitungPajak(){
        return 0;
    }


    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Asal Kota           : " + getAsalKota());
        System.out.println("Pajak                : " + hitungPajak());
    }

}
