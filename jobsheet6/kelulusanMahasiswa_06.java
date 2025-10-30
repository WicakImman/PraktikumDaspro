package jobsheet6;
import java.util.Scanner;
public class kelulusanMahasiswa_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();

    // Input Nama dan NIM
        System.out.println("Masukan Nama Mahasiswa:");
        String nama = sc.nextLine();
        System.out.println("Masukan NIM Mahasiswa:");
        String nim = sc.nextLine();

    // Input Untuk Algoritma dan Pemrograman
        System.out.println("===Mata Kuliah Algoritma dan Pemrograman===");
        System.out.println("Masukan Nilai UTS:");
        double utsAlgoritma = sc.nextDouble();
        System.out.println("Masukan Nilai UAS:");
        double uasAlgoritma = sc.nextDouble();
        System.out.println("Masukan Nilai Tugas:");
        double tugasAlgoritma = sc.nextDouble();    
        
    // Input Untuk Struktur Data
        System.out.println("===Mata Kuliah Struktur Data===");
        System.out.println("Masukan Nilai UTS:");
        double utsStruktur = sc.nextDouble();
        System.out.println("Masukan Nilai UAS:");
        double uasStruktur = sc.nextDouble();
        System.out.println("Masukan Nilai Tugas:");
        double tugasStruktur = sc.nextDouble();

    // Perhitungan Nilai Akhir
        double nilaiAkhirAlgoritma = (utsAlgoritma * 0.3) + (uasAlgoritma * 0.4) + (tugasAlgoritma * 0.3);
        double nilaiAkhirStrukturData = (utsStrukturData * 0.3) + (uasStrukturData * 0.4) + (tugasStrukturData * 0.3)

    // Konversi Nilai Huruf dan Status Kelulusan -Algoritma
        String nilaiHurufAlgoritma;
        String statusAlgoritma;

    if (nilaiAkhir >= 60) {
        status = "Lulus";
    } else {
        status = "Tidak Lulus";

            if (nilaiAkhirAlgoritma >= 85) {
            nilaiHurufAlgoritma = "A";
         } else {
            if (nilaiAkhirAlgoritma >= 80 && nilaiAkhirAlgoritma < 100) {
                nilaiHurufAlgoritma = "A";
            } else {
             if (nilaiAkhirAlgoritma >= 73 && nilaiAkhirAlgoritma < 80) {
                nilaiHurufAlgoritma = "B+";
            } else {
             if (nilaiAkhirAlgoritma >= 65 && nilaiAkhirAlgoritma < 73) {
                nilaiHurufAlgoritma = "B";
            } else {
             if (nilaiAkhirAlgoritma >= 50 && nilaiAkhirAlgoritma < 60) {
            nilaiHurufAlgoritma = "C";
            } else {
             if (nilaiAkhirAlgoritma >= 39 && nilaiAkhirAlgoritma < 50) {
                nilaiHurufAlgoritma = "D";
            } else {
                nilaiHurufAlgoritma = "E";
            }
            }
            }
            }
            }
            }
    // Konversi Nilai Huruf dan Status Kelulusan -Struktur Data
        if (nilaiAkhir >= 60) {
        status = "Lulus";
    } else {
        status = "Tidak Lulus";

                if (nilaiAkhirAlgoritma >= 85) {
                nilaiHurufAlgoritma = "A";
            } else {
                if (nilaiAkhirAlgoritma >= 80 && nilaiAkhirAlgoritma < 100) {
                    nilaiHurufAlgoritma = "A";
                } else {
                    if (nilaiAkhirAlgoritma >= 73 && nilaiAkhirAlgoritma < 80) {
                        nilaiHurufAlgoritma = "B+";
                } else {
                    if (nilaiAkhirAlgoritma >= 65 && nilaiAkhirAlgoritma < 73) {
                            nilaiHurufAlgoritma = "B";
                } else {
                    if (nilaiAkhirAlgoritma >= 50 && nilaiAkhirAlgoritma < 60) {
                        nilaiHurufAlgoritma = "C";
                } else {
                    if (nilaiAkhirAlgoritma >= 39 && nilaiAkhirAlgoritma < 50) {
                        nilaiHurufAlgoritma = "D";
                } else {
                        nilaiHurufAlgoritma = "E";
                }
                }
                }
                }
                }
                
          // Perhitungan Rata-rata dan Status Semester (NESTED IF)
        double rataRata = (nilaiAkhirAlgoritma + nilaiAkhirStrukturData) / 2;
        String statusSemester;
        
        // Nested If untuk menentukan status semester
        if (statusAlgoritma.equals("LULUS") && statusStrukturData.equals("LULUS")) {
            // Kedua mata kuliah lulus, cek rata-rata
            if (rataRata >= 70) {
                statusSemester = "LULUS";
            } else {
                statusSemester = "TIDAK LULUS";
            }
        } else {
            // Salah satu atau kedua mata kuliah tidak lulus
            statusSemester = "TIDAK LULUS";
        }
        
        // Output Hasil
        System.out.println("\n========================================");
        System.out.println("         HASIL KELULUSAN MAHASISWA      ");
        System.out.println("========================================");
        
        System.out.println("\nALGORITMA DAN PEMROGRAMAN:");
        System.out.println("Nilai Akhir: " + String.format("%.2f", nilaiAkhirAlgoritma));
        System.out.println("Nilai Huruf: " + nilaiHurufAlgoritma);
        System.out.println("Status: " + statusAlgoritma);
        
        System.out.println("\nSTRUKTUR DATA:");
        System.out.println("Nilai Akhir: " + String.format("%.2f", nilaiAkhirStrukturData));
        System.out.println("Nilai Huruf: " + nilaiHurufStrukturData);
        System.out.println("Status: " + statusStrukturData);
        
        System.out.println("\n----------------------------------------");
        System.out.println("Rata-rata Nilai Akhir: " + String.format("%.2f", rataRata));
        System.out.println("STATUS SEMESTER: " + statusSemester);
        System.out.println("========================================");
        
    }
}
}