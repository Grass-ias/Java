/* Nama File : DosenTetap.java 
 * Deskripsi : Driver/Main class untuk menguji class DosenTetap
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 10/03/2026 
 */

import java.time.LocalDate;

public class DosenTetap extends Pegawai {
    private String NIDN;

    public DosenTetap (String NIP, String NIDN ,String Nama, LocalDate TL, double Gaji) {
        super(NIP, Nama, TL, Gaji);
        this.NIDN = NIDN;
    }

    public String getNIDN () {
        return NIDN;
    }

    public void setNIDN (String NIDN) {
        this.NIDN = NIDN;
    }

    @Override
    public void printInfo () {
        super.printInfo();
        System.out.println("NIDN      : " + NIDN);
    }
    
}
