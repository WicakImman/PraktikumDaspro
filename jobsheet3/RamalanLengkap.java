import java.util.Scanner;
import java.util.Random;

public class RamalanLengkap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // Input
        System.out.print("Masukkan tanggal lahir (1-31): ");
        int tanggal = input.nextInt();
        input.nextLine(); // buang enter
        System.out.print("Masukkan bulan lahir (contoh: Januari): ");
        String bulan = input.nextLine().toLowerCase();

        String zodiak = "";

        // Tentukan zodiak
        switch (bulan) {
            case "januari":
                zodiak = (tanggal <= 19) ? "Capricorn" : "Aquarius";
                break;
            case "februari":
                zodiak = (tanggal <= 18) ? "Aquarius" : "Pisces";
                break;
            case "maret":
                zodiak = (tanggal <= 20) ? "Pisces" : "Aries";
                break;
            case "april":
                zodiak = (tanggal <= 19) ? "Aries" : "Taurus";
                break;
            case "mei":
                zodiak = (tanggal <= 20) ? "Taurus" : "Gemini";
                break;
            case "juni":
                zodiak = (tanggal <= 20) ? "Gemini" : "Cancer";
                break;
            case "juli":
                zodiak = (tanggal <= 22) ? "Cancer" : "Leo";
                break;
            case "agustus":
                zodiak = (tanggal <= 22) ? "Leo" : "Virgo";
                break;
            case "september":
                zodiak = (tanggal <= 22) ? "Virgo" : "Libra";
                break;
            case "oktober":
                zodiak = (tanggal <= 22) ? "Libra" : "Scorpio";
                break;
            case "november":
                zodiak = (tanggal <= 21) ? "Scorpio" : "Sagitarius";
                break;
            case "desember":
                zodiak = (tanggal <= 21) ? "Sagitarius" : "Capricorn";
                break;
            default:
                zodiak = "Bulan tidak valid!";
                break;
        }

        // Ramalan acak
        String[] rezeki = {
            "Rezekimu lancar minggu ini!", 
            "Akan ada peluang kerja bagus.", 
            "Sedikit boros, hati-hati keuangan.", 
            "Dapat rejeki tak terduga dari teman."
        };

        String[] cinta = {
            "Cinta bersemi, ada yang mendekatimu.", 
            "Hati-hati, ada godaan cinta segitiga.", 
            "Pasanganmu makin sayang sama kamu.", 
            "Jomblo? Tenang, jodohmu sudah dekat."
        };

        String[] masaDepan = {
            "Masa depanmu cerah penuh kesuksesan.", 
            "Akan ada tantangan besar, tapi kamu kuat.", 
            "Kesempatan besar datang dari orang tak terduga.", 
            "Belajarlah lebih giat, masa depanmu gemilang."
        };

        // “Mati kapan” dibuat random humoris
        int umur = 40 + random.nextInt(61); // 40–100 tahun
        int tahunMati = 2025 + random.nextInt(80);

        // Output
        System.out.println("\n=== HASIL RAMALAN ===");
        System.out.println("Zodiak kamu: " + zodiak);
        System.out.println("Ramalan Rezeki : " + rezeki[random.nextInt(rezeki.length)]);
        System.out.println("Ramalan Cinta  : " + cinta[random.nextInt(cinta.length)]);
        System.out.println("Ramalan Masa Depan : " + masaDepan[random.nextInt(masaDepan.length)]);
        System.out.println("Perkiraan Umur : " + umur + " tahun");
        System.out.println("Diperkirakan meninggal sekitar tahun: " + tahunMati);

        input.close();
    }
}
