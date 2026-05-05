/* Nama File : Kucing2.java 
 * Deskripsi : Berisi atribut bobot dan method dalam class Kucing2 turunan Anabul2
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 05/05/2026
 */

public class Kucing2 extends Anabul2 {
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