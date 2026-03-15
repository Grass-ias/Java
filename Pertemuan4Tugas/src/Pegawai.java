/* Nama File : Pegawai.java 
 * Deskripsi : Base abstract class untuk entitas Pegawai
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 10/03/2026 
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public abstract class Pegawai {
    protected String NIP;
    protected String Nama;
    protected LocalDate TL;
    protected LocalDate TMT;
    protected double GajiPokok;

    public Pegawai() {
    }

    public Pegawai(String NIP, String Nama, LocalDate TL, LocalDate TMT, double GajiPokok) {
        this.NIP = NIP;
        this.Nama = Nama;
        this.TL = TL;
        this.TMT = TMT;
        this.GajiPokok = GajiPokok;
    }

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

    public LocalDate getTanggalLahir() { 
        return TL; 
    }

    public void setTanggalLahir(LocalDate TL) { 
        this.TL = TL; 
    }

    public LocalDate getTMT() { 
        return TMT; 
    }

    public void setTMT(LocalDate TMT) { 
        this.TMT = TMT; 
    }

    public double getGajiPokok() { 
        return GajiPokok; 
    }

    public void setGajiPokok(double GajiPokok) { 
        this.GajiPokok = GajiPokok; 
    }

    protected String formatTanggal(LocalDate date) {
        if (date == null) return "-";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        return date.format(formatter);
    }

    public abstract void printInfo();
}