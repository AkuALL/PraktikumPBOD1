/**
 * File      : AngkaSialException.java
 * Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13!
 * Nama      : An Al Rivaldi
 * NIM       : 24060124120030
 * Tanggal   : 24 - 03 - 2026
**/

public class AngkaSialException extends Exception{
    public AngkaSialException() {
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}