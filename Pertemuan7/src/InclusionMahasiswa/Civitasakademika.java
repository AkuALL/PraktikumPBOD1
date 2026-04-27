package InclusionMahasiswa;
/* Nama file    : Civitasakademika.java
 * Deskripsi    : berisi atribut dan method dari class Civitasakademika
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 26 April 2026
 */

public abstract class Civitasakademika {
    /* *******************ATRIBUT******************* */
    private String Nama;
    /* *******************METHOD******************* */
    public Civitasakademika(){
        Nama = "n/a";
    }

    public Civitasakademika(String Nama){
        this.Nama = Nama;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public String getNama(){
        return Nama;
    }

    public abstract String getNomor();
}
