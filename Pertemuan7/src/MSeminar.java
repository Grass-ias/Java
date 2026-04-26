/* Nama File : MSeminar.java 
 * Deskripsi : Program utama untuk menguji kelas Seminar beserta peserta
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 24/04/2026  
 */

public class MSeminar {
    public static void main(String[] args) {
        Seminar S = new Seminar();

        Dosen2 D1 = new Dosen2("19800101", "Dr. Zomboss");
        Dosen2 D2 = new Dosen2("19820202", "Prof. Dr. Drs. PhD. M.Sc.");

        Mahasiswa2 M1 = new Mahasiswa2("240601001", "Si A");
        Mahasiswa2 M2 = new Mahasiswa2("240601002", "Si B");
        Mahasiswa2 M3 = new Mahasiswa2("240601003", "Si C");
        Mahasiswa2 M4 = new Mahasiswa2("240601004", "Si D");
        Mahasiswa2 M5 = new Mahasiswa2("240601005", "Si E");
        
        S.registrasi(D1);
        S.registrasi(M1);
        S.registrasi(M2);
        S.registrasi(D2);
        S.registrasi(M3);
        S.registrasi(M4);
        S.registrasi(M5);

        System.out.println("\nTotal Peserta Seminar Terdaftar : " + S.countPeserta() + " orang.");

        S.tampilPeserta();

        System.out.println("\nJumlah Peserta dari kalangan Mahasiswa : " + S.countMahasiswa() + " orang.\n");

        M1.setWali(D1);
        M2.setWali(D2);

        M1.tampilDataMahasiswa2();
        System.out.println("\n");
        M2.tampilDataMahasiswa2();
    }
}

