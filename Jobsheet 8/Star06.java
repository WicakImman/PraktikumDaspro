import java.util.Scanner;
public class Star06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nilai n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            System.err.print("*");
        }
        sc.close();
    }
}