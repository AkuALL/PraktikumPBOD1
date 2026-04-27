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
    // Konstruktor tanpa parameter
    public Mahasiswa(){
        super();
        this.NIM = "-999";
    }

    // Konstruktor dengan parameter
    public Mahasiswa(String Nama, String NIM, Dosen Dosenwali){
        super(Nama);
        this.NIM = NIM;
        this.Dosenwali = Dosenwali;
    }

    // Mutator NIM
    public void setNomor(String NIM){
        this.NIM = NIM;
    }

    // Selektor NIM
    @Override
    public String getNomor(){
        return NIM;
    } 

    // Selektor Dosenwali
    public Dosen getWali(){
        return Dosenwali;
    }

    // Mutator Dosenwali
    public void setWali(Dosen Dosenwali){
        this.Dosenwali = Dosenwali;
    }

    // Menampilkan detail informasi data Mahasiswa
    public void tampilDataMahasiswa(){
        System.out.println("Nama: " + getNama());
        System.out.println("NIM: " + getNomor());
        System.out.println("Nama Dosenwali: " + Dosenwali.getNama());
        System.out.println();
    }



}
