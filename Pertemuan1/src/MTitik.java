/* Nama File : MTitik.java 
 * Deskripsi : Berisi atribut dan method dalam class Titik
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 20/02/2026 
 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); //Membuat objek titik T1 (0,0)
        T1.setAbsis(3); //Mengganti absis T1 menjadi 3
        T1.setOrdinat(4); //Mengganti ordinat T1 menjadi 4
        T1.printTitik(); //Menampilkan koodinat T1 ke layar
        T1.geser(1, 3); //Menggeser titik T1 sejauh (1,3)
        T1.printTitik(); //Menampilkan koodinat T1 setelah di geser
    }
}
