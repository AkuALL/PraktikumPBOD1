/**
 * File      : ExceptionOnArray.java
 * Deskripsi : Program penggunaan eksepsi menggunakan class library Java
 * Nama      : An Al Rivaldi
 * NIM       : 24060124120030
 * Tanggal   : 24 - 03 - 2026 
**/

public class ExceptionOnArray{
    public static void main(String[] args) {
        //instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        }catch(ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }finally{
            System.out.println("clean up code...");
        }
    }
}