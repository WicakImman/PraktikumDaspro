import java.util.Scanner;

public class Tugas2jobsheet3_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jarak perjalanan (km): ");
        int jarak = sc.nextInt();

        int bensin = jarak / 2;
        int biaya = bensin * 10000;

        System.out.println("Biaya bensin yang diperlukan: Rp. " + biaya);
        sc.close();
    }
}
