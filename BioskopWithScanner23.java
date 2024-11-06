import java.util.Scanner;
public class BioskopWithScanner23 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom, pilihan;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("-------------------");
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.println("-------------------");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // membersihkan buffer

            switch (pilihan) {
                case 1:
                    // Menu 1: Input data penonton
                    while (true) {
                        System.out.print("Masukkan nama: ");
                        nama = sc.nextLine();

                        // Validasi baris dan kolom
                        while (true) {
                            System.out.print("Masukkan baris (1-4): ");
                            baris = sc.nextInt();
                            System.out.print("Masukkan kolom (1-2): ");
                            kolom = sc.nextInt();
                            sc.nextLine(); // membersihkan buffer

                            if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                                System.out.println("Nomor baris atau kolom tidak tersedia. Silakan masukkan lagi.");
                            } else if (penonton[baris - 1][kolom - 1] != null) {
                                System.out.println("Kursi sudah terisi. Silakan pilih kursi lain.");
                            } else {
                                break;
                            }
                        }

                        // Menyimpan nama di posisi yang dipilih
                        penonton[baris - 1][kolom - 1] = nama;

                        System.out.print("Input penonton lainnya? (y/n): ");
                        next = sc.nextLine();
                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;

                case 2:
                    // Menu 2: Tampilkan daftar penonton
                    System.out.println("-------------------");
                    System.out.println("Daftar Penonton");
                    System.out.println("-------------------");
                    for (int i = 0; i < penonton.length; i++) {
                        System.out.print("Penonton pada baris ke- " + (i + 1) + " : ");
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                System.out.print("***");
                            } else {
                                System.out.print(penonton[i][j]);
                            }
                            if (j < penonton[i].length - 1) {
                                System.out.print(", ");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    // Menu 3: Exit
                    System.out.println("Keluar dari program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang tersedia.");
            }
        }
    }
}

        
        