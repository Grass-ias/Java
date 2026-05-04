/* Nama File : Data.java 
 * Deskripsi : Kelas larik generik statik
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 28/04/2026  
 */

public class Data<T> {
    private Object[] ruang;
    private int banyak;

    public Data() {
        ruang = new Object[100];
        banyak = 0;
    }

    public void setIsi(int pos, T elemen) {
        if (pos >= 1 && pos <= 100) {
            if (ruang[pos - 1] == null) {
                banyak++; 
            }
            ruang[pos - 1] = elemen;
        }
    }

    @SuppressWarnings("unchecked")
    public T getIsi(int pos) {
        if (pos >= 1 && pos <= 100) {
            return (T) ruang[pos - 1]; 
        }
        return null;
    }

    public int getSize() {
        return banyak;
    }
}