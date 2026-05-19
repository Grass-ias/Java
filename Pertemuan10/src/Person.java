/* Nama File : Person.java 
 * Deskripsi : Class untuk merepresentasikan data person
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 12/05/2026
 */

import java.io.Serializable;

public class Person implements Serializable{
    private int id;
    private String name;

    public Person(String n) {
        name = n;
    }

    public Person(int i, String n) {
        id = i;
        name = n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}