    /* Nama File : Anabul.java 
    * Deskripsi : Berisi atribut dan method dalam class Anabul
    * Pembuat   : Ferdy Prasetya Putra/24060124140145
    * Tanggal   : 24/04/2026  
    */

    public abstract class Anabul {
        private String Nama;

        public void setNama(String nama){
            Nama = nama;
        }

        public String getNama(){
            return Nama;
        }

        public abstract void Gerak();
        public abstract void Suara();
    }
