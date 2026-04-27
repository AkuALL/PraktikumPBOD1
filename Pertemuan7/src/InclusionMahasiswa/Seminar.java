package InclusionMahasiswa;
/* Nama File    : Seminar.java
 * Deskripsi    : berisi atribut dan method dari class Seminar
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 26 April 2026
 */

public class Seminar {
    /* *******************ATRIBUT******************* */
    private Civitasakademika[] pesertas;
    private int banyakpeserta;
    
    /* *******************METHOD******************* */
    public Seminar() {
        pesertas = new Civitasakademika[100];
        banyakpeserta = 0;
    }

    public void registrasi(Civitasakademika c) {
        if (banyakpeserta < 100) {
            pesertas[banyakpeserta] = c;
            banyakpeserta++;
        }
        else {
            System.out.println("Peserta penuh");
        }
    }

    public int countPeserta() {
        return banyakpeserta;
    }

    public void tampilPeserta() {
        // Kamus
        int i;
        // Algoritma
        System.out.println("Daftar Peserta:");
        for (i = 0; i < banyakpeserta; i++) {
            System.out.println(
                i+1 + pesertas[i].getNomor() + " - " + pesertas[i].getNama()
            );
        }
    }

    public int countMahasiswa() {
        // Kamus
        int count, i;
        // Algoritma
        count = 0;
        for (i = 0; i < banyakpeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa) {
                count++;
            }
        }
        return count;
    }
}
