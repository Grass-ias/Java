/* Nama File : Wrapper.java 
 * Deskripsi : Kelas pembungkus untuk meniru fitur Pass-by-Reference
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 28/04/2026  
 */
public class Wrapper<T> {
    public T value;
    public Wrapper(T value) { 
        this.value = value; 
    }
}