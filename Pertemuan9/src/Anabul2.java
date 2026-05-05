/* Nama File : Anabul2.java 
 * Deskripsi : Berisi atribut dan method abstrak dalam class Anabul2
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 05/05/2026
 */

public abstract class Anabul2 {
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