/* Nama File : Dosen2.java 
 * Deskripsi : Berisi atribut dan method dalam class Dosen2
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 24/04/2026  
 */

public class Dosen2 extends CivitasAkademika {
    /****************ATRIBUT*****************/
    private String NIP;

    /****************METHOD******************/
    public Dosen2(){
        NIP = "-999";
    }

    public Dosen2(String x){
        this.NIP = x;
    }

    public String getNIP(){
        return NIP;
    }

    public void setNIP(String x){
        NIP = x;
    }

    public void printDosen2(){
        System.out.println("NIP        : " + NIP);
    }
}


