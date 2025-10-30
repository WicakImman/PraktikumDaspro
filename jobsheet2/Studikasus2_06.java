public class Studikasus2_06 {
    public static void main (String[] args) {
        int panjangTanah=100, lebarTanah=50, luasTanah;
        double diameterLingkaran=2, jariJari, luasLingkaran;
        int panjangSisi=2, luasPersegi, jmlkolam=2;
        double luas2Kolam, luasSisa;

        // Tanah
        luasTanah = panjangTanah * lebarTanah;
        // Lingkaran
        jariJari = diameterLingkaran/2;
        luasLingkaran = 3.14 * (jariJari * jariJari) * jmlkolam;
        // Persegi
        luasPersegi = panjangSisi * panjangSisi;

        luas2Kolam = luasLingkaran + luasPersegi;
        luasSisa = luasTanah - luas2Kolam;

        System.out.println("Luas tanah yang bisa ditanami rumput " + luasSisa + " meter");
    }
}