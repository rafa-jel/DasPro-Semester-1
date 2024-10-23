import java.util.Scanner;
/**
 * Star23
 */
public class Star23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan nilai N = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.print("*");
        }
    }
}