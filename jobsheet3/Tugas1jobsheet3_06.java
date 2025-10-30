import java.util.Scanner;
public class Tugas1jobsheet3_06 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
    int hargamotor, uangmuka, Sisa;
    double bunga = 0.01, cicilan, bungaBln, lamaCicilan;

    System.out.println("Masukan Harga Motor");
    hargamotor = sc.nextInt();
    System.out.println("Masukan Uang Muka");
    uangmuka = sc.nextInt();
    System.out.println("Lama Cicilan");
    lamaCicilan = sc.nextDouble();
    Sisa = hargamotor - uangmuka ;
    bungaBln = Sisa * bunga;
    cicilan = Sisa / lamaCicilan + bungaBln ;
    System.out.println("Cicilan perbulan yang harus dibayar adalah: " +cicilan);
sc.close();
    }
}
