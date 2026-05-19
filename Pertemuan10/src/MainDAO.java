/* Nama File : MainDAO.java 
 * Deskripsi : Class untuk menjalankan program DAO
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 12/05/2026
 */

public class MainDAO {
    public static void main (String args[]) {
    Person person = new Person("Ferdy Prasetya Putra") ;
    DAOManager m = new DAOManager () ;
    m.setPersonDAO (new MySQLPersonDAO()) ;
        try{
            m.getPersonDAO () .savePerson (person) ;
        } catch (Exception e) {
        e.printStackTrace ();
        }
    } 
}