/* Nama File : Titik.java 
 * Deskripsi : Berisi atribut dan method dalam class Titik
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 24/02/2026 
 */

public class Titik {
    /****************ATRIBUT*****************/
    double absis;
    double ordinat;
    static int counterTitik;

    /****************METHOD******************/
    //Konstruktor untuk membuat titik (0,0)
    Titik(){
        this(0,0);
    }

    static int getCounterTitik(){
        return counterTitik;
    }

    Titik(double x, double y){
        absis = x;
        ordinat = y;
        counterTitik++;
    }

    //mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    //mengeset absis titik dengan nilai x
    void setAbsis(double x){
        absis = x;
    }

    //mengeset ordinat titik dengan nilai y
    void setOrdinat(double y){
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat +y;
    }

    //mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ") ");
    }

    int getKuadran(){
        if (absis > 0 && ordinat > 0){
            return 1;
        } 
        else if (absis < 0 && ordinat > 0){
            return 2;
        }
        else if (absis > 0 && ordinat < 0){
            return 4;
        }
        else if (absis < 0  && ordinat < 0){
            return 3;
        }
        else {
            return 0;
        }
    }

    double getJarakPusat(){
        return Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
    }

    double getJarak(Titik T1){
        return Math.sqrt(Math.pow(T1.absis - this.absis, 2) + Math.pow(T1.ordinat - this.ordinat, 2));
    }

    void refleksiX(){
        ordinat = ordinat * -1;
    }

    void refleksiY(){
        absis = absis * -1;
    }

    Titik getRefleksiX(){
        Titik Tbaru = new Titik(this.absis, this.ordinat);
        Tbaru.refleksiX();
        return Tbaru;
    }   

    Titik getRefleksiY(){
        Titik Tbaru = new Titik(this.absis, this.ordinat);
        Tbaru.refleksiY();
        return Tbaru;
        }
}


