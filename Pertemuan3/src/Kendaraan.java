/* Nama file    : Kendaraan.java
 * Deskripsi    : berisi atribut dan method dalam class Kendaraan
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 03 Maret 2026
 */

public class Kendaraan {
    /**************** ATRIBUT ****************/
    private String noPlat;
    private String jenis;

    /**************** METHOD ****************/
    // Konstruktor untuk membuat kendaraan tanpa parameter
    public Kendaraan(){
        noPlat = "";
        jenis = ""; 
    }
    
    // Konstruktor untuk membuat kendaraan dengan parameter noPlat dan jenis.
    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    // Mengembalikan noPlat dari Kendaraan
    public String getNoPlat(){
        return noPlat;
    }

    // Mengembalikan jenis dari Kendaraan
    public String getJenis(){
        return jenis;
    }

    // Mengeset noPlat kepunyaan Kendaraan
    public void setNoPlat(String NoPlat){
        noPlat = NoPlat;
    }

    // Mengeset jenis kepunyaan Kendaraan
    public void setJenis(String Jenis){
        jenis = Jenis;
    }
} //End Class Kendaraan