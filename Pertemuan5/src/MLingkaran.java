/* Nama File : MLingkaran.java 
 * Deskripsi : Driver/Main class untuk menguji class Lingkaran
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 17/03/2026 
 */

public class MLingkaran {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran();
        System.out.println("\nLingkaran l1");
        l1.setJari2(14.0);
        l1.setWarna("Merah");
        l1.setBorder("Transparan");
        l1.printInfo();

        l1.zoomIn();
        System.out.println("\nLingkaran l1 setelah zoom in");
        l1.printInfo();

        l1.zoomOut();
        System.out.println("\nLingkaran l1 setelah zoom out");
        l1.printInfo();

        l1.zoom(120);
        System.out.println("\nLingkaran l1 setelah zoom 20%");
        l1.printInfo();

        System.err.println("\n");
        BangunDatar.printCounterBangunDatar();
    }
}
