/* Nama File : DosenTetap.java 
 * Deskripsi : Driver/Main class untuk menguji class DosenTetap
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 10/03/2026 
 */

public class DosenTetap extends Dosen {
    private String NIDN;
    private double BUP;

    public DosenTetap() {
        super();
        this.NIDN = "";
        this.BUP = 0.0;
    }

    public DosenTetap(String NIP, String Nama, String TanggalLahir, String TMT, double GajiPokok, String Fakultas, String NIDN, double BUP) {
        super(NIP, Nama, TanggalLahir, TMT, GajiPokok, Fakultas);
        this.NIDN = NIDN;
        this.BUP = BUP;
    }

    public String getNIDN() { 
        return NIDN; 
    }
    public void setNIDN(String NIDN) { 
        this.NIDN = NIDN; 
    }

    public double getBUP() { 
        return BUP; 
    }
    public void setBUP(double BUP) { 
        this.BUP = BUP; 
    }

    public double getTunjangan() {
        return 0.75 * getGajiPokok(); /* 75% dari gaji pokok */
    }
}