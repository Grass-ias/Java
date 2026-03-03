/* Nama File : MGaris.java 
 * Deskripsi : Berisi atribut dan method dalam class Garis
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 24/02/2026 
 */

public class MGaris {
    public static void main(String[] args) {
        Titik T1 = new Titik(0, 0);
        Titik T2 = new Titik(4, 4);
        Titik T3 = new Titik(0, 4);
        Titik T4 = new Titik(4, 0);

        Garis G1 = new Garis(T1, T2); 
        Garis G2 = new Garis(T3, T4); 
        Garis G3 = new Garis();       

        System.out.print("G1: "); G1.printGaris();
        G1.printPersamaan();
        
        System.out.print("\nG2: "); G2.printGaris();
        G2.printPersamaan();
        System.out.println("Panjang G1  : " + G1.cariPanjang());
        System.out.println("Gradien G1  : " + G1.cariGradien());
        
        Titik tengahG1 = G1.cariTengah();
        System.out.print("Titik Tengah G1: "); 
        tengahG1.printTitik();

        System.out.println("Apakah G1 sejajar G3? " + G1.isSejajar(G3)); 
        System.out.println("Apakah G1 tegak lurus G2? " + G1.isTegakLurus(G2));

        System.out.println("Jumlah Objek Titik yang dibuat : " + Titik.getCounterTitik());
        System.out.println("Jumlah Objek Garis yang dibuat : " + Garis.getCounterGaris());
    }
}
