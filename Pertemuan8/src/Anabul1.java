/* Nama File : Anabul1.java 
 * Deskripsi : Berisi atribut dan method abstrak dalam class Anabul
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 28/04/2026  
 */

public abstract class Anabul1 {
    private String Nama;

    public void setNama(String nama){
        Nama = nama;
    }

    public String getNama(){
        return Nama;
    }

    public abstract void Gerak();
    public abstract void Suara();
}