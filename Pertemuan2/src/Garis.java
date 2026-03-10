/* Nama File : Garis.java 
 * Deskripsi : Berisi atribut dan method dalam class Garis
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 24/02/2026 
 */

public class Garis{
    /****************ATRIBUT*****************/
    Titik Awal;
    Titik Akhir;
    static int counterGaris;

    /****************METHOD******************/
    //Konstruktor untuk membuat titik (0,0)
    Garis(){
        Awal = new Titik(0,0);
        Akhir = new Titik(1,1);
    }

    static int getCounterGaris(){
        return counterGaris;
    }

    Garis(Titik T1, Titik T2){
        Awal = T1;
        Akhir = T2;
        counterGaris++;
    }

    //mengembalikan nilai absis
    Titik getAwal(){
        return Awal;
    }

    //mengembalikan nilai ordinat
    Titik getAkhir(){
        return Akhir;
    }

    //mengeset awal dengan nilai titik T
    void setAwal(Titik T){
        Awal = T;
    }

    //mengeset akhir dengan nilai titik T
    void setAkhir(Titik T){
        Akhir = T;
    }

    //mencari panjang dari titik T1 sampai T2
    double cariPanjang(Titik Awal, Titik Akhir){
        return Math.sqrt(Math.pow(Akhir.getAbsis() - Awal.getAbsis(), 2) +  Math.pow(Akhir.getOrdinat() - Awal.getOrdinat(), 2));
    }

    //mencari gradien suatu titik
    double cariGradien(Titik Awal, Titik Akhir){
        return (Akhir.getOrdinat() - Awal.getOrdinat())/(Akhir.getAbsis() - Awal.getAbsis());
    }

    //mencari titik tengah
    Titik cariTengah(Titik Awal, Titik Akhir){
        Titik Tmid = new Titik(((Awal.getAbsis() + Akhir.getAbsis())/2), (Awal.getOrdinat() + Akhir.getOrdinat())/2);
        return Tmid;
    }

    //mengecek apakah sejajar
    boolean isSejajar(Garis G1, Garis G2){
        return G1.cariGradien(getAwal(), getAkhir()) == G2.cariGradien(getAwal(), getAkhir());
    }

    //mengecek apakah tegak lurus
    boolean isTegakLurus(Garis G1, Garis G2){
        return G1.cariGradien(getAwal(), getAkhir()) * G2.cariGradien(getAwal(), getAkhir()) == -1;
    }

    //menampilkan titik awal dan titik akhir
    void printGaris(Garis G){
        System.out.println("Awal  = " + G.getAwal());
        System.out.println("Akhir = " + G.getAkhir());
    }

    //menampilkan persamaan garis
    void printPersamaan(Garis G1, Garis G2){
        //y - y1 = (y2 - y1) / (x2 - x1) * (x - x1)
        double A1 = ((Akhir.getOrdinat() - Awal.getOrdinat()) / (Akhir.getAbsis() - Awal.getAbsis()));
        double y = (A1 * Awal.getAbsis() - );

    }
}