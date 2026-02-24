/* Nama file    : MTitik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik.
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 24 Februari 2026
 */
public class MTitik {
    public static void main(String[] args) {
        /***************Titik T1***************/
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3,4);
        T1.printTitik();
        System.out.println("Jarak ke pusat: " + T1.getJarakPusat());
        T1.refleksiX();
        T1.refleksiY();
        T1.printTitik();
        
        /***************Titik T2***************/
        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        /***************Titik T3***************/
        Titik T3 = new Titik();
        T3.printTitik();

        /***************Titik T4***************/
        Titik T4 = new Titik(3,5);
        T4.printTitik();
        System.out.println("Jarak titik T1 ke titik T4: " + T1.getJarak(T4));
                

        // T1.printCounterTitik();

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        // System.out.println("Jumlah Objek Titik = " + T4.getCounterTitik());
    }   
}
