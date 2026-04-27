package InclusionMahasiswa;
/* Nama file    : Mahasiswa.java
 * Deskripsi    : berisi atribut dan method dari class Mahasiswa
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 26 April 2026
 */

public class Mahasiswa extends Civitasakademika {
    /* *******************ATRIBUT******************* */
    private String NIM;
    private Dosen Dosenwali;
    /* *******************METHOD******************* */
    public Mahasiswa(){
        super();
        this.NIM = "-999";
    }

    public Mahasiswa(String Nama, String NIM, Dosen Dosenwali){
        super(Nama);
        this.NIM = NIM;
        this.Dosenwali = Dosenwali;
    }

    public void setNomor(String NIM){
        this.NIM = NIM;
    }

    @Override
    public String getNomor(){
        return NIM;
    } 

    public Dosen getWali(){
        return Dosenwali;
    }

    public void setWali(Dosen Dosenwali){
        this.Dosenwali = Dosenwali;
    }

    public void tampilDataMahasiswa(){
        System.out.println("Nama: " + getNama());
        System.out.println("NIM: " + getNomor());
        System.out.println("Nama Dosenwali: " + Dosenwali.getNama());
        System.out.println();
    }



}
