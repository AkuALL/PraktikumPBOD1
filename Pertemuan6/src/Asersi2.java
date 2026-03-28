/**
 * File      : Asersi2.java
 * Deskripsi : Program untuk demo asersi, yang akan menolak input
 *             jari-jari lingkaran yang bernilai nol
 * Nama      : An Al Rivaldi
 * NIM       : 24060124120030
 * Tanggal   : 24 - 03 - 2026
 **/

//class Lingkaran
class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}
//class Asersi2
public class Asersi2{
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari>0):"jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = "
                +kelilingLingkaran);
    }
}

// Kesalahan terletak pada penempatan validasi jari-jari yang ada di luar kelas Lingkaran.
// Selain itu, penggunaan asersi kurang tepat untuk validasi input karena asersi dapat dinonaktif saat runtime.