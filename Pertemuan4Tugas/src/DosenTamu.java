/* Nama File : DosenTamu.java 
 * Deskripsi : Class untuk entitas Dosen Tamu
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 10/03/2026 
 */

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DosenTamu extends Dosen {
    private String NIDK;
    private LocalDate tanggalBerakhirKontrak;

    public DosenTamu() {
        super();
        this.NIDK = "";
    }

    public DosenTamu(String NIP, String Nama, LocalDate TL, LocalDate TMT, double GajiPokok, String Fakultas, String NIDK, LocalDate tanggalBerakhirKontrak) {
        super(NIP, Nama, TL, TMT, GajiPokok, Fakultas);
        this.NIDK = NIDK;
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }

    public String getNIDK() { return NIDK; }
    public void setNIDK(String NIDK) { this.NIDK = NIDK; }

    public int getMasaKerjaTahun() {
        return Period.between(this.TMT, LocalDate.now()).getYears();
    }

    public int getMasaKerjaBulan() {
        return Period.between(this.TMT, LocalDate.now()).getMonths();
    }

    public double getTunjangan() {
        return 0.025 * GajiPokok;
    }

    public long getSisaKontrakBulan() {
        if (tanggalBerakhirKontrak.isBefore(LocalDate.now())) return 0;
        return ChronoUnit.MONTHS.between(LocalDate.now(), tanggalBerakhirKontrak);
    }

    @Override
    public void printInfo() {
        System.out.println("NIP             : " + NIP);
        System.out.println("NIDK            : " + NIDK);
        System.out.println("Nama            : " + Nama);
        System.out.println("Tanggal Lahir   : " + formatTanggal(TL));
        System.out.println("TMT             : " + formatTanggal(TMT));
        System.out.println("Jabatan         : Dosen Tamu");
        System.out.println("Fakultas        : " + Fakultas);
        System.out.println("Masa Kerja      : " + getMasaKerjaTahun() + " tahun " + getMasaKerjaBulan() + " bulan");
        System.out.println("Sisa Kontrak    : " + getSisaKontrakBulan() + " bulan");
        System.out.println("Gaji Pokok      : " + GajiPokok);
        System.out.println("Tunjangan       : " + getTunjangan());
    }
}