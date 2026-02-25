/* Nama file    : MTitik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 24 Februari 2026
 */
public class MTitik {
    public static void main(String[] args) {
        /***************Titik T1***************/
        System.out.println("Titik T1");
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        System.out.println("Koordinat Titik T1: ");
        T1.printTitik();
        System.out.println("Koordinat Titik T1 setelah digeser: ");
        T1.geser(3,4);
        T1.printTitik();
        System.out.println("Titik T1 berada pada kuadran: " + T1.getKuadran());
        System.out.println("Jarak ke pusat: " + T1.getJarakPusat());
        System.out.println("Koordinat Titik T1 setelah direfleksikan terhadap sumbu X: ");
        T1.refleksiX();
        T1.printTitik();
        System.out.println("Koordinat Titik T1 setelah direfleksikan terhadap sumbu Y: ");
        T1.refleksiY();
        T1.printTitik();
        
        /***************Titik T2***************/
        System.out.println("\nTitik T2");
        Titik T2 = T1;
        System.out.println("Koordinat Titik T2: ");
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        System.out.println("Koordinat Titik T2 setelah dilakukan perubahan absis dan ordinat di titik T1: ");
        T2.printTitik();

        /***************Titik T3***************/
        System.out.println("\nTitik T3"); 
        Titik T3 = new Titik();
        System.out.println("Koordinat Titik T3: ");
        T3.printTitik();

        /***************Titik T4***************/
        System.out.println("\nTitik T4");
        Titik T4 = new Titik(3,5);
        System.out.println("Koordinat Titik T4: ");
        T4.printTitik();
        System.out.println("Jarak titik T4 ke titik T1: " + T4.getJarak(T1));
        
        /***************Titik T5***************/
        System.out.println("\nTitik T5");
        System.out.println("Koordinat Titik T5 yang diperoleh dari refleksi Titik T2 terhadap sumbu X: ");
        T2.getRefleksiX().printTitik();

        /***************Titik T6***************/
        System.out.println("\nTitik T6");
        System.out.println("Koordinat Titik T6 yang diperoleh dari refleksi Titik T1 terhadap sumbu Y: ");
        T1.getRefleksiY().printTitik();


        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        // System.out.println("Jumlah Objek Titik = " + T4.getCounterTitik());
        // T1.printCounterTitik();
    }   
}
