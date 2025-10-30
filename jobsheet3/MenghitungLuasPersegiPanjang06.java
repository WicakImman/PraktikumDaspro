
import java.util.Scanner;
public class MenghitungLuasPersegiPanjang06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int panjang;
        int lebar;
        int luas;
System.out.println("masukan panjang");
       panjang=sc.nextInt();
System.out.println("masukann lebar");
       lebar=sc.nextInt();
       luas=panjang*lebar;
       System.out.println("Luas persegi adalah=" +luas);

       sc.close();
    }
}
