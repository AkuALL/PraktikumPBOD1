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
    // Konstruktor tanpa parameter
    public Civitasakademika(){
        Nama = "n/a";
    }

    // Konstruktor dengan parameter
    public Civitasakademika(String Nama){
        this.Nama = Nama;
    }

    // Mutator Nama
    public void setNama(String Nama){
        this.Nama = Nama;
    }

    // Selektor Nama
    public String getNama(){
        return Nama;
    }

    // Abstract Method getNomor
    public abstract String getNomor();
}
