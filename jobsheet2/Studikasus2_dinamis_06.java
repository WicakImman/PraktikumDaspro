import java.util.Scanner;
public class Studikasus2_dinamis_06 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int panjangTanah, lebarTanah, luasTanah;
        double diameterLingkaran, jariJari, luasLingkaran;
        int panjangSisi, luasPersegi;
        double luas2Kolam, luasSisa;

        System.out.print("Masukkan panjang tanah");
        panjangTanah = sc.nextInt();
        System.out.print("Masukkan lebar tanah");
        lebarTanah = sc.nextInt();
        System.out.print("Masukkan diameter lingkaran");
        diameterLingkaran = sc.nextInt();
        System.out.print("Masukkan panjang sisi persegi");
        panjangSisi = sc.nextInt();

        // Tanah
        luasTanah = panjangTanah * lebarTanah;
        // Lingkaran
        jariJari = diameterLingkaran/2;
        luasLingkaran = 3.14 * (jariJari * jariJari);
        // Persegi
        luasPersegi = panjangSisi * panjangSisi;

        luas2Kolam = luasLingkaran + luasPersegi;
        luasSisa = luasTanah - luas2Kolam;

        System.out.println("Luas tanah yang bisa ditanami rumput " + luasSisa + " meter");
        sc.close();
    }
}