/* Nama File : MGenerik.java 
 * Deskripsi : Program utama untuk menguji Generik Kelas, Method, dan Larik
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 28/04/2026  
 */

public class MGenerik {
    public static void main(String[] args) {
        
        Anggora garfield = new Anggora();
        garfield.setNama("Garfield");
        garfield.setBobot(4.5);

        Datum<Kucing1> datumKucing = new Datum<>();
        datumKucing.setIsi(garfield);
        System.out.println("Isi Datum Kucing : " + datumKucing.getIsi().getNama() + " (Bobot: " + datumKucing.getIsi().getBobot() + "kg)");

        Datum<Integer> dInt1 = new Datum<>(); dInt1.setIsi(3);
        Datum<Integer> dInt2 = new Datum<>(); dInt2.setIsi(6);
        OperatorGenerik.Tukar(dInt1, dInt2);
        System.out.println("Tukar Integer    : a = " + dInt1.getIsi() + ", b = " + dInt2.getIsi());

        Datum<String> dStr1 = new Datum<>(); dStr1.setIsi("Mbuh lah");
        Datum<String> dStr2 = new Datum<>(); dStr2.setIsi("asam lambung");
        OperatorGenerik.Tukar(dStr1, dStr2);
        System.out.println("Tukar String     : s1 = " + dStr1.getIsi() + ", s2 = " + dStr2.getIsi());

        Anjing1 dawg = new Anjing1(); dawg.setNama("dawg si Anjing");
        Kucing1 meong = new Kucing1(); meong.setNama("meong si Kucing");
        
        Datum<Anabul1> dAnjing = new Datum<>(); dAnjing.setIsi(dawg);
        Datum<Anabul1> dKucing = new Datum<>(); dKucing.setIsi(meong);
        
        OperatorGenerik.Tukar(dAnjing, dKucing);
        System.out.println("Tukar Anabul     : dAnjing isinya " + dAnjing.getIsi().getNama() + ", dKucing isinya " + dKucing.getIsi().getNama());

        Kembangtelon belang = new Kembangtelon();
        belang.setNama("Belang");
        belang.setBobot(3.0);
        System.out.println("Total Bobot Garfield & Belang : " + OperatorGenerik.Bobot2(garfield, belang) + " kg");

        Data<Anabul1> arrayAnabul = new Data<>();
        
        Burung1 rio = new Burung1();
        rio.setNama("Rio");

        arrayAnabul.setIsi(1, dawg);
        arrayAnabul.setIsi(5, garfield);
        arrayAnabul.setIsi(100, rio);

        System.out.println("Isi Index 1   : " + arrayAnabul.getIsi(1).getNama());
        System.out.println("Isi Index 5   : " + arrayAnabul.getIsi(5).getNama());
        System.out.println("Isi Index 100 : " + arrayAnabul.getIsi(100).getNama());
        System.out.println("Ukuran efektif: " + arrayAnabul.getSize() + " elemen");
    }
}

/* Renungan : Sepaham ku Generik di Java itu kaya satu template 
    jadi kita nggak perlu ngoding ulang class yang sama persis cuma gara-gara beda tipe data 
    dengan kita nitipin tipe data bayangan pakai parameter kaya <T> 
    yang wujud aslinya baru ditentuin pas objeknya diinstantiate 
    trus Generik langsung ngasih error pas kompilasi kalau ada data yang 
    nyasar dari print, jadi program e ngga bakal tiba-tiba crash di tengah jalan 
    dan bebas dari beban casting data satu-satu secara manual
 */