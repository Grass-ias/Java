/* Nama File : BangunDatar.java 
 * Deskripsi : Berisi atribut dan method dalam class bangun datar
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 10/03/2026 
 */

public class BangunDatar {
    private int jmlSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;

    public BangunDatar () {
        counterBangunDatar++;
    }
    
    public BangunDatar (int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public int getJmlSisi () {
        return jmlSisi;
    }

    public void setJmlSisi (int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public String getWarna () {
        return warna;
    }

    public void setWarna (String warna) {
        this.warna = warna;
    }

    public String getBorder () {
        return border;
    }

    public void setBorder (String border) {
        this.border = border;
    }

    public static void printCounterBangunDatar () {
        System.out.println("Jumlah objek Bangun Datar : " + counterBangunDatar);
    }

    public void printInfo () {
        System.out.println ("Jumlah sisi : " + jmlSisi);
        System.out.println ("Warna       : " + warna);
        System.out.println ("Border      : " + border);
    }
}