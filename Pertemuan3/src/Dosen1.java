/* Nama File : Dosen1.java 
 * Deskripsi : Berisi atribut dan method dalam class Dosen1
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 03/03/2026 
 */

public class Dosen1 {
    /****************ATRIBUT*****************/
    String NIP;
    String Nama;
    String Prodi;

    /****************METHOD******************/
    Dosen1(){
        NIP = "-";
        Nama = "-";
        Prodi = "-";
    }

    Dosen1(String x, String y, String z){
        this.NIP = x;
        this.Nama = y;
        this.Prodi = z;
    }

    String getNIP(){
        return NIP;
    }

    String getNama(){
        return Nama;
    }

    String getProdi(){
        return Prodi;
    }

    void setNIP(String x){
        NIP = x;
    }

    void setNama(String y){
        Nama = y;
    }

    void setProdi(String z){
        Prodi = z;
    }
}

