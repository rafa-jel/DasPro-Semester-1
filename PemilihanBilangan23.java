import java.util.Scanner;
public class PemilihanBilangan23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan angka : ");
        int angka = input.nextInt();
        String hasil;

        hasil = (angka % 2 == 0) ? "Bilangan genap" : "Bilangan ganjil";
        System.out.println(angka + " adalah " + hasil);
         
        }

    }
