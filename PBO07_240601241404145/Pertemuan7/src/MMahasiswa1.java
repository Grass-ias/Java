/* Nama File : MMahasiswa1.java 
 * Deskripsi : Berisi atribut dan method dalam class MMahasiswa
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 24/04/2026 
 */
public class MMahasiswa1 {
    public static void main(String[] args) {
        Mahasiswa1 M1 = new Mahasiswa1("6767", "Jarjit", "Informatika");
        Mahasiswa1 M2 = new Mahasiswa1();

        System.out.println("Mahasiswa 2 (Kosong)");
        M2.printMhs();

        System.out.println("\nMahasiswa 2 (Diisi dengan parameter kosong)");
        M2.setProgramStudi();
        M2.printMhs();

        System.out.println("\nMahasiswa 2 (Diisi dengan parameter string)");
        M2.setProgramStudi("Perikanan");
        M2.printMhs();

        System.out.println("\nMahasiswa 2 (Diisi dengan parameter Mahasiswa)");
        M2.setProgramStudi(M1);
        M2.printMhs();

        Mahasiswa1 M3 = new Mahasiswa1(M1);
        System.out.println("\nMahasiswa 3 (Diisi dengan parameter Mahasiswa)");
        M3.printMhs();
    }
}