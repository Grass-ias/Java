/* Nama File : DosenTetap.java 
 * Deskripsi : Class untuk entitas Dosen Tetap
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 10/03/2026 
 */

import java.time.LocalDate;
import java.time.Period;

public class DosenTetap extends Dosen {
    private String NIDN;
    private final int BUP = 65; 

    public DosenTetap() {
        super();
        this.NIDN = "";
    }

    public DosenTetap(String NIP, String Nama, LocalDate TL, LocalDate TMT, double GajiPokok, String Fakultas, String NIDN) {
        super(NIP, Nama, TL, TMT, GajiPokok, Fakultas);
        this.NIDN = NIDN;
    }

    public String getNIDN() { return NIDN; }
    public void setNIDN(String NIDN) { this.NIDN = NIDN; }

    public int getMasaKerjaTahun() {
        return Period.between(this.getTMT(), LocalDate.now()).getYears();
    }

    public int getMasaKerjaBulan() {
        return Period.between(this.getTMT(), LocalDate.now()).getMonths();
    }

    public double getTunjangan() {
        return 0.02 * getMasaKerjaTahun() * getGajiPokok();
    }

    public LocalDate getTanggalPensiun() {
        return getTanggalLahir().plusYears(BUP).plusMonths(1).withDayOfMonth(1);
    }

    @Override
    public void printInfo() {
        System.out.println("NIP             : " + this.getNIP());
        System.out.println("NIDN            : " + this.getNIDN());
        System.out.println("Nama            : " + this.getNama());
        System.out.println("Tanggal Lahir   : " + formatTanggal(this.getTanggalLahir()));
        System.out.println("TMT             : " + formatTanggal(this.getTMT()));
        System.out.println("Jabatan         : Dosen Tetap");
        System.out.println("Fakultas        : " + this.getFakultas());
        System.out.println("Masa Kerja      : " + getMasaKerjaTahun() + " tahun " + getMasaKerjaBulan() + " bulan");
        System.out.println("Tanggal Pensiun : " + formatTanggal(getTanggalPensiun()));
        System.out.println("Gaji Pokok      : " + this.getGajiPokok());
        System.out.println("Tunjangan       : 2% x " + getMasaKerjaTahun() + " x " + this.getGajiPokok() + " = " + getTunjangan());
    }
}