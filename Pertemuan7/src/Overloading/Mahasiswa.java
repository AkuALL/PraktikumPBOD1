package Overloading;
/* Nama file    : Mahasiswa.java
 * Deskripsi    : berisi atribut dan method class Mahasiswa
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 25 April 2026
 */

// Alasan menggunakan access modifier default, agar method dapat digunakan oleh package yang sama saja.
class Mahasiswa {
    /* *******************ATRIBUT******************* */
    private String NIM;
    private String Nama;
    private String Programstudi;
    /* *******************METHOD******************* */
    // Konstruktor tipe 1 (bagian C)
    Mahasiswa(){
        NIM = "-999";
        Nama = "n/a";
        Programstudi = "n/a";
    }

    // Konstruktor tipe 2 (bagian D)
    Mahasiswa(String NIM, String Nama, String Programstudi){
        this.NIM = NIM;
        this.Nama = Nama;
        this.Programstudi = Programstudi;
    }

    // Konstruktor tipe 3 (bagian E)
    Mahasiswa(Mahasiswa mhs){
        this.NIM = mhs.getNIM();
        this.Nama = mhs.getNama();
        this.Programstudi = mhs.getProgramstudi();
    }

    // Selektor untuk NIM
    String getNIM(){
        return NIM;
    }

    // Selektor untuk Nama
    String getNama(){
        return Nama;
    }

    // Selektor untuk Programstudi
    String getProgramstudi(){
        return Programstudi;
    }

    // Mutator untuk NIM
    void setNIM(String NIM){
        this.NIM = NIM;
    }

    // Mutator untuk Nama
    void setNama(String Nama){
        this.Nama = Nama;
    }

    // Mutator Programstudi tipe 1
    void setProgramStudi(){
        this.Programstudi = "Kosong";
    }

    // Mutator Programstudi tipe 2
    void setProgramStudi(String Programstudi){
        this.Programstudi = Programstudi;
    }

    // Mutator Programstudi tipe 3
    void setProgramStudi(Mahasiswa mhs){
        this.Programstudi = mhs.getProgramstudi();
    }

    // Menampilkan informasi Mahasiswa
    void printInfo(){
        System.out.println("Nama: " + getNama());
        System.out.println("NIM: " + getNIM());
        System.out.println("Program Studi: " + getProgramstudi() + "\n");
    }
}
