package jobsheet5;

import java.util.Scanner;

public class wifiKampus06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jenis pengguna (Dosen atau Mahasiswa): ");
        String jenisPengguna = input.nextLine();

        if (jenisPengguna.equalsIgnoreCase("Dosen")) {
            System.out.println("Akses WiFi diberikan (dosen)");
        } 
        else if (jenisPengguna.equalsIgnoreCase("Mahasiswa")) {
            System.out.print("Masukkan jumlah SKS yang diambil: ");
            int sks = input.nextInt();

            if (sks >= 12) {
                System.out.println("Akses WiFi diberikan (mahasiswa aktif)");
            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12");
            }
        } 
        else {
            System.out.println("Akses ditolak, bukan mahasiswa maupun dosen");
        }

        input.close();
    }
}

