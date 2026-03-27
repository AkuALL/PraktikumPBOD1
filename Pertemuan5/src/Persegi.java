/* Nama file    : Persegi.java
 * Deskripsi    : berisi atribut dan method dalam class Persegi
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 17 Maret 2026
 */

public class Persegi extends BangunDatar implements IResize {
    // ======================= ATRIBUT =======================
    private double sisi;

    // ======================= METHOD =======================
    // Konstruktor
    public Persegi () {
        setJmlSisi(4);
    }

    // // Konstruktor dengan menggunakan method dari class BangunDatar
    // public Persegi (double sisi, String warna, String border) {
    //     this.sisi = sisi;
    //     setWarna (warna);
    //     setBorder (border);
    //     setJmlSisi(4);
    // }

    // Konstruktor dengan menggunakan keyword this untuk memanggil atribut BangunDatar langsung
    // public Persegi (double sisi, String warna, String border) {
    //     this.jmlSisi = 4;
    //     this.warna = warna;
    //     this.border = border;
    //     this.sisi = sisi;
    // }

    // Konstruktor dengan keyword Super
    public Persegi (double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    // Mengembalikan nilai sisi dari persegi
    public double getSisi() {
        return sisi;
    }

    // Mengatur nilai sisi dari persegi
    public void setSisi (double sisi) {
        this.sisi = sisi;
    }

    // Mengembalikan luas dari persegi
    public double getLuas() {
        return getSisi() * getSisi();
    }

    // Mengembalikan keliling dari persegi
    public double getKeliling() {
        return getSisi() * getJmlSisi();
    }

    // Mengembalikan diagonal dari persegi
    public double getDiagonal() {
        return Math.sqrt(2 * Math.pow(getSisi(), 2));
    }

    // Mengembalikan detail dari object melalui override
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }

    // Implementasi method yang ada pada Interface Class IResize
    @Override
    public void zoomIn(){
        sisi = sisi * 1.1;
    }

    // Implementasi method yang ada pada Interface Class IResize
    @Override
    public void zoomOut(){
        sisi = sisi * 0.9;
    }

    // Implementasi method yang ada pada Interface Class IResize
    @Override
    public void zoom(int percent){
        sisi = sisi * percent/100;
    }
}
