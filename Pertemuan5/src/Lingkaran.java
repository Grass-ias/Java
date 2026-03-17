/* Nama File : Lingkaran.java 
 * Deskripsi : Berisi atribut dan method dalam class Lingkaran
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 17/03/2026 
 */

public class Lingkaran extends BangunDatar implements IResize{
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

    public double getLuas () {
        return 3.14 * jari2 * jari2; 
    }

    public double getKeliling () {
        return 2 * 3.14 * jari2;
    }

    @Override
    public void printInfo () {
        super.printInfo();
        System.out.println("Jari-jari   : " + getJari2());
        System.out.println("Luas        : " + getLuas());
        System.out.println("Keliling    : " + getKeliling());
    }
    
    @Override
    public void zoomIn() {
        jari2 = jari2 * 1.1;
    }

    @Override
    public void zoomOut() {
        jari2 = jari2 * 0.9;
    }

    @Override
    public void zoom(int percent) {
        jari2 = jari2 * percent/100;
    }
}
