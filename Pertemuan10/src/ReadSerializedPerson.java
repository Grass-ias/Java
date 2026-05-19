/* Nama File : ReadSerializedPerson.java 
 * Deskripsi : Program untuk serialisasi objek Person dan menyimpannya ke dalam file, serta membaca kembali objek tersebut dari file
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 12/05/2026
 */

import java.io .*;

public class ReadSerializedPerson{
    public static void main(String[] args) {
        Person person = null;
        try{
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f) ;
            person = (Person) s.readObject () ;
            s.close () ;
            System.out.println("serialized person name = "+person.getName ()) ;
        }
        catch (Exception ioe) {
            ioe.printStackTrace ();
        }
    }
}