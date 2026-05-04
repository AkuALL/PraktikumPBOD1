package GenerikLarik;
/* Nama file    : Main.java
 * Deskripsi    : berisi pemanggilan Main
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 03 Mei 2026
 */

public class Main {
    /* *******************MAIN PROGRAM******************* */
    public static void main(String[] args) {
        Data<Anabul> data = new Data<>();

        data.setIsi(0, new Kucing("Mochi", 6.3));
        data.setIsi(1, new Anjing("Melky"));
        data.setIsi(2, new Burung("KicauMania"));

        System.out.println("Jumlah elemen:");
        System.out.println(data.getSize());
        System.out.println();

        System.out.println("Isi index 0:");
        data.getIsi(0).Gerak();
        System.out.println();

        System.out.println("Isi index 1:");
        data.getIsi(1).Bersuara();
        System.out.println();

        System.out.println("Isi index 2:");
        data.getIsi(2).Gerak();
    }
    
}
