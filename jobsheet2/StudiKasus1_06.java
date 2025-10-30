public class StudiKasus1_06 {
    public static void main(String[] args) {

        int gaji_pokok = 3_000_000;
        int jumlah_anak = 3;
        int tunjangan_per_anak = 150_000;
        float persen_pensiun = 0.05f;

        int tunjangan_anak = jumlah_anak * tunjangan_per_anak;
        int potongan_pensiun = Math.round(persen_pensiun * gaji_pokok);
        int gaji_kotor = gaji_pokok + tunjangan_anak;
        int gaji_bersih = gaji_kotor - potongan_pensiun;

        System.out.println("Perhitungan gaji Bu Jesi");
        System.out.println("Tunjangan anak = " + tunjangan_anak);
        System.out.println("Potongan pensiun = " + potongan_pensiun);
        System.out.println("Gaji kotor = " + gaji_kotor);
        System.out.println("Gaji bersih = " + gaji_bersih);
        
        

    }
}