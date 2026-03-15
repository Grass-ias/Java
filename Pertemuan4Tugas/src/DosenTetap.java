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
        return Period.between(this.TMT, LocalDate.now()).getYears();
    }

    public int getMasaKerjaBulan() {
        return Period.between(this.TMT, LocalDate.now()).getMonths();
    }

    public double getTunjangan() {
        return 0.02 * getMasaKerjaTahun() * GajiPokok;
    }

    public LocalDate getTanggalPensiun() {
        return TL.plusYears(BUP).plusMonths(1).withDayOfMonth(1);
    }

    @Override
    public void printInfo() {
        System.out.println("NIP             : " + NIP);
        System.out.println("NIDN            : " + NIDN);
        System.out.println("Nama            : " + Nama);
        System.out.println("Tanggal Lahir   : " + formatTanggal(TL));
        System.out.println("TMT             : " + formatTanggal(TMT));
        System.out.println("Jabatan         : Dosen Tetap");
        System.out.println("Fakultas        : " + Fakultas);
        System.out.println("Masa Kerja      : " + getMasaKerjaTahun() + " tahun " + getMasaKerjaBulan() + " bulan");
        System.out.println("Tanggal Pensiun : " + formatTanggal(getTanggalPensiun()));
        System.out.println("Gaji Pokok      : " + GajiPokok);
        System.out.println("Tunjangan       : 2% x " + getMasaKerjaTahun() + " x " + GajiPokok + " = " + getTunjangan());
    }
}