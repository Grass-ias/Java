/* Nama File : Lingkaran.java 
 * Deskripsi : Berisi atribut dan method dalam class Lingkaran
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 10/03/2026 
 */

public class Lingkaran extends BangunDatar {
    private double jari2;

    public Lingkaran () {
        setJmlSisi(0);
    }

    public Lingkaran (double jari2, String warna, String border) {
        super(0, warna, border);
        this.jari2 = jari2;
    }

    public double getJari2 () {
        return jari2;
    }

    public void setJari2 (double jari2) {
        this.jari2 = jari2;
    }

    public static void printcounterBangunDatar () {
        BangunDatar.printCounterBangunDatar();
    }

    @Override
    public void printInfo () {
        super.printInfo();
        System.out.println("Jari-jari   : " + getJari2());
    }
    
}
