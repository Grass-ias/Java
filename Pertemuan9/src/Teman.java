/* Nama File : Teman.java 
 * Deskripsi : Mengelola koleksi list nama teman
 * Pembuat   : Ferdy Prasetya Putra/24060124140145
 * Tanggal   : 05/05/2026  
 */

import java.util.ArrayList;

public class Teman {
    private int nbelm;
    private ArrayList<String> Lnama;

    public Teman() {
        this.Lnama = new ArrayList<>();
        this.nbelm = 0;
    }

    public int getNbelm() {
        return this.nbelm;
    }

    public String getNama(int indeks) {
        if (indeks >= 0 && indeks < nbelm) {
            return Lnama.get(indeks);
        }
        return "-";
    }

    public void setNama(int indeks, String nama) {
        if (indeks >= 0 && indeks < nbelm) {
            Lnama.set(indeks, nama);
        } else {
            System.out.println("Indeks tidak valid");
        }
    }

    public void addNama(String nama) {
        Lnama.add(nbelm, nama);
        nbelm++;
    }

    public void delNama(String nama) {
        int i = 0;
        while (i < nbelm) {
            if (getNama(i) == nama) { 
                for (int j = i; j < nbelm - 1; j++) {
                    setNama(j, getNama(j + 1));
                }
                nbelm--;
            } else {
                i++;
            }
        }
    }

    public boolean isMember(String nama) {
        for (int i = 0; i < nbelm; i++) {
            if (getNama(i) == nama) {
                return true;
            }
        }
        return false;
    }

    public void gantiNama(String nama, String namabaru) {
        boolean ketemu = false;
        for (int i = 0; i < nbelm; i++) {
            if (getNama(i) == nama) {
                setNama(i, namabaru);
                ketemu = true;
            }
        }
        if (!ketemu) {
            System.out.println("Nama tidak ditemukan");
        }
    }

    public int countNama(String nama) {
        int count = 0;
        for (int i = 0; i < nbelm; i++) {
            if (getNama(i) == nama) {
                count++;
            }
        }
        return count;
    }

    public void showTeman() {
        System.out.println("Daftar Teman:");
        for (int i = 0; i < nbelm; i++) {
            System.out.println((i + 1) + ". " + Lnama.get(i));
        }
    }
}