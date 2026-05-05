/* Nama File : MTeman.java 
 * Deskripsi : Main driver untuk koleksi kelas Teman
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 05/05/2026  
 */

public class MTeman {
    public static void main(String[] args) {
        Teman teman = new Teman();
        teman.addNama("Opan");
        teman.addNama("Bayu");
        teman.addNama("Pei");
        teman.addNama("Ferry");
        teman.addNama("Azka");
        teman.addNama("Basil");
        teman.addNama("Depano");
        teman.addNama("Dinda");
        teman.addNama("Elza");
        teman.addNama("Ihsan");
        teman.addNama("Izzat");
        teman.addNama("Marcel");
        teman.addNama("Menza");
        teman.addNama("Dika");
        teman.addNama("Lutpi");
        teman.addNama("Nopal");
        teman.addNama("Atta");
        teman.addNama("Novelya");
        teman.addNama("RTX 4060 Ti");

        teman.showTeman();
        System.out.println("\n");

        teman.delNama("RTX 4060 Ti");
        teman.showTeman();
        System.out.println("\n");

        teman.gantiNama("Pei", "Pei Genteng");
        teman.showTeman();
        System.out.println("\n");

        teman.gantiNama("Opan", teman.getNama(1));
        teman.showTeman();
        System.out.println("\n");

        teman.setNama(1, "Opan");
        teman.showTeman();
        System.out.println("\n");

        System.out.println("Apakah 'Bayu' merupakan teman? " + teman.isMember("Bayu"));
        System.out.println("Apakah 'RTX 4060 Ti' merupakan teman? " + teman.isMember("RTX 4060 Ti"));   

        System.out.println("Jumlah 'Bayu' dalam daftar teman: " + teman.countNama("Bayu"));
    }
}