/* Nama File : Mahasiswa2.java 
 * Deskripsi : Berisi atribut dan method dalam class Mahasiswa2 turunan CivitasAkademika
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 24/04/2026  
 */

public class Mahasiswa2 extends CivitasAkademika {
    private String NIM;
    private Dosen2 dosenWali;

    public Mahasiswa2(String NIM, String nama) {
        this.NIM = NIM;
        super.setNama(nama);
    }

    @Override
    public String getNomor() {
        return this.NIM;
    }

    public void setWali(Dosen2 Dosen) {
        this.dosenWali = Dosen;
    }

    public void tampilDataMahasiswa2() {
        System.out.println("NIM        : " + this.NIM);
        System.out.println("Nama       : " + super.getNama());
        System.out.println("Dosen Wali : " + this.dosenWali.getNama());
    }
}