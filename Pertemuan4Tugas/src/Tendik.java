/* Nama File : Tendik.java 
 * Deskripsi : Class untuk entitas Tenaga Kependidikan
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 10/03/2026 
 */

import java.time.LocalDate;
import java.time.Period;

public class Tendik extends Pegawai {
    private String Bidang;
    private final int BUP = 55;

    public Tendik() {
        super();
        this.Bidang = "";
    }

    public Tendik(String NIP, String Nama, LocalDate TL, LocalDate TMT, double GajiPokok, String Bidang) {
        super(NIP, Nama, TL, TMT, GajiPokok);
        this.Bidang = Bidang;
    }

    public String getBidang() { return Bidang; }
    public void setBidang(String Bidang) { this.Bidang = Bidang; }

    public int getMasaKerjaTahun() {
        return Period.between(this.getTMT(), LocalDate.now()).getYears();
    }

    public int getMasaKerjaBulan() {
        return Period.between(this.getTMT(), LocalDate.now()).getMonths();
    }

    public double getTunjangan() {
        return 0.01 * getMasaKerjaTahun() * getGajiPokok();
    }

    public LocalDate getTanggalPensiun() {
        return getTanggalLahir().plusYears(BUP).plusMonths(1).withDayOfMonth(1);
    }

    @Override
    public void printInfo() {
        System.out.println("NIP             : " + getNIP());
        System.out.println("Nama            : " + getNama());
        System.out.println("Tanggal Lahir   : " + formatTanggal(getTanggalLahir()));
        System.out.println("TMT             : " + formatTanggal(getTMT()));
        System.out.println("Jabatan         : Tenaga Kependidikan");
        System.out.println("Bidang          : " + getBidang());
        System.out.println("Masa Kerja      : " + getMasaKerjaTahun() + " tahun " + getMasaKerjaBulan() + " bulan");
        System.out.println("Tanggal Pensiun : " + formatTanggal(getTanggalPensiun()));
        System.out.println("Gaji Pokok      : " + getGajiPokok());
        System.out.println("Tunjangan       : " + getTunjangan());
    }
}