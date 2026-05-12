package GenerikLarik;
/* Nama file    : Anabul.java
 * Deskripsi    : berisi atribut dan method dari class Anabul
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 01 Mei 2026
 */

public class Anabul {
    /* *******************ATRIBUT******************* */
    private String Nama;
    private String panggilan;
    /* *******************METHOD******************* */
    // Konstruktor tanpa parameter
    public Anabul(){
        Nama = "Kosong";
        panggilan = "Kosong";
    }

    // Konstruktor dengan parameter Nama dan Panggilan
    public Anabul(String Nama, String panggilan){
        this.Nama = Nama;
        this.panggilan = panggilan;
    }

    // Selektor Panggilan 
    public String getNamaPanggilan(){
        return panggilan;
    }

    // Selektor Nama
    public String getNama(){
        return Nama;
    }

    // Mutator Panggilan
    public void setNamaPanggilan(String panggilan){
        this.panggilan = panggilan;
    }

    // Mutator Nama
    public void setNama(String Nama){
        this.Nama = Nama;
    }

    // Method Gerak Anabul
    public void Gerak(){
        System.out.println("Anabul " + Nama + " bergerak");
    }

    // Method Bersuara Anabul
    public void Bersuara(){
        System.out.println("Anabul " + Nama + " bersuara");
    }

    // Method menampilkan detail informasi anabul
    public void printInfoAnabul(){
        System.out.println("Anabul bernama " + getNama());
        Gerak();
        Bersuara();
        System.out.println();
    }
    
}