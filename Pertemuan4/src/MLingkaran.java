/* Nama File : MLingkaran.java 
 * Deskripsi : Driver/Main class untuk menguji class Lingkaran
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 10/03/2026 
 */

public class MLingkaran {
    public static void main(String[] args) {
        Lingkaran p1 = new Lingkaran();
        p1.setJari2(14.0);
        p1.setWarna("Merah");
        p1.setBorder("Transparan");

        System.out.println("Jari-jari   : " + p1.getJari2());
        System.out.println("Jumlah Sisi : " + p1.getJmlSisi());
        System.out.println("Warna       : " + p1.getWarna());
        System.out.println("Border      : " + p1.getBorder());
    }
}
