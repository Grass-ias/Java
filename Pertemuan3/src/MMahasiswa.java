/* Nama File : MMahasiswa.java 
 * Deskripsi : Berisi atribut dan method dalam class MMahasiswa
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 03/03/2026 
 */
public class MMahasiswa {
    public static void main(String[] args) {
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        Mahasiswa M1 = new Mahasiswa("234", "Citra", "Informatika");
        Dosen1 D1 = new Dosen1("123", "Andi", "Informatika");
        Kendaraan K1 = new Kendaraan("H6767IV", "motor");
        M1.setDosenwali(D1);
        M1.setKendaraan(K1);
        M1.addMatkul(PBO);
        M1.addMatkul(MBD);
        M1.printDetailMhs();
        System.out.println("Jumlah Matakuliah :" + M1.getJumlahMatKul());
        System.err.println("Jumlah SKS        :" + M1.getJumlahSKS());
    }
}