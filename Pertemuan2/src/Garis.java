/* Nama file    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 25 Februari 2026
 */
public class Garis {
    /**************** ATRIBUT ****************/
    Titik X;
    Titik Y;
    static int counterGaris = 0;

    /**************** METHOD ****************/
    // Konstruktor untuk membuat garis dengan Titik X dan Titik Y tertentu
    Garis(Titik X, Titik Y) {
        this.X = X;
        this.Y = Y;
        counterGaris++;
    }

    // Konstruktor untuk membuat garis dengan Titik X(0,0) dan Titik Y(1,1)
    Garis() {
        X = new Titik();
        Y = new Titik(1,1);
        counterGaris++;
    }

    static int getCounterGaris() {
        return counterGaris;
    }

    



}