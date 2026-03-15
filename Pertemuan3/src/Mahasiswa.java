/* Nama File : Mahasiswa.java 
 * Deskripsi : Berisi atribut dan method dalam class Mahasiswa
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 03/03/2026  
 */

import java.util.ArrayList;

public class Mahasiswa {
    /****************ATRIBUT*****************/
    private String NIM;
    private String Nama;
    private String Prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen1 dosenwali;
    private Kendaraan kendaraan;

    /****************METHOD******************/
    public Mahasiswa(){
        NIM = "-";
        Nama = "-";
        Prodi = "-";
        this.listMatKul = new ArrayList<>();
    }

    public Mahasiswa(String x, String y, String z){
        this.NIM = x;
        this.Nama = y;
        this.Prodi = z;
        this.listMatKul = new ArrayList<>();
    }

    public String getNIM(){
        return NIM;
    }

    public String getNama(){
        return Nama;
    }

    public String getProdi(){
        return Prodi;
    }

    public ArrayList<MataKuliah> getMatkul(){
        return listMatKul;
    }

    public Dosen1 getDosen(){
        return dosenwali;
    }

    public Kendaraan getKendaraan(){
        return kendaraan;
    }

    public void setNIM(String x){
        NIM = x;
    }

    public void setNama(String y){
        Nama = y;
    }

    public void setProdi(String z){
        Prodi = z;
    }

    public void setlistMatKul(ArrayList<MataKuliah> matkul){
        listMatKul = matkul;
    }

    public void setDosenwali(Dosen1 dosen){
        dosenwali = dosen;
    }

    public void setKendaraan(Kendaraan x){
        kendaraan = x;
    }


    public void addMatkul(MataKuliah newMatkul){
        listMatKul.add(newMatkul);
    }

    public void printDetailMhs(){
        System.out.println("NIM                :" + NIM);
        System.out.println("Nama               :" + Nama);
        System.out.println("Prodi              :" + Prodi);
        System.out.println("NIP Dosen Wali     :" + dosenwali.getNIP());
        System.out.println("Nama Dosen Wali    :" + dosenwali.getNama());
        System.out.println("Prodi Dosen Wali   :" + dosenwali.getProdi());
        System.out.println("No Plat Kendaraaan :" + kendaraan.getNoPlat());
        System.out.println("Jenis Kendaraaan   :" + kendaraan.getJenis());
        
        int i;
        for (i = 0; i < listMatKul.size(); i++){
            System.out.println(listMatKul.get(i).getNama());
        }
    }

    public int getJumlahSKS(){
        int total = 0;
        int i;
        for (i = 0; i < listMatKul.size(); i++){
            total += listMatKul.get(i).getsks();  
        }
        return total;
    }

    public void printMhs(){
        System.out.println("NIM        :" + NIM);
        System.out.println("Nama       :" + Nama);
        System.out.println("Prodi      :" + Prodi);
    }
    
    public int getJumlahMatKul(){
        int count = 0;
        int i;
        for (i = 0; i < listMatKul.size(); i++){
            count ++; 
        }
        return count;
    }
}

