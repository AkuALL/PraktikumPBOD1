package Coersion;
/* Nama file    : Coersion.java
 * Deskripsi    : berisi file ilustrasi Coersion
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 25 April 2026
 */

class Coersion {
    public static void main(String[] args) {
        // ==========================================
        // a. Ilustrasi polimorfisme (Coersion/Casting)
        // ==========================================
        System.out.println("============ Jawaban A ============");
        // x bertipe integer
        int x = 65;
        // contoh Coersion yaitu casting dari int ke char
        char nilaiKarakter = (char) x; 
        //  contoh Coersion yaitu casting dari int ke double
        double nilaiReal = (double) x; 
        System.out.println("x sebagai Integer (tipe awal)   : " + x);
        System.out.println("x sebagai Karakter (int to char): " + nilaiKarakter);
        System.out.println("x sebagai Real (int to double)  : " + nilaiReal);

        // ==========================================
        // b. Mengembalikan nilai real ke integer
        // ==========================================
        System.out.println("\n============ Jawaban B ============");
        // Menggunakan nilaiReal dari poin a, dan dimasukkan ke variabel int baru
        int kembaliKeInt = (int) nilaiReal; 
        System.out.println("Nilai Real saat ini    : " + nilaiReal);
        System.out.println("Dikembalikan ke Integer: " + kembaliKeInt);

        // ===============================================
        // c. Konkatenasi dan Penjumlahan String (Integer)
        // ===============================================
        System.out.println("\n============ Jawaban C ============");
        String X = "1234";
        String Y = "5678";
        // Konkatenasi string
        String S = X + Y; 
        // Konversi String ke Integer untuk dijumlahkan secara matematis
        int Z = Integer.parseInt(X) + Integer.parseInt(Y); 
        System.out.println("String X: " + X);
        System.out.println("String Y: " + Y);
        System.out.println("String S (Konkatenasi X dan Y) : " + S);
        System.out.println("Integer Z (Penjumlahan X dan Y): " + Z);

        // ==============================================
        // d. Konkatenasi dan Penjumlahan String (Double)
        // ==============================================
        System.out.println("\n============ Jawaban D ============");
        String P = "12.34";
        String Q = "56.78";
        // Konkatenasi string
        String R = P + Q; 
        // Konversi String ke Double untuk dijumlahkan secara matematis
        double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("String P: " + P);
        System.out.println("String Q: " + Q);
        System.out.println("String R (Konkatenasi P dan Q) : " + R);
        System.out.println("Double D (Penjumlahan P dan Q) : " + D);
        
        // ==========================================
        // e. Konversi S menjadi Integer A
        // ==========================================
        System.out.println("\n============ Jawaban E ============");
        // Objek Integer A diisi hasil konversi nilai S ("12345678")
        Integer A = Integer.parseInt(S); 
        System.out.println("Nilai Objek Integer A: " + A);

        // ==========================================
        // f. Konversi A menjadi String T
        // ==========================================
        System.out.println("\n============ Jawaban F ============");
        // Objek String T diisi hasil konversi nilai A
        String T = A.toString(); 
        System.out.println("Nilai Objek String T : " + T);
    }
}
