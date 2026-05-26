import java.util.HashMap;

/*
* File: Map.java
* Deskripsi: Implementasi lambda pada Map, digunakan sebagai parameter
pada method.
*/

public class Map {
    public static void main(String[] args) {
        HashMap<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("001", "Adi");
        mahasiswaMap.put("002", "Bambang");
        mahasiswaMap.put("003", "Cici");
        mahasiswaMap.put("004", "Didi");

        // lambda digunakan sebagai parameter untuk menampilkan NIM dan Nama
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}