/* Nama File : MPegawai.java
 * Deskripsi : program utama untuk menguji class Pegawai, Dosen, DosenTamu, DosenTetap, Tendik
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 10/03/2026 
 */

import java.time.LocalDate;

public class MPegawai {
    public static void main(String[] args) {
        DosenTetap Dtetap = new DosenTetap("9545647548", "Andi", LocalDate.of(1990, 5, 5), LocalDate.of(2015, 1, 1), 5000000.0, "Fakultas Sains dan Matematika", "78647324");      
        DosenTamu Dtamu = new DosenTamu("D001", "Ir. Soekarno", LocalDate.of(1981, 6, 6), LocalDate.of(2025, 8, 10), 16000000.0, "Informatika", "NIDK123", LocalDate.of(2027, 12, 31));
        Tendik Tendik = new Tendik("T001", "Mas Gibran", LocalDate.of(1985, 10, 1), LocalDate.of(2019, 5, 10), 9000000.0, "Akademik");

        Dtetap.printInfo();
        System.err.println("\n\n");
        
        Dtamu.printInfo();
        System.err.println("\n\n");

        Tendik.printInfo();
    }
}