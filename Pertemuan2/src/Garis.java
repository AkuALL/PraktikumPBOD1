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

    // Mengembalikan Titik Awal dari garis
    Titik getTitikAwal() {
        return titikAwal;
    }

    // Mengembalikan Titik Akhir dari garis
    Titik getTitikAkhir() {
        return titikAkhir;
    }

    // Mengembalikan nilai counterGaris
    static int getCounterGaris() {
        return counterGaris;
    }

    // Mengeset Titik Awal garis dengan nilai baru X
    void setTitikAwal(Titik X) {
        titikAwal = X;
    }

    // Mengeset Titik Akhir garis dengan nilai baru Y
    void setTitikAkhir(Titik Y) {
        titikAkhir = Y;
    }

    // Mengembalikan nilai dari panjang sebuah garis
    double getPanjangGaris() {
        return Math.sqrt(Math.pow(titikAkhir.getAbsis() - titikAwal.getAbsis(), 2) + Math.pow(titikAkhir.getOrdinat() - titikAwal.getOrdinat(), 2));
    }

    // Mengembalikan nilai dari gradien sebuah garis
    double getGradienGaris() {
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    // Mengembalikan koordinat titik tengah dari sebuah garis
    Titik getMidPointGaris() {
        return new Titik((titikAkhir.getAbsis() + titikAwal.getAbsis())/2, (titikAkhir.getOrdinat()+titikAwal.getOrdinat())/2);
    }

    // Mengembalikan nilai true jika dua buah garis sejajar
    boolean isGarisSejajar(Garis G1) {
        if (G1.getGradienGaris() == this.getGradienGaris()) {
            return true;
        } else {
            return false;
        }
    }

    // Mengembalikan nilai true jika dua buah garis tegak lurus
    boolean isGarisTegakLurus(Garis G1) {
        if (G1.getGradienGaris() * this.getGradienGaris() == -1) {
            return true;
        } else {
            return false;
        }
    }

    // Menampilkan titik awal dan titik akhir dari garis
    void printGaris() {
        System.out.println("Titik Awal (" + titikAwal.getAbsis() + ", " + titikAwal.getOrdinat() + "), Titik Akhir (" + titikAkhir.getAbsis() + ", " + titikAkhir.getOrdinat() + ")");    
    }

    // Menampilkan persamaan garis dalam bentuk (y = mx + c)
    void printPersamaanGaris() {
        System.out.println("y = " + getGradienGaris() + "x" + " + " + (titikAkhir.getOrdinat() - getGradienGaris()*titikAkhir.getAbsis()));
    }
} // End Class Garis