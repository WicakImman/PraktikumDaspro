import java.util.Scanner;

public class Studikasus1_dinamis_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gaji_pokok;
        int jumlah_anak;
        int tunjangan_per_anak;
        float persen_pensiun;

        System.out.println("Masukkan gaji pokok");
        gaji_pokok = sc.nextInt();
        System.out.println("Masukkan jumlah anak");
        jumlah_anak = sc.nextInt();
        System.out.println("masukkan tunjagan per anak");
        tunjangan_per_anak = sc.nextInt();
        System.out.println("Masukkan persen_pensiun");
        persen_pensiun = sc.nextFloat();

        int tunjangan_anak = jumlah_anak * tunjangan_per_anak;
        int potongan_pensiun = Math.round(persen_pensiun / 100 * gaji_pokok);
        int gaji_kotor = gaji_pokok + tunjangan_anak;
        int gaji_bersih = gaji_kotor - potongan_pensiun;

        System.out.println("Perhitungan gaji Bu Jesi");
        System.out.println("Tunjangan anak = " + tunjangan_anak);
        System.out.println("Potongan pensiun = " + potongan_pensiun);
        System.out.println("Gaji kotor = " + gaji_kotor);
        System.out.println("Gaji bersih = " + gaji_bersih);
sc.close();
    }
}