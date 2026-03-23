/* Nama File : PNS.java 
 * Deskripsi : Berisi atribut dan method dalam abstract class PNS
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 23/03/2026 
 */

public class PNS extends Manusia implements Pajak {
    private String NIP;
    private static int counterPNS = 0;
    private int A = 5; /* 2406012414014(5) */

    public PNS(String nama, String tgl, String alamat, double pendapatan, String NIP) {
        super(nama, tgl, alamat, pendapatan);
        this.NIP = NIP;
        counterPNS++;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    @Override
    public double hitungPajak() {
        return 0.10 * pendapatan;
    }

    @Override
    public int hitungMasaKerja() {
        return getSelisihTahun() + A;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP             : " + getNIP());
    }
}
