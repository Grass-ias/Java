/* Nama File : CivitasAkademika.java 
 * Deskripsi : Berisi atribut dan method dalam class CivitasAkademika
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 24/04/2026  
 */

public abstract class CivitasAkademika {
    private String Nama;
    private String Nomor;

    public CivitasAkademika() {
        this.Nama = "-";
        this.Nomor = "-";
    }
    public CivitasAkademika(String Nama, String Nomor) {
        this.Nama = Nama;
        this.Nomor = Nomor;
    }

    public String getNama() {
        return Nama;
    }

    public String getNomor() {
        return Nomor;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setNomor(String Nomor) {
        this.Nomor = Nomor;
    }
}
