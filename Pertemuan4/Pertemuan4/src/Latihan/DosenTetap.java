package Latihan;

import java.time.LocalDate;

public class DosenTetap extends Pegawai {
    // ======================= ATRIBUT =======================
    private String NIDN;
    private static final int bup = 65;
    private static int counterDosenTetap = 0;

    // ======================= METHOD =======================
    // Konstruktor tanpa parameter
    public DosenTetap(){
        counterDosenTetap++;
    }

    public DosenTetap(String NIP, String NIDN, String nama, String tglLahir, String TMT, int gajiPokok){
        super(NIP, nama, tglLahir, TMT, gajiPokok);
        this.NIDN = NIDN;
    }

    public void setNIDN(String NIDN){
        this.NIDN = NIDN;
    }

    public String getNIDN(){
        return NIDN;
    }

    public int getCounterDosenTetap(){
        return counterDosenTetap;
    }

    public LocalDate hitungTglPensiun() {
        return getTglLahir().plusYears(bup).plusMonths(1).withDayOfMonth(1);
    }
    // public int getTunjangan(){
    //     2
    // }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("NIDN            : " + getNIDN());
    }

    
}
