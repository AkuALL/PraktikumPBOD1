/* Nama file    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 25 Februari 2026
 */

public class Garis {
    /**************** ATRIBUT ****************/
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    /**************** METHOD ****************/
    // Konstruktor untuk membuat garis dengan Titik X dan Titik Y tertentu
    public Garis(Titik X, Titik Y) {
        this.titikAwal = X;
        this.titikAkhir = Y;
        counterGaris++;
    }

    // Konstruktor untuk membuat garis dengan Titik X(0,0) dan Titik Y(1,1)
    public Garis() {
        titikAwal = new Titik();
        titikAkhir = new Titik(1,1);
        counterGaris++;
    }

    // Mengembalikan Titik Awal dari garis
    public Titik getTitikAwal() {
        return titikAwal;
    }

    // Mengembalikan Titik Akhir dari garis
    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    // Mengembalikan nilai counterGaris
    public static int getCounterGaris() {
        return counterGaris;
    }

    // Mengeset Titik Awal garis dengan nilai baru X
    public void setTitikAwal(Titik X) {
        titikAwal = X;
    }

    // Mengeset Titik Akhir garis dengan nilai baru Y
    public void setTitikAkhir(Titik Y) {
        titikAkhir = Y;
    }

    // Mengembalikan nilai dari panjang sebuah garis
    public double getPanjangGaris() {
        return Math.sqrt(Math.pow(titikAkhir.getAbsis() - titikAwal.getAbsis(), 2) + Math.pow(titikAkhir.getOrdinat() - titikAwal.getOrdinat(), 2));
    }

    // Mengembalikan nilai dari gradien sebuah garis
    public double getGradienGaris() {
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    // Mengembalikan koordinat titik tengah dari sebuah garis
    public Titik getMidPointGaris() {
        return new Titik((titikAkhir.getAbsis() + titikAwal.getAbsis())/2, (titikAkhir.getOrdinat()+titikAwal.getOrdinat())/2);
    }

    // Mengembalikan nilai true jika dua buah garis sejajar
    public boolean isGarisSejajar(Garis G1) {
        if (G1.getGradienGaris() == this.getGradienGaris()) {
            return true;
        } else {
            return false;
        }
    }

    // Mengembalikan nilai true jika dua buah garis tegak lurus
    public boolean isGarisTegakLurus(Garis G1) {
        if (G1.getGradienGaris() * this.getGradienGaris() == -1) {
            return true;
        } else {
            return false;
        }
    }

    // Menampilkan titik awal dan titik akhir dari garis
    public void printGaris() {
        System.out.println("Titik Awal (" + titikAwal.getAbsis() + ", " + titikAwal.getOrdinat() + "), Titik Akhir (" + titikAkhir.getAbsis() + ", " + titikAkhir.getOrdinat() + ")");    
    }

    // Menampilkan persamaan garis dalam bentuk (y = mx + c)
    public void printPersamaanGaris() {
        System.out.println("y = " + getGradienGaris() + "x" + " + " + (titikAkhir.getOrdinat() - getGradienGaris()*titikAkhir.getAbsis()));
    }
} // End Class Garis