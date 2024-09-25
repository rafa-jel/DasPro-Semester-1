import java.util.Scanner;
public class LatihanFlowchart {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int umur;

        System.out.print("Masukan Umur : ");
        umur = sc.nextInt();

        if (umur <0) {
            System.out.println("Input tidak valid!");
        }
        else if (umur >= 0 && umur <= 12) {
            System.out.println("Umur dikategorikan sebagai anak - anak");
        }
        else if (umur >= 13 && umur <= 19) {
            System.out.println("Umur dikategorikan sebagai remaja");
        }
        else if (umur >= 20 && umur <= 64) {
            System.out.println("Umur dikategorikan sebagai dewasa");
        }
        else {
            System.out.println("Umur dikategorikan sebagai lansia");
        }
    }
    
}
