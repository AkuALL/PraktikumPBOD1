package InclusionAnabul;
/* Nama file    : Kucing.java
 * Deskripsi    : berisi atribut dan method dari class Kucing
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 25 April 2026
 */

public class Kucing extends Anabul {
    /* *******************ATRIBUT******************* */

    /* *******************METHOD******************* */
    // Konstruktor tanpa parameter
    public Kucing(){
        super();
    }

    // Konstruktor dengan parameter
    public Kucing(String nama) {
        super(nama);
    }

    // Method Gerak Kucing
    @Override
    public void Gerak() {
        // Langsung panggil variabel 'Nama', tidak perlu getNama()
        System.out.println(getNama() + " bergerak dengan melata"); 
    }

    // Method Bersuara Kucing
    @Override
    public void Bersuara() {
        System.out.println(getNama() + " berbunyi meong");
    }
}
