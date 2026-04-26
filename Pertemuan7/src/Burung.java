    /* Nama File : Burung.java 
    * Deskripsi : Berisi atribut dan method dalam class Burung turunan Anabul
    * Pembuat   : Ferdy Prasetya Putra/24060124140145
    * Tanggal   : 24/04/2026  
    */

    public class Burung extends Anabul {
        @Override
        public void Gerak(){
            System.out.println("Burung " + super.getNama() + " bergerak dengan terbang");
        }

        @Override
        public void Suara(){
            System.out.println("Burung " + super.getNama() + " berbunyi cuit");
        }
        
    }
