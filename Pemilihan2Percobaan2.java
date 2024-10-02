import java.util.Scanner;
public class Pemilihan2Percobaan2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String menu, member;
        int jumlah_beli, pilihan_menu;
        double total_bayar, diskon = 1, harga = 0;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Rice Bowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. paket Bundling (Rice bowl + ice tea)");
        System.out.println("---------------------------------------");
        System.out.print("Masukan angka dari menu yang dipilih = ");
        pilihan_menu = sc.nextInt();
        sc.nextLine();
        System.out.print("Apakah punya member? (y/n) ");
        member = sc.nextLine();
        System.out.println("---------------------------------------");

        //operasi jika memiliki member
        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Diskon = 10 %");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            }
            else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
            }
            else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            }
            else {
                System.out.println("Input menu salah, masukan dengan benar");
            }
            total_bayar = harga - (harga * diskon);
            System.out.println("Total harga setelah diskon = " + total_bayar);
        }
        //operasi jika tidak memiliki member
        else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            }
            else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
            }
            else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            }
            else {
                System.out.println("Input menu salah, masukan dengan benar");
            }
        }
        else {
            System.out.println("Member tidak valid");
        }
        total_bayar = harga;
        System.out.println("Total bayar = " + total_bayar);

        
        
    }

    
}
