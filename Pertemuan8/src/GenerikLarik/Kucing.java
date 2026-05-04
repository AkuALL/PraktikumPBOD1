package GenerikLarik;
/* Nama file    : Kucing.java
 * Deskripsi    : berisi atribut dan method dari class Kucing
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 01 Mei 2026
 */

public class Kucing extends Anabul {
    /* *******************ATRIBUT******************* */
    private double bobot;
    /* *******************METHOD******************* */
    // Konstruktor tanpa parameter
    public Kucing(){
        super();
    }

    // Konstruktor dengan parameter
    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    // Mutator untuk atribut bobot
    public void setBobot(double bobot){
        this.bobot = bobot;
    }

    // Selektor untuk atribut bobot
    public double getBobot(){
        return bobot;
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
