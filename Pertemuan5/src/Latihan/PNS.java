package Latihan;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PNS extends Manusia implements Pajak{
    private String nip;
    private static int counterPNS = 0;
    private static final int A = 0;

    public PNS(){
        super();
        counterPNS++;
    }

    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public void setNIP(String nip){
        this.nip = nip;
    }

    public String getNIP(){
        return nip;
    }

    public static int getCounterPNS(){
        return counterPNS;
    }

    public int hitungMasaKerja(){
        LocalDate now = LocalDate.now();
        int selisihHari = (int) ChronoUnit.DAYS.between(tgl_mulai_kerja, now);
        return selisihHari + A;
    }

    public double hitungPajak(){
        return 0.1 * getPendapatan();
    }

    @Override
    public void cetakInfo(){
        System.out.println("NIP                : " + getNIP());
        super.cetakInfo();
        System.out.println("Pajak                : " + hitungPajak());
    }
}