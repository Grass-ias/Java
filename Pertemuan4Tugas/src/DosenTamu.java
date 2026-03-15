/* Nama File : DosenTamu.java 
 * Deskripsi : Driver/Main class untuk menguji class DosenTamu
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 10/03/2026 
 */

public class DosenTamu extends Dosen {
    private String NIDK;

    public DosenTamu() {
        super();
        this.NIDK = "";
    }

    public DosenTamu(String NIP, String Nama, String TL, String TMT, double GajiPokok, String Fakultas, String NIDK) {
        super(NIP, Nama, TL, TMT, GajiPokok, Fakultas);
        this.NIDK = NIDK;
    }

    public String getNIDK() { 
        return NIDK; 
    }
    public void setNIDK(String NIDK) { 
        this.NIDK = NIDK; 
    }

    public double getTunjangan() {
        return 0.15 * getGajiPokok();
    }
}