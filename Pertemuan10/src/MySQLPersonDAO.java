import java.sql .*;

/* Nama File : MySQLPersonDAO.java 
 * Deskripsi : Class untuk menyimpan data person ke database MySQL
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 12/05/2026
 */

public class MySQLPersonDAO implements PersonDAO{
    public void savePerson (Person person) throws Exception{
    String name = person.getName ();

    //membuat koneksi, nama db, user, password menyesuaikan
    Class.forName("com.mysql.jdbc.Driver") ;
    Connection con = DriverManager.getConnection ("jdbc:mysql://localhost/pbo", "root","12edd3aD");

    //kerjakan mysql query
    String query = "INSERT INTO person (name) VALUES ('"+name+"')";
    System.out.println (query) ;
    Statement s = con.createStatement ();
    s.executeUpdate (query) ;

    //tutup koneksi database
    con.close();
    }
}