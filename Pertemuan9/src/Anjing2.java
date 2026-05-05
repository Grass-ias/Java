/* Nama File : Anjing2.java 
 * Deskripsi : Berisi atribut dan method dalam class Anjing2 turunan Anabul2
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 05/05/2026
 */

public class Anjing2 extends Anabul2 {
    @Override
    public void Gerak(){
        System.out.println("Anjing " + super.getNama() + " bergerak dengan berjalan/berlari");
    }

    @Override
    public void Suara(){
        System.out.println("Anjing " + super.getNama() + " bersuara guk guk");
    }
}