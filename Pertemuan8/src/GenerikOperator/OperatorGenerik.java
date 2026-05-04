package GenerikOperator;
/* Nama file    : OperatorGenerik.java
 * Deskripsi    : berisi method dan atribut class OperatorGenerik
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 03 Mei 2026
 */

public class OperatorGenerik {
    /* *******************ATRIBUT******************* */

    /* *******************METHOD******************* */
    // prosedur Tukar
    public static <G> void Tukar(Datum<G> a, Datum<G> b) {
        G temp = a.isi;
        a.isi = b.isi;
        b.isi = temp;
    }

    // fungsi generik Bobot2
    public static <T extends Kucing> double Bobot2(T a, T b) {
        return a.getBobot() + b.getBobot();
    }
}