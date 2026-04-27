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
    // Konstruktor seminar
    public Seminar() {
        pesertas = new Civitasakademika[100];
        banyakpeserta = 0;
    }

    // Method menambahkan peserta ke dalam list pesertas
    public void registrasi(Civitasakademika c) {
        if (banyakpeserta < 100) {
            pesertas[banyakpeserta] = c;
            banyakpeserta++;
        }
        else {
            System.out.println("Peserta penuh");
        }
    }

    // Selektor banyakpeserta
    public int countPeserta() {
        return banyakpeserta;
    }

    // Menampilkan daftar NIM/NIP dan nama peserta 
    public void tampilPeserta() {
        // Kamus
        int i;
        // Algoritma
        System.out.println("Daftar Peserta:");
        for (i = 0; i < banyakpeserta; i++) {
            System.out.println(
                "> " + pesertas[i].getNomor() + " - " + pesertas[i].getNama()
            );
        }
    }

    // Menampilkan banyaknya peserta yang merupakan Mahasiswa
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
