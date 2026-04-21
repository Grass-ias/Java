/* Nama File : Anjing.java 
 * Deskripsi : Berisi atribut dan method dalam class Anjing
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 24/04/2026  
 */

public class Anjing extends Anabul {
    @Override
    public void Gerak(){
        System.out.println("Anjing " + super.getNama() + " bergerak dengan melata");
    }

    @Override
    public void Suara(){
        System.out.println("Anjing " + super.getNama() + " bersuara guk guk");
    }
    
}
