/* Nama File : IResize.java 
 * Deskripsi : Berisi interface IResize
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 17/03/2026 
 */

public interface IResize {
    //menambahkan ukuran menjadiu 10% lebih besar
    public void zoomIn();

    //mengurangi ukuran menjadi 10% lebih kecil
    public void zoomOut();

    //menskala ukuran sesuai dengan input percent yang diberikan
    public void zoom(int percent);
}
