/* Nama File : Dosen.java 
 * Deskripsi : Class abstract Dosen turunan dari Pegawai
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 10/03/2026 
 */

import java.time.LocalDate;

public abstract class Dosen extends Pegawai {
    protected String Fakultas;

    public Dosen() {
        super();
        this.Fakultas = "";
    }

    public Dosen(String NIP, String Nama, LocalDate TL, LocalDate TMT, double GajiPokok, String Fakultas) {
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