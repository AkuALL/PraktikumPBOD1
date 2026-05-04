package GenerikClass;
/* Nama file    : Burung.java
 * Deskripsi    : berisi atribut dan method dari class Burung
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 25 April 2026
 */

public class Burung extends Anabul {
    /* *******************ATRIBUT******************* */

    /* *******************METHOD******************* */
    // Konstruktor tanpa parameter
    public Burung(){
        super();
    }

    // Konstruktor dengan parameter
    public Burung(String nama) {
        super(nama);
    }

    // Method Gerak Burung
    @Override
    public void Gerak() {
        System.out.println(getNama() + " bergerak dengan terbang"); 
    }

    // Method Bersuara Burung
    @Override
    public void Bersuara() {
        System.out.println(getNama() + " berbunyi cuit");
    }
}