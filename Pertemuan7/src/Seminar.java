/* Nama File : Seminar.java 
 * Deskripsi : Kelas pengelola data dan array peserta seminar dari kalangan CivitasAkademika
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 24/04/2026  
 */

public class Seminar {
    private CivitasAkademika[] Peserta;
    private int BanyakPeserta;

    public Seminar() {
        this.Peserta = new CivitasAkademika[100];
        this.BanyakPeserta = 0;
    }

    public int countPeserta() {
        return this.BanyakPeserta;
    }

    public void registrasi(CivitasAkademika PesertaBaru) {
        if (this.BanyakPeserta < 100) {
            this.Peserta[this.BanyakPeserta] = PesertaBaru;
            this.BanyakPeserta++;
        }
        else {
            System.out.println("Wis kebak");
        }
    }

    public void tampilPeserta() {
        System.out.println("\nDaftar Peserta Seminar");
        for (int i = 0; i < this.BanyakPeserta; i++) {
            System.out.println((i + 1) + ". " + Peserta[i].getNomor() + " - " + Peserta[i].getNama());
        }
    }

    public int countMahasiswa() {
        int jumlahMhs = 0;
        for (int i = 0; i < this.BanyakPeserta; i++) {
            if (Peserta[i] instanceof Mahasiswa2) {
                jumlahMhs++;
            }
        }
        return jumlahMhs;
    }
}