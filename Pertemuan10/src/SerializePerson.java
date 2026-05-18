/* Nama File : SerializePerson.java 
 * Deskripsi : Class untuk menyimpan data person ke dalam file dengan menggunakan serialisasi
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 12/05/2026
 */

//class SerializePerson
public class SerializePerson{
    public static void main (String[] args) {
    Person person = new Person("Panji");
        try{
        java.io.FileOutputStream f = new java.io.FileOutputStream ("person.ser");
        java.io.ObjectOutputStream s = new java.io.ObjectOutputStream (f);
        s.writeObject (person);
        System.out.println("selesai menulis objek person");
        s.close ();
        }
        catch (java.io.IOException e) {
            e.printStackTrace ();
        }
    }
}