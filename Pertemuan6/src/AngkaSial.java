/**
 * File      : AngkaSial.java
 * Deskripsi : Program penggunaan exception buatan sendiri
 *             Pengenalan klausa 'throw' dan 'throws'
 * Nama      : An Al Rivaldi
 * NIM       : 24060124120030
 * Tanggal   : 24 - 03 - 2026
 **/

public class AngkaSial{
    
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13) {
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

// Tidak. Karena ketika angka == 13, throw pada baris 10 langsung berhenti eksekusi dan melempar exception sebelum program sempat mencapai baris 12.
// Ya. Baris 21 adalah blok catch yang berfungsi menangkap exception yang dilempar. Program akan langsung mengeksekusi ke baris ini untuk menangani kesalahan agar tidak crash.