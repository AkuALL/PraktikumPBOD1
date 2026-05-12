package GenerikLarik;

import java.util.LinkedList;
import java.util.Queue;
/* Nama file    : Main.java
 * Deskripsi    : berisi pemanggilan Main
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 11 Mei 2026
 */

public class Piaraan {
    /* *******************ATRIBUT******************* */
    private Queue<Anabul> Lanabul;
    private int nbelm;
    
    /* *******************METHOD******************* */
    // Konstruktor
    public Piaraan() {
        Lanabul = new LinkedList<>();
        nbelm = 0;
    }

    //Selektor nbelm
    public int getNbelm() {
        return nbelm;
    }

    // Menambah elemen akhir antrian
    public void enqueueAnabul(Anabul a) {
        Lanabul.add(a);
        nbelm++;
    }

    // Mengecek apakah anabul sudah ada dalam antrian
    public boolean isMember(Anabul a) {
        return Lanabul.contains(a);
    }

    // Mengambil elemen depan antrian tanpa menghapusnya
    public Anabul getAnabul() {
        return Lanabul.peek();
    }

    // Mengambil elemen depan antrian dan menghapusnya
    public Anabul dequeueAnabul() {
        if (!Lanabul.isEmpty()) {
            nbelm--;
            return Lanabul.poll();
        }
        return null;
    }

    // Menampilkan semua anabul dalam antrian
    public void showAnabul() {
        for (Anabul a : Lanabul) {
            System.out.println(a.getNama());
        }
    }

    // Menghitung jumlah kucing dalam antrian
    public int countKucing() {
        // Kamus Lokal
        int count;
        // Algoritma
        count = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    // Menghitung bobot total kucing dalam antrian
    public double bobotKucing() {
        // Kamus Lokal
        double total;
        // Algoritma
        total = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                total += ((Kucing) a).getBobot();
            }
        }
        return total;
    }

    // Menampilkan jenis anabul dalam antrian
    public void showJenisAnabul() {
        for (Anabul a : Lanabul) {
            System.out.println(
                a.getNama() + " adalah " +
                a.getClass().getName()
            );
        }
    }
}
