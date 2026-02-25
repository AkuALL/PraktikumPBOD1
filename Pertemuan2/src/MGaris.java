/* Nama file    : MGaris.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 25 Februari 2026
 */

public class MGaris {
    public static void main(String[] args) {
        /***************Inisialisasi Titik***************/
        Titik T0 = new Titik(0, 1);
        Titik T1 = new Titik(3, 4);
        Titik T2 = new Titik(-5, -2);
        Titik T3 = new Titik(-1, 2);
        Titik T4 = new Titik(2,5);
        Titik T5 = new Titik(5,2);

        /***************Garis G1***************/
        System.out.println("Garis G1");
        Garis G1 = new Garis();
        G1.printGaris();
        System.out.println("Garis G1 setelah titik awal diubah dengan T0:");
        G1.setTitikAwal(T0);
        G1.printGaris();
        System.out.println("Garis G1 setelah titik akhir diubah dengan T1:");
        G1.setTitikAkhir(T1);
        G1.printGaris();
        System.out.println("Panjang dari garis G1 adalah: " + G1.getPanjangGaris());
        System.out.println("Gradien dari garis G1 adalah: " + G1.getGradienGaris());
        System.out.println("Midpoint dari garis G1 adalah: Absis (" + G1.getMidPointGaris().getAbsis() +"), Ordinat (" + G1.getMidPointGaris().getOrdinat()+")");
        G1.printPersamaanGaris();

        /***************Garis G2***************/
        System.out.println("\nGaris G2");
        Garis G2 = new Garis(T2, T3);
        G2.printGaris();
        System.out.println("Panjang dari garis G2 adalah: " + G2.getPanjangGaris());
        System.out.println("Gradien dari garis G2 adalah: " + G2.getGradienGaris());
        System.out.println("Midpoint dari garis G2 adalah: Absis (" + G2.getMidPointGaris().getAbsis() +"), Ordinat (" + G2.getMidPointGaris().getOrdinat()+")");
        System.out.println("Apakah Garis G2 dan G1 sejajar? " + G2.isGarisSejajar(G1));
        System.out.println("Apakah Garis G2 dan G1 tegak lurus? " + G2.isGarisTegakLurus(G1));
        G2.printPersamaanGaris();

        /***************Garis G3***************/
        System.out.println("\nGaris G3");
        Garis G3 = new Garis(T4, T5);
        G3.printGaris();
        System.out.println("Panjang dari garis G3 adalah: " + G3.getPanjangGaris());
        System.out.println("Gradien dari garis G3 adalah: " + G3.getGradienGaris());
        System.out.println("Midpoint dari garis G3 adalah: Absis (" + G3.getMidPointGaris().getAbsis() +"), Ordinat (" + G3.getMidPointGaris().getOrdinat()+")");
        System.out.println("Apakah Garis G3 dan G1 sejajar? " + G3.isGarisSejajar(G1));
        System.out.println("Apakah Garis G3 dan G1 tegak lurus? " + G3.isGarisTegakLurus(G1));
        G3.printPersamaanGaris();

        System.out.println("\nJumlah garis yang dibuat: " + Garis.getCounterGaris());
    }
}