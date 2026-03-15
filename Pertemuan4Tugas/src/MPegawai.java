/* Nama File : MPegawai.java
 * Deskripsi : program utama untuk menguji class Pegawai, Dosen, DosenTamu, DosenTetap, Tendik
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 10/03/2026 
 */

public class MPegawai {
    public static void main(String[] args) {
        DosenTamu dtamu = new DosenTamu("D001", "Ir. Soekarno", "06-06-1981", "08-10-2025", 16000000.0, "Informatika", "NIDK123");
        DosenTetap dtetap = new DosenTetap("D002", "Pak Prabowo", "17-10-1971", "11-03-2022", 17000000.0, "Teknik", "NIDN456", 3500000.0);
        Tendik tendik = new Tendik("T001", "Mas Gibran", "01-10-1985", "10-05-2019", 9000000.0, "Bisnis", 2000000.0);

        System.out.println("Dosen Tamu");
        dtamu.printLaporan();
        System.out.println("NIP         : " + dtamu.getNIP());
        System.out.println("Nama        : " + dtamu.getNama());
        System.out.println("Fakultas    : " + dtamu.getFakultas());
        System.out.println("Gaji Pokok  : " + dtamu.getGajiPokok());
        System.out.println("Tunjangan   : " + dtamu.getTunjangan());
        System.out.println("Total Gaji  : " + (dtamu.getGajiPokok() + dtamu.getTunjangan()));
        System.out.println();

        System.out.println("Dosen Tetap");
        dtetap.printLaporan();
        System.out.println("NIP         : " + dtetap.getNIP());
        System.out.println("Nama        : " + dtetap.getNama());
        System.out.println("Fakultas    : " + dtetap.getFakultas());
        System.out.println("Gaji Pokok  : " + dtetap.getGajiPokok());
        System.out.println("BUP         : " + dtetap.getBUP());
        System.out.println("Tunjangan   : " + dtetap.getTunjangan());
        System.out.println("Total Gaji  : " + (dtetap.getGajiPokok() + dtetap.getTunjangan()));
        System.out.println();

        System.out.println("Tenaga Pendidikan");
        tendik.printLaporan();
        System.out.println("NIP         : " + tendik.getNIP());
        System.out.println("Nama        : " + tendik.getNama());
        System.out.println("Bidang      : " + tendik.getBidang());
        System.out.println("Gaji Pokok  : " + tendik.getGajiPokok());
        System.out.println("Tunjangan   : " + tendik.getTunjangan());
        System.out.println("Total Gaji  : " + (tendik.getGajiPokok() + tendik.getTunjangan()));
    }
}