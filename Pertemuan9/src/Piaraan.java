import java.util.LinkedList;
import java.util.Queue;

/* Nama File : Piaraan.java 
 * Deskripsi : Mengelola koleksi queue objek Anabul2
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 09/05/2026  
 */
public class Piaraan {
    private int nbelm;
    private Queue<Anabul2> Lanabul;

    public Piaraan() {
        this.Lanabul = new LinkedList<>();
        this.nbelm = 0;
    }

    public int getNbelm() {
        return this.nbelm;
    }

    public void enqueueAnabul(Anabul2 anabul) {
        Lanabul.offer(anabul);
        nbelm++;
    }

    public boolean isMember(Anabul2 anabul) {
        return Lanabul.contains(anabul);
    }

    public Anabul2 getAnabul() {
        return Lanabul.peek(); 
    }

    public Anabul2 dequeueAnabul() {
        Anabul2 a = Lanabul.poll();
        if (a != null) {
            nbelm--;
        }
        return a;
    }

    public void showAnabul() {
        System.out.println("Daftar Panggilan Antrean Anabul:");
        for (Anabul2 a : Lanabul) {
            System.out.println("- " + a.getNama());
        }
    }

    public int countKucing() {
        int count = 0;
        for (Anabul2 a : Lanabul) {
            if (a instanceof Kucing2) {
                count++;
            }
        }
        return count;
    }

    public double bobotKucing() {
        double totalBobot = 0;
        for (Anabul2 a : Lanabul) {
            if (a instanceof Kucing2) {
                totalBobot += ((Kucing2) a).getBobot();
            }
        }
        return totalBobot;
    }

    public void showJenisAnabul() {
        System.out.println("Daftar Antrean dan Jenis Anabul:");
        for (Anabul2 a : Lanabul) {
            System.out.println("- Nama: " + a.getNama() + " | Jenis: " + a.getClass().getSimpleName());
        }
    }
}