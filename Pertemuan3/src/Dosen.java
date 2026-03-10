/* Nama File : Dosen.java 
 * Deskripsi : Berisi atribut dan method dalam class Dosen
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 03/03/2026 
 */

public class Dosen {
    /****************ATRIBUT*****************/
    String NIP;
    String Nama;
    String Prodi;

    /****************METHOD******************/
    Dosen(){
        NIP = "-";
        Nama = "-";
        Prodi = "-";
    }

    Dosen(String x, String y, String z){
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

