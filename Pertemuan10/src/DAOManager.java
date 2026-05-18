/* Nama File : DAOManager.java 
 * Deskripsi : Class untuk mengelola DAO
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 12/05/2026
 */

public class DAOManager{
    private PersonDAO personDAO;
    
    public void setPersonDAO (PersonDAO person) {
        personDAO = person;
    }

    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}