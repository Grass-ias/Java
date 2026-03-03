/* Nama File : Matkul.java 
 * Deskripsi : Berisi atribut dan method dalam class Matkul
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 03/03/2026 
 */

public class MataKuliah {
    /****************ATRIBUT*****************/
    String IdMatkul;
    String Nama;
    int sks;

    /****************METHOD******************/
    MataKuliah(){
        IdMatkul = "-";
        Nama = "-";
        sks = 0;
    }

    MataKuliah(String x, String y, int z){
        this.IdMatkul = x;
        this.Nama = y;
        this.sks = z;
    }

    String getIdMatkul(){
        return IdMatkul;
    }

    String getNama(){
        return Nama;
    }

    int getsks(){
        return sks;
    }

    void setIdMatkul(String x){
        IdMatkul = x;
    }

    void setNama(String y){
        Nama = y;
    }

    void setsks(int z){
        sks = z;
    }
}
