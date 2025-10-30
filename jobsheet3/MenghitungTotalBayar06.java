import java.util.Scanner;

public class MenghitungTotalBayar06{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double harga;
        double potongan, jml_bayar, diskon=0.15;

        System.out.println("Masukan");
        harga=sc.nextInt();
        potongan=diskon*harga;
        jml_bayar=harga-potongan;
        System.out.println("Jumlah yang harus dibayar Rp" +jml_bayar);
        sc.close();
    }
}
