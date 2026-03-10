/* Nama File : Pegawai.java 
 * Deskripsi : Driver/Main class untuk menguji class Pegawai
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 10/03/2026 
 */

import java.time.LocalDate;

public class Pegawai {
    private String NIP;
    private String Nama;
    private LocalDate TL;
    private double Gaji;

    public Pegawai (String NIP, String Nama, LocalDate TL, double Gaji) {
        this.NIP = NIP;
        this.Nama = Nama;
        this.TL = TL;
        this.Gaji = Gaji;
    }

    public String getNIP () {
        return NIP;
    }

    public String getNama () {
        return Nama;
    }

    public LocalDate getTL () {
        return TL;
    }
    
    public double getGaji () {
        return Gaji;
    }

    public void setNIP (String NIP) {
        this.NIP = NIP;
    }

    public void setNama (String Nama) {
        this.Nama = Nama;
    }

    public void setTL (LocalDate TL) {
        this.TL = TL;
    }

    public void setGaji (double Gaji) {
        this.Gaji = Gaji;
    }

    public void printInfo () {
        System.out.println ("NIP           : " + NIP);
        System.out.println ("Nama          : " + Nama);
        System.out.println ("Tanggal Lahir : " + TL);
        System.out.println ("Gaji          : " + Gaji);
    }
}


