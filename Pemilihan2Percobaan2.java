import java.util.Scanner;
public class Pemilihan2Percobaan2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String menu, member, qris;
        int jumlah_beli, pilihan_menu;
        double total_bayar, diskon = 1, harga = 0, potongan_qris = 1000;

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
            System.out.print("Apakah membayar dengan Qris? (y/n) ");
            qris = sc.nextLine();
            if (qris.equalsIgnoreCase("y")) {
                System.out.println("Besar diskon = 10 %");
                System.out.println("Potongan harga dengan Qris = 1000");
                total_bayar = harga - (harga * diskon) - potongan_qris;
                System.out.println("Harga bayar setelah diskon dan potongan qris = " + total_bayar );
            }
            else {
                System.out.println("Besar diskon = 10 %");
                total_bayar = harga - (harga * diskon);
                System.out.println("Harga bayar setelah diskon = " + total_bayar );
            }
            
            
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
        System.out.print("Apakah membayar dengan Qris? (y/n) ");
            qris = sc.nextLine();
            if (qris.equalsIgnoreCase("y")) {
                System.out.println("Potongan harga dengan Qris = 1000");
                total_bayar = harga - potongan_qris;
                System.out.println("Harga bayar setelah potongan qris = " + total_bayar );
            }
            else {
                total_bayar = harga;
                System.out.println("Harga bayar = " + total_bayar );
            }
        

        
        
    }

    
}
