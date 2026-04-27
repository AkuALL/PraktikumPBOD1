package InclusionMahasiswa;
/* Nama file    : Dosen.java
 * Deskripsi    : berisi atribut dan method dari class Dosen
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 26 April 2026
 */

public class Dosen extends Civitasakademika {
    /* *******************ATRIBUT******************* */
    private String NIP;
    /* *******************METHOD******************* */
    // Konstruktor tanpa parameter
    public Dosen(){
        super();
        this.NIP = "-999";
    }

    // Konstruktor dengan parameter
    public Dosen(String Nama, String NIP){
        super(Nama);
        this.NIP = NIP;
    }

    // Mutator NIP
    public void setNomor(String NIP){
        this.NIP = NIP;
    }

    // Selektor NIP
    @Override
    public String getNomor(){
        return NIP;
    } 
}
