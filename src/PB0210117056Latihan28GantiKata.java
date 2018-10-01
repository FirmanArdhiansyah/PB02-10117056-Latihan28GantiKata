
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nama     : Firman Ardhiansyah
 *         Kelas    : If-2 (PB02)
 *         NIM      : 10117056
 * Deskripsi    : Program ini berisi perintah untuk mengganti kata
 */
public class PB0210117056Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String kalimatAwal;
        String kalimatBaru;
        String gantiKata;
        String jadiKata;
        Scanner scn = new Scanner(System.in);

        System.out.println("====Program Ganti Kata====\n");
        System.out.print("Masukkan Kalimat : ");
        kalimatAwal = scn.nextLine();
        System.out.print("Ganti Kata : ");
        gantiKata = scn.next();
        System.out.print("Menjadi Kata : ");
        jadiKata = scn.next();
        kalimatBaru = (kalimatAwal).replaceAll(gantiKata, jadiKata);
        System.out.println("\n====Hasil Formatting====");
        System.out.println("Kalimat Awal : " + kalimatAwal);
        System.out.println("Kalimat Baru : " + kalimatBaru);
    }

}
