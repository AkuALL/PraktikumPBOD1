package KoleksiClassDasar;

import java.util.*;

/* Nama file    : Teman.java
 * Deskripsi    : berisi atribut dan method dari class Teman
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 05 Mei 2026
 */

public class Teman {
    /* *******************ATRIBUT******************* */
    private int nbelm;
    private ArrayList<String> Lnama;
    /* *******************OPERATOR******************* */
    // Konstruktor
    public Teman(){
        this.Lnama = new ArrayList<>();
        this.nbelm = 0;
    }
    
    // Mendapatkan jumlah elemen dalam daftar teman
    public int getNbelm(){
        return nbelm;
    }

    // Mendapatkan nama teman pada indeks tertentu
    public String getNama(int indeks){
        return Lnama.get(indeks);
    }

    // Mengganti nama teman pada indeks tertentu dengan nama baru
    public void setNama(int indeks, String nama){
        if (indeks >= 0 && indeks < nbelm){
            Lnama.set(indeks, nama);
        } else {
            System.out.println("Indeks tidak valid.");
        }
    }

    // Menambahkan nama teman ke dalam Lnama jika jumlah elemen belum mencapai kapasitas maksimum
    public void addNama(String nama){
        Lnama.add(nama);
        nbelm++;
        System.out.println("Teman berhasil ditambahkan");
    }

    // Menghapus nama teman dari Lnama berdasarkan nama yang diberikan
    public void delNama(String nama){
        for (int i = 0; i < nbelm; i++){
            if (Lnama.get(i).equals(nama)){
                for (int j = i; j < nbelm - 1; j++){
                    Lnama.set(j, Lnama.get(j + 1));
                }
                nbelm--;
                System.out.println("Teman berhasil dihapus");
                break;
            }
        }
    }

    // Memeriksa apakah nama teman sudah ada dalam Lnama
    public boolean isMember(String nama){
        for (int i = 0; i < nbelm; i++){
            if (Lnama.get(i).equals(nama)){
                return true;
            }
        }
        return false;
    }

    // Mengganti nama teman yang sudah ada dengan nama baru
    public void gantiNama(String nama, String namaBaru){
        for (int i = 0; i < nbelm; i++){
            if (Lnama.get(i).equals(nama)){
                Lnama.set(i, namaBaru);
                System.out.println("Nama berhasil diganti");
                break;
            }
        }
    }

    // Menghitung jumlah kemunculan nama dalam Lnama
    public int countNama(String nama){
        int count = 0;
        for (int i = 0; i < nbelm; i++){
            if (Lnama.get(i).equals(nama)){
                count++;
            }
        }
        return count;
    }

    // Menampilkan semua nama teman dalam Lnama
    public void showTeman(){
        System.out.println("Daftar Teman:");
        for (int i = 0; i < nbelm; i++){
            System.out.println((i + 1) + ". " + Lnama.get(i));
        }
    }
}