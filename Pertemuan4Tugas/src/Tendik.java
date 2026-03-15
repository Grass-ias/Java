/* Nama File : Tendik.java 
 * Deskripsi : Driver/Main class untuk menguji class Tendik
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 10/03/2026 
 */

public class Tendik extends Pegawai {
    private String Bidang;
    private double BUP;

    public Tendik() {
        super();
        this.Bidang = "";
        this.BUP = 0.0;
    }

    public Tendik(String NIP, String Nama, String TanggalLahir, String TMT, double GajiPokok, String Bidang, double BUP) {
        super(NIP, Nama, TanggalLahir, TMT, GajiPokok);
        this.Bidang = Bidang;
        this.BUP = BUP;
    }

    public String getBidang() { 
        return Bidang; 
    }
    public void setBidang(String Bidang) { 
        this.Bidang = Bidang; 
    }

    public double getBUP() { 
        return BUP; 
    }
    public void setBUP(double BUP) { 
        this.BUP = BUP; 
    }

    public double getTunjangan() {
        return 1500000.0;
    }
}