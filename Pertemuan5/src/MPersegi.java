/* Nama File : MPersegi.java 
 * Deskripsi : Driver/Main class untuk menguji class Persegi
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 17/03/2026 
 */

public class MPersegi {
    public static void main(String[] args) {
        Persegi p1 = new Persegi();

        System.out.println("\nPersegi p1");
        p1.setSisi(5.0);
        p1.setWarna("Biru");
        p1.setBorder("Solid");
        p1.printInfo();

        System.err.println("\n\n");
        BangunDatar p2 = new Persegi(10.0, "Hijau", "Putus-putus");
        System.out.println("\nPersegi p2");
        p2.printInfo();

        System.err.println("\n");
        BangunDatar l2 = new Lingkaran(7.0, "Hijau", "Putus-putus");
        System.out.println("\nLingkaran l2");
        l2.printInfo();

        System.err.println("\nCek luas podo po rak bolo");
        if (p1.isEqualLuas(l2)) {
            System.out.println("Podo jier..");
        } else {
            System.out.println("Gk podo jier..");
        }

        System.err.println("\nCek keliling podo po rak bolo");
        if (p1.isEqualKeliling(l2)) {
            System.out.println("Podo jier..");
        } else {
            System.out.println("Gk podo jier..");
        }

        p1.zoomIn();
        System.out.println("\nPersegi p1 setelah zoom in");
        p1.printInfo();

        p1.zoomOut();
        System.out.println("\nPersegi p1setelah zoom out");
        p1.printInfo();

        p1.zoom(120);
        System.out.println("\nPersegi p1 setelah zoom 20%");
        p1.printInfo();

        System.err.println("\n");
        BangunDatar.printCounterBangunDatar();
    }
}