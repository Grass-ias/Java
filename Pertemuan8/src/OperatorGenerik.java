/* Nama File : OperatorGenerik.java 
 * Deskripsi : Berisi prosedur Tukar menggunakan Datum dan fungsi Bobot2
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 28/04/2026  
 */

public class OperatorGenerik {
    public static <T> void Tukar(Datum<T> a, Datum<T> b) {
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    public static <T extends Kucing1, U extends Kucing1> double Bobot2(T k1, U k2) {
        return k1.getBobot() + k2.getBobot();
    }
}