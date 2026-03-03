/* Nama file    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 03 Maret 2026
 */

public class Dosen {
    /**************** ATRIBUT ****************/
    private String nip;
    private String nama;
    private String prodi;

    /**************** METHOD ****************/
    // Konstruktor untuk membuat Dosen tanpa parameter
    public Dosen() {
        nip = "";
        nama = "";
        prodi = "";
    }

    // Konstruktor untuk membuat Dosen dengan parameter nip, nama, dan prodi
    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    // Mengembalikan NIP dari dosen
    public String getNip(){
        return nip;
    }

    // Mengembalikan Nama dari dosen
    public String getNama(){
        return nama;
    }

    // Mengembalikan Prodi dari dosen
    public String getProdi(){
        return prodi;
    }

    // Mengeset NIP kepunyaan Dosen
    public void setNip(String NIP){
        nip = NIP;
    }

    // Mengeset Nama kepunyaan Dosen
    public void setNama(String Name){
        nama = Name;
    }

    // Mengeset Program Studi kepunyaan Dosen
    public void setProdi(String Prodi){
        prodi = Prodi;
    }
} // End Class Dosen