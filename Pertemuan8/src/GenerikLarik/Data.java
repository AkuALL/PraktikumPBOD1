package GenerikLarik;
/* Nama file    : Data.java
 * Deskripsi    : berisi method dan atribut class Data
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 03 Mei 2026
 */

public class Data <T> {
    /* *******************ATRIBUT******************* */
    private T[] ruang;
    private int banyak;
    
    /* *******************METHOD******************* */
    // Konstruktor
    public Data() {
        ruang = (T[]) new Object[100];
        banyak = 0;
    }

    // Selektor
    public T getIsi(int posisi) {
        if (posisi >= 0  && posisi < banyak) {
            return ruang[posisi];
        }
        return null;
    }

    public int getSize() {
        return this.banyak;
    }

    // Mutator
    public void setIsi(int posisi, T objek) {
        if (posisi >= 0 && posisi < 100) {
            ruang[posisi] = objek;
            if (posisi >= banyak) {
                banyak = posisi+1;
            }
        }
    }
}