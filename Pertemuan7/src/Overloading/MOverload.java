package Overloading;
/* Nama file    : MOverload.java
 * Deskripsi    : berisi pemanggilan main class Mahasiswa
 * Pembuat      : 24060124120030 - An Al Rivaldi
 * Tanggal      : 25 April 2026
 */

class MOverload {
    public static void main(String[] args) {
        Mahasiswa M1 = new Mahasiswa();
        Mahasiswa M2 = new Mahasiswa("24060124120030", "An Al Rivaldi", "Informatika");
        Mahasiswa M3 = new Mahasiswa(M2);

        System.out.println("======== Detail informasi Mahasiswa M1 ========");
        M1.printInfo();
        System.out.println("======== Detail informasi Mahasiswa M2 ========");
        M2.printInfo();
        System.out.println("======== Detail informasi Mahasiswa M3 ========");
        M3.printInfo();

        System.out.println("======== Detail informasi M2 setelah setProgramStudi Tipe 1 ========");
        M2.setProgramStudi();
        M2.printInfo();

        System.out.println("======== Detail informasi M3 setelah setProgramStudi Tipe 2 ========");
        M3.setProgramStudi("Teknik Sipil");
        M3.printInfo();

        System.out.println("======== Detail informasi M1 setelah setProgramStudi Tipe 3 ========");
        M1.setProgramStudi(M3);
        M1.printInfo();

        System.out.println("======== Detail informasi M1 setelah setNama dan setNIM ========");
        M1.setNIM("240601241");
        M1.setNama("Wawan Kurniawan");
        M1.printInfo();
    }
}
