/* Nama File : Manusia.java 
 * Deskripsi : Berisi atribut dan method dalam abstract class Manusia
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 17/03/2026 
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public abstract class Manusia {
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;
    private static final DateTimeFormatter convertdate = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public Manusia(String nama, String tglStr, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = LocalDate.parse(tglStr, convertdate);
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public String getNama() {
        return nama;
    }

    public String getTglMulaiKerja() {
        return tgl_mulai_kerja.format(convertdate);
    }

    public String getAlamat() {
        return alamat;
    }

    public double getPendapatan() {
        return pendapatan;
    }
    public static int getCounterMns() {
        return counterMns;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTglMulaiKerja(String tglStr) {
        this.tgl_mulai_kerja = LocalDate.parse(tglStr, convertdate);
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    public void cetakInfo() {
        System.out.println("Nama            : " + getNama());
        System.out.println("Tgl Mulai Kerja : " + getTglMulaiKerja());
        System.out.println("Alamat          : " + getAlamat());
        System.out.printf("Pendapatan      : %.0f\n", getPendapatan()); 
    }

    protected int getSelisihTahun() {
        return Period.between(this.tgl_mulai_kerja, LocalDate.now()).getYears();
    }

    public abstract int hitungMasaKerja();
}