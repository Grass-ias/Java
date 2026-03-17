/* Nama File : Persegi.java 
 * Deskripsi : Berisi atribut dan method dalam class Persegi
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 17/03/2026 
 */

public class Persegi extends BangunDatar implements IResize{
    private double sisi;

    public Persegi () {
        setJmlSisi( 4);
    }

    public Persegi (double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    public double getSisi () {
        return sisi;
    }

    public void setSisi (double sisi) {
        this.sisi = sisi;
    }

    public static void printcounterBangunDatar () {
        BangunDatar.printCounterBangunDatar();
    }

    public double getLuas () {
        return sisi * sisi;
    }

    public double getKeliling () {
        return 4 * sisi;
    }

    @Override
    public void printInfo () {
        super.printInfo();
        System.out.println("Sisi        : " + sisi) ;
        System.out.println("Luas        : " + getLuas());
        System.out.println("Keliling    : " + getKeliling());
    }

    @Override
    public void zoomIn() {
        sisi = sisi * 1.1;
    }

    @Override
    public void zoomOut() {
        sisi = sisi * 0.9;
    }

    @Override
    public void zoom(int percent) {
        sisi = sisi * percent/100;
    }
    
}