/**
 * File      : Asersi1.java
 * Deskripsi : Program untuk menunjukkan asersi
 * Nama      : An Al Rivaldi
 * NIM       : 24060124120030
 * Tanggal   : 24 - 03 - 2026
**/

public class Asersi1{
    public static void main(String[] args) {
        int x=-5;
        if(x>0){
            System.out.println("x bilangan positif");
        }else{
            assert(x<0):"ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}