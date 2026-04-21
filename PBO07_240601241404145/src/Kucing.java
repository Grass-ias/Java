/* Nama File : Kucing.java 
 * Deskripsi : Berisi atribut dan method dalam class Kucing
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 24/04/2026  
 */

public class Kucing extends Anabul {
    @Override
    public void Gerak(){
        System.out.println("Kucing " + super.getNama() + " bergerak dengan melata");
    }

    @Override
    public void Suara(){
        System.out.println("Kucing " + super.getNama() + " berbunyi meong");
    }
    
}
