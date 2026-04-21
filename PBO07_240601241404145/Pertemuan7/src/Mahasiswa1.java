/* Nama File : Mahasiswa1.java 
 * Deskripsi : Berisi atribut dan method dalam class Mahasiswa1
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 24/04/2026  
 */

public class Mahasiswa1 {
    /****************ATRIBUT*****************/
    private String NIM;
    private String Nama;
    private String Prodi;

    /****************METHOD******************/
    public Mahasiswa1(){
        NIM = "-999";
        Nama = "n/a";
        Prodi = "n/a";
    }

    public Mahasiswa1(String x, String y, String z){
        this.NIM = x;
        this.Nama = y;
        this.Prodi = z;
    }

    public Mahasiswa1(Mahasiswa1 m){
        this.NIM = m.NIM;
        this.Nama = m.Nama;
        this.Prodi = m.Prodi;
    }

    public String getNIM(){
        return NIM;
    }

    public String getNama(){
        return Nama;
    }

    public String getProdi(){
        return Prodi;
    }

    public void setNIM(String x){
        NIM = x;
    }

    public void setNama(String y){
        Nama = y;
    }

    public void setProgramStudi(){
        Prodi = "Kosong";
    }

    public void setProgramStudi(String z){
        Prodi = z;
    }

    public void setProgramStudi(Mahasiswa1 m){
        Prodi = m.getProdi();
    }

    public void printMhs(){
        System.out.println("NIM        : " + NIM);
        System.out.println("Nama       : " + Nama);
        System.out.println("Prodi      : " + Prodi);
    }
}


