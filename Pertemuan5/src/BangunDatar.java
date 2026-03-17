/* Nama file    : BangunDatar.java
 * Deskripsi    : berisi atribut dan method dalam class BangunDatar
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 10 Maret 2026
 */

public abstract class BangunDatar {
    // ======================= ATRIBUT =======================
    protected int jmlSisi;
    protected String warna;
    protected String border;
    private static int counterBangunDatar = 0;

    // ======================= METHOD =======================
    // Konstruktor tanpa parameter
    public BangunDatar() {
        counterBangunDatar++;
    }

    // Konstruktor dengan parameter
    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    // Mengembalikan jumlah sisi
    public int getJmlSisi() {
        return jmlSisi;
    }

    // Mengatur junlah sisi
    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    // Mengembalikan warna
    public String getWarna() {
        return warna;
    }

    // Mengatur warna
    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    // Mengembalikan border
    public String getBorder() {
        return border;
    }

    // Mengatur border
    public void setBorder(String border) {
        this.border = border;
    }

    // Mengembalikan nilai static dari counterBangunDatar
    public static void printCounterBangunDatar() {
        System.out.println("Jumlah objek bangun datar: " + counterBangunDatar);
    }

    // Mengembalikan detail informasi
    public void printInfo(){
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    // final public void printInfo(){
    //     System.out.println("Jumlah sisi: " + jmlSisi);
    //     System.out.println("Warna: " + warna);
    //     System.out.println("Border: " + border);
    // }

    // PERTEMUAN 5
    // Abstract method getLuas
    public abstract double getLuas();
    
    // Abstract method fetKeliling
    public abstract double getKeliling();

    // Method cek apakah luas kedua bangun datar sama
    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    // Method cek apakah keliling kedua bangun datar sama
    public boolean isEqualKeliling(BangunDatar X){
        return this.getKeliling() == X.getKeliling();
    }
}