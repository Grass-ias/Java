/* Nama File : Anjing1.java 
 * Deskripsi : Berisi atribut dan method dalam class Anjing1 turunan Anabul1
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 28/04/2026  
 */

public class Anjing1 extends Anabul1 {
    @Override
    public void Gerak(){
        System.out.println("Anjing " + super.getNama() + " bergerak dengan berjalan/berlari");
    }

    @Override
    public void Suara(){
        System.out.println("Anjing " + super.getNama() + " bersuara guk guk");
    }
}