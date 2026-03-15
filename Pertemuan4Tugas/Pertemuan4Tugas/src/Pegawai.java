/* Nama File : Pegawai.java 
 * Deskripsi : Driver/Main class untuk menguji class Pegawai
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 10/03/2026 
 */

public class Pegawai {
    private String NIP;
    private String Nama;
    private String TL;
    private String TMT;
    private double GajiPokok;

    public Pegawai() {
        this("", "", "", "", 0.0);
    }

    public Pegawai(String NIP, String Nama, String TL, String TMT, double GajiPokok) {
        this.NIP = NIP;
        this.Nama = Nama;
        this.TL = TL;
        this.TMT = TMT;
        this.GajiPokok = GajiPokok;
    }

    // Getter & Setter
    public String getNIP() { 
        return NIP; 
    }
    public void setNIP(String NIP) { 
        this.NIP = NIP; 
    }

    public String getNama() { 
        return Nama; 
    }
    public void setNama(String Nama) { 
        this.Nama = Nama; 
    }

    public String getTanggalLahir() { 
        return TL; 
    }

    public void setTanggalLahir(String TL) { 
        this.TL = TL; 
    }

    public String getTMT() { 
        return TMT; 
    }
    public void setTMT(String TMT) { 
        this.TMT = TMT; 
    }

    public double getGajiPokok() { 
        return GajiPokok; 
    }
    public void setGajiPokok(double GajiPokok) { 
        this.GajiPokok = GajiPokok; 
    }

    public void printLaporan() {
        System.out.println("Laporan Pegawai: " + Nama + " (" + NIP + ")");
    }
}