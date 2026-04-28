/* Nama File : Burung1.java 
 * Deskripsi : Berisi atribut dan method dalam class Burung1 turunan Anabul1
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 28/04/2026  
 */

public class Burung1 extends Anabul1 {
    @Override
    public void Gerak(){
        System.out.println("Burung " + super.getNama() + " bergerak dengan terbang");
    }

    @Override
    public void Suara(){
        System.out.println("Burung " + super.getNama() + " berbunyi cuit");
    }
}