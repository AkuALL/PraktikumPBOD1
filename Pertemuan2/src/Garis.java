/* Nama file    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 25 Februari 2026
 */
public class Garis {
    /**************** ATRIBUT ****************/
    Titik titikAwal;
    Titik titikAkhir;
    static int counterGaris = 0;

    /**************** METHOD ****************/
    // Konstruktor untuk membuat garis dengan Titik X dan Titik Y tertentu
    Garis(Titik X, Titik Y) {
        this.titikAwal = X;
        this.titikAkhir = Y;
        counterGaris++;
    }

    // Konstruktor untuk membuat garis dengan Titik X(0,0) dan Titik Y(1,1)
    Garis() {
        titikAwal = new Titik();
        titikAkhir = new Titik(1,1);
        counterGaris++;
    }

    Titik getTitikAwal() {
        return titikAwal;
    }

    Titik getTitikAkhir() {
        return titikAkhir;
    }

    static int getCounterGaris() {
        return counterGaris;
    }

    void setTitikAwal(Titik X) {
        titikAwal = X;
    }

    void setTitikAkhir(Titik Y) {
        titikAkhir = Y;
    }

    double getPanjangGaris() {
        return Math.sqrt(Math.pow(titikAkhir.getAbsis() - titikAwal.getAbsis(), 2) + Math.pow(titikAkhir.getOrdinat() - titikAwal.getOrdinat(), 2));
    }

    double getGradienGaris() {
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }
}