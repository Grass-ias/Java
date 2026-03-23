/* Nama File : Pengusaha.java 
 * Deskripsi : Berisi atribut dan method dalam abstract class Pengusaha
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 23/03/2026 
 */

public class Pengusaha extends Manusia implements Pajak {
    private String NPWP;
    private static int counterPengusaha = 0;
    private int B = 4; /* 240601241401(4)5 */

    public Pengusaha(String nama, String tgl, String alamat, double pendapatan, String NPWP) {
        super(nama, tgl, alamat, pendapatan);
        this.NPWP = NPWP;
        counterPengusaha++;
    }

    public String getNPWP() {
        return NPWP;
    }

    public void setNPWP(String NPWP) {
        this.NPWP = NPWP;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;}

    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    @Override
    public int hitungMasaKerja() {
        return getSelisihTahun() + B;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP            : " + getNPWP());
    }
}