package GenerikOperator;
/* Nama file    : Datum.java
 * Deskripsi    : berisi atribut dan method dari class Datum
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 03 Mei 2026
 */

public class Datum <G> {
    /* *******************ATRIBUT******************* */
    protected G isi;
    /* *******************METHOD******************* */
    // Konstruktor tanpa parameter
    public Datum(){
        this.isi = null;
    }

    // Konstruktor dengan parameter
    public Datum(G isi){
        this.isi = isi;
    }

    //Selektor atribut isi
    public G getIsi() {
        return this.isi;
    }

    // Mutator atribut isi
    public void setIsi(G isibaru) {
        this.isi = isibaru;
    }
}