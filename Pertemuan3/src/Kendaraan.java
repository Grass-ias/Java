/* Nama File : Kendaraan.java 
 * Deskripsi : Berisi atribut dan method dalam class Kendaraan
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 03/03/2026 
 */

    public class Kendaraan {
        /****************ATRIBUT*****************/
        String NoPlat;
        String Jenis;

        /****************METHOD******************/
        Kendaraan(){
            NoPlat = "-";
            Jenis = "-";
        }

        Kendaraan(String x, String y){
            this.NoPlat = x;
            if (y == "mobil" || y == "motor"){
                this.Jenis = y;
            }
        }

        String getNoPlat(){
            return NoPlat;
        }

        String getJenis(){
            return Jenis;
        }

        void setNoPlat(String x){
            NoPlat = x;
        }

        void setJenis(String z){
            Jenis = z;
        }
    }
