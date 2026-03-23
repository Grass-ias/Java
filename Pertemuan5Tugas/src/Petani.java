/* Nama File : Petani.java 
 * Deskripsi : Berisi atribut dan method dalam abstract class Petani
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 23/03/2026 
 */

public class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani = 0;
    private int C = 1; /* 24060124140(1)45 */

    public Petani(String nama, String tgl, String alamat, double pendapatan, String asal) {
        super(nama, tgl, alamat, pendapatan);
        this.asal_kota = asal;
        counterPetani++;
    }

    public String getAsalKota() {
        return asal_kota;
    }

    public void setAsalKota(String asal) {
        this.asal_kota = asal;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    @Override
    public double hitungPajak() {
        return 0;
    }

    @Override
    public int hitungMasaKerja() {
        return getSelisihTahun() + C;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota       : " + getAsalKota());
    }
}