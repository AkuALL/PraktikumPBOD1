/* Nama file    : Lingkaran.java
 * Deskripsi    : berisi atribut dan method dalam class Lingkaran
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 17 Maret 2026
 */

public class Lingkaran extends BangunDatar implements IResize{
    // ======================= ATRIBUT =======================
    private double jari;

    // ======================= METHOD =======================
    // Konstruktor
    public Lingkaran() {
        setJmlSisi(1);
    }

    // Konstruktor dengan keyword Super
    public Lingkaran(double jari, String warna, String border) {
        super(1, warna, border);
        this.jari = jari;
    }

    // Mengembalikan nilai jari dari lingkaran
    public double getJari() {
        return jari;
    }

    // Mengatur nilai jari dari lingkaran
    public void setJari(double jari) {
        this.jari = jari;
    }

    // Mengembalikan luas dari lingkaran
    public double getLuas() {
        return Math.PI * Math.pow(getJari(), 2);
    }

    // Mengembalikan keliling dari lingkaran
    public double getKeliling() {
        return 2 * Math.PI * getJari();
    }

    // Mengembalikan detail dari object melalui override
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari: " + jari);
    }

    // @Override
    // public static void printCounterBangunDatar() {
    //     System.out.println("Jumlah objek bangun datar: " + counterBangunDatar);
    // }

    // Implementasi method yang ada pada Interface Class IResize
    @Override
    public void zoomIn(){
        jari = jari * 1.1;
    }

    // Implementasi method yang ada pada Interface Class IResize
    @Override
    public void zoomOut(){
        jari = jari * 0.9;
    }

    // Implementasi method yang ada pada Interface Class IResize
    @Override
    public void zoom(int percent){
        jari = jari * percent/100;
    }

}
