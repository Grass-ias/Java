/* Nama File : DosenTetap.java 
 * Deskripsi : Driver/Main class untuk menguji class DosenTetap
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 10/03/2026 
 */

public class Dosen extends Pegawai {
    private String Fakultas;

    public Dosen() {
        super();
        this.Fakultas = "";
    }

    public Dosen(String NIP, String Nama, String TL, String TMT, double GajiPokok, String Fakultas) {
        super(NIP, Nama, TL, TMT, GajiPokok);
        this.Fakultas = Fakultas;
    }

    public String getFakultas() { 
        return Fakultas; 
    }
    public void setFakultas(String Fakultas) { 
        this.Fakultas = Fakultas; 
    }
}