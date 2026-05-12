package GenerikLarik;
/* Nama file    : MPiaraan.java
 * Deskripsi    : berisi pemanggilan Main
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 11 Mei 2026
 */

public class MPiaraan {
    /* *******************MAIN PROGRAM******************* */
    public static void main(String[] args) {
        // Proses Instansiasi dan Pemanggilan Method
        Piaraan piaraan = new Piaraan();
        KembangTelon kembangTelon1 = new KembangTelon("Kurama", "Kura", 3.2);
        Anggora anggora1 = new Anggora("Pidin", "Pid", 4.5);
        Anjing anjing1 = new Anjing("Umar", "Umiy");
        Burung burung1 = new Burung("Kicau", "Cau");

        // Memasukkan Anabul ke dalam Piaraan
        piaraan.enqueueAnabul(anjing1);
        piaraan.enqueueAnabul(anggora1);
        piaraan.enqueueAnabul(kembangTelon1);
        piaraan.enqueueAnabul(burung1);

        // Menampilkan Anabul yang berada di depan antrian
        System.out.println("============== Menampilkan Anabul yang ada di depan ==============");
        System.out.println("Anabul yang berada di depan antrian: " + piaraan.getAnabul().getNama());

        // Menampilkan Anabul yang ada di Piaraan
        System.out.println("\n============== Menampilkan Anabul yang ada di Piaraan ==============");
        piaraan.showAnabul();

        // Menampilkan jenis Anabul yang ada di Piaraan
        System.out.println("\n============== Menampilkan Jenis Anabul dalam Piaraan ==============");
        piaraan.showJenisAnabul();

        // Menampilkan jumlah kucing yang ada di Piaraan
        System.out.println("\n============== Menampilkan jumlah kucing ==============");
        System.out.println("Jumlah kucing yang ada di Piaraan: " + piaraan.countKucing());

        // Menampilkan bobot total kucing yang ada di Piaraan
        System.out.println("\n============== Menampilkan bobot total kucing ==============");
        System.out.println("Bobot total kucing yang ada di Piaraan: " + piaraan.bobotKucing());

        // Mengeluarkan Anabul dari Piaraan
        System.out.println("\n============== Mengeluarkan Anabul dari Piaraan ==============");
        piaraan.dequeueAnabul();
        System.out.println("Anabul yang tersisa di Piaraan:");
        piaraan.showAnabul();

        // Menampilkan apakah anjing1 masih menjadi member Piaraan
        System.out.println("\nApakah " + anjing1.getNama() + " masih menjadi member Piaraan? " + piaraan.isMember(anjing1));
    }
}