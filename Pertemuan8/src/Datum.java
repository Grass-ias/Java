/* Nama File : Datum.java 
 * Deskripsi : Kelas generik yang menyimpan sebuah isi dengan tipe bebas
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 28/04/2026  
 */

public class Datum<T> {
    private T isi;

    public T getIsi() { 
        return isi; 
    }
    
    public void setIsi(T isibaru) { 
        this.isi = isibaru; 
    }
}