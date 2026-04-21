/* Nama File : Mahasiswa2.java 
 * Deskripsi : Berisi atribut dan method dalam class Mahasiswa2
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 24/04/2026  
 */

public class Mahasiswa2 extends CivitasAkademika {
    /****************ATRIBUT*****************/
    private String NIM;

    /****************METHOD******************/
    public Mahasiswa2(){
        NIM = "-999";
    }

    public Mahasiswa2(String x){
        this.NIM = x;
    }

    public String getNIM(){
        return NIM;
    }

    public void setNIM(String x){
        NIM = x;
    }

    public void printMhs2(){
        System.out.println("NIM        : " + NIM);
    }
}


