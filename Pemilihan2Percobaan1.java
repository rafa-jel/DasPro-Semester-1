import java.util.Scanner;
public class Pemilihan2Percobaan1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tahun;
        
        System.out.print("Masukan tahun = ");
        tahun = sc.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0) {
                System.out.println(tahun + " merupakan Tahun Kabisat");
                } else {
                    System.out.println(tahun + " Bukan tahun kabisat");
                }
        } else {
            System.out.println(tahun + " Bukan tahun kabisat");
        }

    }

    
}