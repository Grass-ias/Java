/* Nama File : MKoleksi.java 
 * Deskripsi : Program utama untuk menguji class Teman dan Piaraan
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 09/05/2026  
 */

public class MKoleksi {
    public static void main(String[] args) {
        Teman cihuygeng = new Teman();
        
        cihuygeng.addNama("Budi");
        cihuygeng.addNama("Andi");
        cihuygeng.addNama("Siti");
        cihuygeng.addNama("Andi");
        cihuygeng.showTeman();
        System.out.println("Jumlah elemen (nbelm): " + cihuygeng.getNbelm());
        System.out.println("Berapa kali nama Andi muncul? " + cihuygeng.countNama("Andi"));

        System.out.println("\nMengganti data");
        cihuygeng.setNama(0, "Budiman");
        cihuygeng.gantiNama("Andi", "Andika");
        cihuygeng.showTeman();

        System.out.println("\nMenghapus data");
        System.out.println("Apakah Siti ada di list? " + cihuygeng.isMember("Siti"));
        cihuygeng.delNama("Siti");
        cihuygeng.showTeman();
        System.out.println("Sisa elemen (nbelm): " + cihuygeng.getNbelm());



        Piaraan klinik = new Piaraan();

        Kucing2 garfield = new Kucing2(4.5);
        garfield.setNama("Garfield");
        Kucing2 oyen = new Kucing2(3.2);
        oyen.setNama("Oyen");
        Anjing2 snoopy = new Anjing2();
        snoopy.setNama("Snoopy");

        klinik.enqueueAnabul(garfield);
        klinik.enqueueAnabul(snoopy);
        klinik.enqueueAnabul(oyen);

        System.out.println("Total antrean: " + klinik.getNbelm() + " ekor");
        klinik.showAnabul();
        System.out.println();
        klinik.showJenisAnabul();

        System.out.println("\nAnalisis Kucing");
        System.out.println("Jumlah keluarga Kucing: " + klinik.countKucing() + " ekor");
        System.out.println("Total bobot Kucing: " + klinik.bobotKucing() + " kg");

        System.out.println("\nMemproses Antrean");
        System.out.println("Pasien pertama saat ini: " + klinik.getAnabul().getNama());
        Anabul2 selesai = klinik.dequeueAnabul();
        System.out.println("Pasien " + selesai.getNama() + " telah selesai diperiksa.");
        System.out.println("Sisa antrean sekarang: " + klinik.getNbelm() + " ekor");
        klinik.showAnabul();
    }
}

/*Renungan: Koleksi itu kyk upgrade wadah yang statis jadi bisa sesuai keiinginan 
jadi ngga harus mikirin size dari wadahnya. List itu fleksibel dan bebas nyomot dari indeks mana aja, 
kalo Queue, objek yang masuk paling awal harus diproses dan dikeluarin duluan (FIFO).*/