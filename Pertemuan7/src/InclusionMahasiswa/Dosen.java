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
    public Dosen(){
        super();
        this.NIP = "-999";
    }

    public Dosen(String Nama, String NIP){
        super(Nama);
        this.NIP = NIP;
    }

    public void setNomor(String NIP){
        this.NIP = NIP;
    }

    @Override
    public String getNomor(){
        return NIP;
    } 
}
