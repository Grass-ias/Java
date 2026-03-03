/* Nama File : MTitik.java 
 * Deskripsi : Berisi atribut dan method dalam class Titik
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 24/02/2026 
 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); //Membuat objek titik T1 (0,0)
        T1.setAbsis(3); //Mengganti absis T1 menjadi 3
        T1.setOrdinat(4); //Mengganti ordinat T1 menjadi 4
        T1.printTitik(); //Menampilkan koodinat T1 ke layar
        T1.geser(1, 3); //Menggeser titik T1 sejauh (1,3)
        T1.printTitik(); //Menampilkan koodinat T1 setelah di geser

        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        Titik T3 = new Titik(10, -1);
        T3.printTitik();

        System.out.println("Jumlah objek titik = " + Titik.getCounterTitik());
        System.out.println("T1 ada di kuadran = " + T1.getKuadran());
        System.out.println("T2 ada di kuadran = " + T2.getKuadran());
        System.out.println("T3 ada di kuadran = " + T3.getKuadran());

        System.out.println("Jarak antara T3 dengan titik pusat = " + T3.getJarakPusat());

        System.out.println("Jarak antara T2 dan T3 = " + T1.getJarak(T2));

        T1 = T1.getRefleksiX();
        T3 = T3.getRefleksiY();
        System.out.println("T1 setelah di refleksi X");
        T1.printTitik();
        System.out.println("T3 setelah di refleksi Y");
        T3.printTitik();






    }
}
