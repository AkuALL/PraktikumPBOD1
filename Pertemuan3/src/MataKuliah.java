/* Nama file    : MataKuliah.java
 * Deskripsi    : berisi atribut dan method dalam class MataKuliah
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 03 Maret 2026
 */

public class MataKuliah {
    /**************** ATRIBUT ****************/
    private String idMatkul;
    private String nama;
    private int sks;

    /**************** METHOD ****************/
    // Konstruktor untuk membuat MataKuliah tanpa parameter
    public MataKuliah(){
        idMatkul = "";
        nama = "";
        sks = 0;
    }

    // Konstruktor untuk membuat MataKuliah dengan parameter idMatKul, nama, dan sks.
    public MataKuliah(String idMatKul, String nama, int sks){
        this.idMatkul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    // Mengembalikan idMatkul dari Mata Kuliah
    public String getIdMatkul(){
        return idMatkul;
    }

    // Mengembalikan Nama dari Mata Kuliah
    public String getNama(){
        return nama;
    }

    // Mengembalikan SKS dari Mata Kuliah
    public int getSks(){
        return sks;
    }

    // Mengeset idMatkul kepunyaan Mata Kuliah
    public void setIdMatkul(String idMK){
        idMatkul = idMK;
    }

    // Mengeset Nama kepunyaan Mata Kuliah
    public void setNama(String Name){
        nama = Name;
    }

    // Mengeset SKS kepunyaan Mata Kuliah
    public void setSks(int SKS){
        sks = SKS;
    }
}
