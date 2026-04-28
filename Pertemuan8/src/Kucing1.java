/* Nama File : Kucing1.java 
 * Deskripsi : Berisi atribut bobot dan method dalam class Kucing1 turunan Anabul1
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 28/04/2026  
 */

public class Kucing1 extends Anabul1 {
    private double bobot;

    public void setBobot(double bobot) {
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }

    @Override
    public void Gerak(){
        System.out.println("Kucing " + super.getNama() + " bergerak dengan berjalan/berlari");
    }

    @Override
    public void Suara(){
        System.out.println("Kucing " + super.getNama() + " berbunyi meong");
    }
}