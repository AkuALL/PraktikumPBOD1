package InclusionAnabul;
/* Nama file    : Anabul.java
 * Deskripsi    : berisi atribut dan method dari class Anabul
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 25 April 2026
 */

// Alasan menggunakan access modifier default, agar method dapat digunakan oleh package yang sama saja.
public class Anabul {
    /* *******************ATRIBUT******************* */
    private String Nama;
    /* *******************METHOD******************* */
    // Konstruktor tanpa parameter
    public Anabul(){
        Nama = "Kosong";
    }

    // Konstruktor dengan parameter Nama
    public Anabul(String Nama){
        this.Nama = Nama;
    }

    // Selektor Nama
    public String getNama(){
        return Nama;
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
