/* Nama file    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 24 Februari 2026
 */

public class Titik {
    /**************** METHOD ****************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /**************** METHOD ****************/
    // Konstruktor untuk membuat dengan nilai absis dan ordinat tertentu
    Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    // Konstruktor untuk membuat titik (0, 0)
    Titik() {
        this(0, 0);
    }

    // Mengembalikan nilai counterTitik
    static int getCounterTitik() {
        return counterTitik;
    }

    // Mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    // Mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    // Mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    // Mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }

    // Menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    int getKuadran() {
        if (this.absis > 0 && this.ordinat > 0) {
            return 1;
        } else if (this.absis < 0 && this.ordinat > 0) {
            return 2;
        } else if (this.absis < 0 && this.ordinat < 0) {
            return 3;
        } else {
            return 4;
        }
    }

    // Menghitung jarak titik terhadap titik (0, 0)
    double getJarakPusat() {
        return (double) Math.sqrt((this.absis * this.absis) + (this.ordinat * this.ordinat));
    }

    // Menghitung jarak titik T2 terhadap titik
    double getJarak(Titik T2){
        return (float) Math.sqrt((T2.getAbsis()-this.absis)*(T2.getAbsis()-this.absis) - (T2.getOrdinat()-this.ordinat)*(T2.getOrdinat()-this.ordinat));
    }

    // Melakukan refleksi terhadap sumbu X
    void refleksiX() {
        this.ordinat = this.ordinat * (-1);
    }

    // Melakukan refleksi terhadap sumbu Y
    void refleksiY() {
        this.absis = this.absis * (-1);
    }

    // Menghasilkan sebuah titik baru yang merupakan hasil refleksi sumbu X dari sebuah objek titik
    Titik getRefleksiX() {
        Titik T1 = new Titik();
        T1.ordinat = T1.getOrdinat() * (-1);
        return T1;
    }

    // Menghasilkan sebuah titik baru yang merupakan hasil refleksi sumbu Y dari sebuah objek titik
    Titik getRefleksiY() {
        Titik T1 = new Titik();
        T1.absis = T1.getAbsis() * (-1);
        return T1;
    }

    // Mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }

    // // Mencetak nilai counterTitik
    // void printCounterTitik() {
    //     System.out.println(this.counterTitik);
    // }
} // end of class Titik
