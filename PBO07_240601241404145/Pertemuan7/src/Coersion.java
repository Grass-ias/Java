/* Nama File : Coersion.java
 * Deskripsi : program utama untuk menguji coersion
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 24/04/2026 
 */

public class Coersion {
    public static void main(String[] args) {
    int nilaiInteger = 65;
    char nilaiKarakter = (char) nilaiInteger;
    double nilaiReal = nilaiInteger;
    String nilaiString = Integer.toString(nilaiInteger);

    System.out.println("Konversi nilai 65");
    System.out.println("Integer  : " + nilaiInteger);
    System.out.println("Karakter : " + nilaiKarakter);
    System.out.println("Real     : " + nilaiReal);
    System.out.println("String   : " + nilaiString);

    int bilanganAwal = 65;
    double bilanganReal = bilanganAwal;
    int bilanganKembali = (int) bilanganReal;

    System.out.println("\nInteger -> Real -> Integer");
    System.out.println("Bilangan awal  : " + bilanganAwal);
    System.out.println("Bilangan real  : " + bilanganReal);
    System.out.println("Bilangan kembali : " + bilanganKembali);

    String X = "1234";
    String Y = "5678";
    String S = X + Y;
    Integer Z = Integer.parseInt(X) + Integer.parseInt(Y);

    System.out.println("\nOperasi String Integer");
    System.out.println("X = " + X);
    System.out.println("Y = " + Y);
    System.out.println("S = X + Y dalam String  = " + S);
    System.out.println("Z = X + Y dalam Integer = " + Z);
    }
}
