package GenerikLarik;
/* Nama file    : Anjing.java
 * Deskripsi    : berisi atribut dan method dari class Anjing
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 25 April 2026
 */
public class Anjing extends Anabul {
    /* *******************ATRIBUT******************* */

    /* *******************METHOD******************* */
    // Konstruktor tanpa parameter
    public Anjing() {
        super();
    }

    // Konstruktor dengan parameter
    public Anjing(String nama) {
        super(nama);
    }

    // Method Gerak Anjing
    @Override
    public void Gerak() {
        System.out.println(getNama() + " bergerak dengan melata");
    }

    // Method Bersuara Anjing
    @Override
    public void Bersuara() {
        System.out.println(getNama() + " bersuara guk-guk");
    }
}