/* Nama File : MAnabul.java 
 * Deskripsi : Program utama untuk menguji polimorfisme kelas Anabul (Tanpa Looping)
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 24/04/2026  
 */

public class MAnabul {
    public static void main(String[] args) {
        Anabul meowng = new Kucing();
        meowng.setNama("Oyen");

        Anabul dawg = new Anjing();
        dawg.setNama("Snoopy");

        Anabul birb = new Burung();
        birb.setNama("Rio");

        System.out.println("\nTes Kucing");
        meowng.Suara();
        meowng.Gerak();
        
        System.out.println("\nTes Anjing");
        dawg.Suara();
        dawg.Gerak();

        System.out.println("\nTes Burung");
        birb.Suara();
        birb.Gerak();
    }
}