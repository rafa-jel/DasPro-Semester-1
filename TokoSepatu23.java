import java.util.Scanner;
public class TokoSepatu23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String merk, kategori;
        int ukuran, harga=0;

        
        System.err.println("----------------------------");
        System.out.println("       Toko Sepatu");
        System.err.println("----------------------------");
        System.out.print("Merk Sepatu = ");
        merk = sc.nextLine().toLowerCase();
        System.out.print("Kategori Sepatu = ");
        kategori = sc.nextLine().toLowerCase();
        System.out.print("Ukuran Sepatu = ");
        ukuran = sc.nextInt();


        if(merk.equalsIgnoreCase("converse")){
            if(kategori.equalsIgnoreCase("slip on")){
                if(ukuran>=36 && ukuran<=40){
                    harga=800000;
                }else{
                    System.out.println("invalid");
                }
            }else if(kategori.equalsIgnoreCase("high top")){
                if(ukuran>=40 && ukuran<=44){
                    harga=1200000;
                }else{
                    System.out.println("invalid");
                }
            }else{
                System.out.println("Kategori tidak valid!!!");
            }
        }else if(merk.equalsIgnoreCase("sketcher")){
            if(kategori.equalsIgnoreCase("woman")){
                if(ukuran>=36 && ukuran<=41){
                    harga=1000000;
                }else{
                    System.out.println("invalid");
                }
            }else if(kategori.equalsIgnoreCase("man")){
                if(ukuran>=41 && ukuran<=44){
                    harga=1800000;
                }else{
                    System.out.println("invalid");
                }
            }else{
                System.out.println("invalid kategori");
            }
        }else if(merk.equalsIgnoreCase("nike")){
            if(kategori.equalsIgnoreCase("kids")){
                if(ukuran>=36 && ukuran<=40){
                    harga=750000;
                }else{
                    System.out.println("invalid");
                }
            }else if(kategori.equalsIgnoreCase("adult")){
                if(ukuran>=40 && ukuran<=44){
                    harga=1500000;
                }else{
                    System.out.println("invalid");
                }
            }else{
                System.out.println("invalid kategori");
            }
        }else{
            System.out.println("invalid merk");
        }

        
        System.err.println("============================");
        System.out.println("     Total Pembayaran");
        System.err.println("============================");
        System.out.println("Merk Sepatu = " + merk);
        System.out.println("Kategori = " + kategori);
        System.out.println("Ukuran = " + ukuran);
        System.out.println("Total Bayar adalah = Rp " + harga);
    }
    
}
