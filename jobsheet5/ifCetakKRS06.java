package jobsheet5;
import java.util.Scanner;
public class ifCetakKRS06 {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

   System.out.println("---Cetak KRS SIAKAD---");
   System.out.print("Apakah UKT sudah lunas? (true/false): ");
   Boolean uktLunas = sc.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran UKT Terverifikasi");
            System.out.println("Silahakan cetak KRS dan minta tanga tangan DPA");
        }

    }   
    }

