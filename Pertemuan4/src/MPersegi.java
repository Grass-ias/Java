/* Nama File : MPersegi.java 
 * Deskripsi : Driver/Main class untuk menguji class Persegi
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 10/03/2026 
 */

public class MPersegi {
    public static void main(String[] args) {
        Persegi p1 = new Persegi();
        p1.setSisi(5.0);
        p1.setWarna("Biru");
        p1.setBorder("Solid");

        p1.printInfo();
    }
}