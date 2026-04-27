package InclusionMahasiswa;
/* Nama file    : MCivitas.java
 * Deskripsi    : berisi pemanggilan Main
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 26 April 2026
 */

public class MCivitas {
    public static void main(String[] args) {
        Dosen Dosen1 = new Dosen("Dayat", "08135015");
        Dosen Dosen2 = new Dosen("Taufik", "19782123");

        Mahasiswa Mhs1 = new Mahasiswa("Zahira", "40196", Dosen1);
        Mahasiswa Mhs2 = new Mahasiswa("Rivaldi", "20030", Dosen1);
        Mahasiswa Mhs3 = new Mahasiswa("Devano", "30124", Dosen2);
        Mahasiswa Mhs4 = new Mahasiswa("Hafid", "30903", Dosen2);
        Mahasiswa Mhs5 = new Mahasiswa("Umar", "20310", Dosen2);

        Seminar Smnr1 = new Seminar();

        Smnr1.registrasi(Dosen1);
        Smnr1.registrasi(Dosen2);
        Smnr1.registrasi(Mhs1);
        Smnr1.registrasi(Mhs2);
        Smnr1.registrasi(Mhs3);
        Smnr1.registrasi(Mhs4);
        Smnr1.registrasi(Mhs5);

        System.out.println("========== Informasi terkait Mhs1 ==========");
        Mhs1.tampilDataMahasiswa();

        System.out.println("========== Informasi terkait Mhs1 setelah setWali ==========");
        Mhs1.setWali(Dosen2);
        Mhs1.tampilDataMahasiswa();

        System.out.println("======== Informasi terkait Seminar Smnr1 ========");
        System.out.println("Jumlah peserta seminar: " + Smnr1.countPeserta() + " orang");
        Smnr1.tampilPeserta();
        System.out.println("Jumlah peserta Mahasiswa: " + Smnr1.countMahasiswa() + " orang");
    }
}
