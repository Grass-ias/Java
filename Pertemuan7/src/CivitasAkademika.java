/* Nama File : CivitasAkademika.java 
 * Deskripsi : Berisi atribut dan method abstrak dalam class CivitasAkademika
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 24/04/2026  
 */

public abstract class CivitasAkademika {
    protected String Nama;

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getNama() {
        return Nama;
    }

    public abstract String getNomor();
}