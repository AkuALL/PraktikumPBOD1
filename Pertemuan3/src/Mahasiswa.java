/* Nama file    : Mahasiswa.java
 * Deskripsi    : berisi atribut dan method dalam class Mahasiswa
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 03 Maret 2026
 */

import java.util.ArrayList;

public class Mahasiswa {
    /**************** ATRIBUT ****************/
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /**************** METHOD ****************/
    // Konstruktor untuk membuat Mahasiswa tanpa parameter
    public Mahasiswa(){
        nim = "";
        nama = "";
        prodi = "";
        listMatKul = new ArrayList<>();
    }

    // Konstruktor untuk membuat Mahasiswa dengan parameter nim, nama, prodi
    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
    }

    // Mengembalikan nim dari Mahasiswa
    public String getNim(){
        return nim;
    }

    // Mengembalikan nama dari Mahasiswa
    public String getNama(){
        return nama;
    }

    // Mengembalikan prodi dari Mahasiswa
    public String getProdi(){
        return prodi;
    }

    // Mengembalikan list Mata Kuliah dari Mahasiswa
    public ArrayList<MataKuliah> getlistMatKul(){
        return listMatKul;
    }

    // Mengembalikan dosen wali dari Mahasiswa
    public Dosen getDosenWali(){
        return dosenWali;
    }

    // Mengembalikan kendaraan dari Mahasiswa
    public Kendaraan getKendaraan(){
        return kendaraan;
    }

    // Mengeset nim kepunyaan Mahasiswa
    public void setNim(String NIM){
        nim = NIM;
    }

    // Mengeset nama kepunyaan Mahasiswa
    public void setNama(String Name){
        nama = Name;
    }

    // Mengeset prodi kepunyaan Mahasiswa
    public void setProdi(String Prodi){
        prodi = Prodi;
    }

    // Menambahkan sebuah mata kuliah ke atribut listMatKul
    public void addMatKul (MataKuliah newMatKul){
        listMatKul.add(newMatKul);
    }

    // Mengeset dosen wali kepunyaan Mahasiswa
    public void setDosenWali(Dosen DosWal){
        dosenWali = DosWal;
    }

    // Mengeset kendaraan kepunyaan Mahasiswa
    public void setKendaraan(Kendaraan vehicle){
        kendaraan = vehicle;
    }

    // Mendapatkan jumlah SKS mata kuliah yang diambil mahasiswa.
    public int getJumlahSKS(){
        int sumSKS = 0;
        for(int i = 0; i < listMatKul.size(); i++){
            sumSKS += listMatKul.get(i).getSks();
        }
        return sumSKS;
    }

    // Mendapatkan jumlah mata kuliah yang diambil mahasiswa
    public int getJumlahMatKul(){
        int sumMatKul = 0;
        for(int i = 0; i < listMatKul.size(); i++){
            sumMatKul++;
        }
        return sumMatKul;
    }

    // Menampilkan nim, nama, dan prodi mahasiswa
    public void printMhs(){
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    // menampilkan nim, nama, prodi, daftar mata kuliah yang diambil, data dosen wali, serta data kendaraan yang dimiliki mahasiswa.
    public void printDetailMhs(){
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        for(int i = 0; i < listMatKul.size(); i++){
            System.out.println(listMatKul.get(i).getNama());
        }
        System.out.println("Nama Dosen Wali: " + dosenWali.getNama());
        System.out.println("Kendaraan: " + kendaraan.getJenis());
    }
} // End Class Mahasiswa