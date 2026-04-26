/* Nama File : Dosen2.java 
 * Deskripsi : Berisi atribut dan method dalam class Dosen2 turunan CivitasAkademika
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 24/04/2026  
 */

public class Dosen2 extends CivitasAkademika {
    private String NIP;

    public Dosen2(String NIP, String Nama) {
        this.NIP = NIP;
        super.setNama(Nama);
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getNIP() {
        return NIP;
    }

    @Override
    public String getNomor() {
        return this.NIP;
    }
}