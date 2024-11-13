import java.util.Scanner;
public class SistemInventaris23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input jumlah jenis barang dan lokasi
        System.out.print("Masukkan jumlah jenis barang: ");
        int jumlahBarang = sc.nextInt();
        System.out.print("Masukkan jumlah lokasi penyimpanan: ");
        int jumlahLokasi = sc.nextInt();
        sc.nextLine();

        // Inisialisasi array untuk stok dan nama kota
        int[][] stok = new int[jumlahBarang][jumlahLokasi];
        String[] namaKota = new String[jumlahLokasi];

        // Input nama kota
        System.out.println("Masukkan nama kota untuk setiap lokasi:");
        for (int i = 0; i < jumlahLokasi; i++) {
            System.out.print("Kota untuk lokasi " + (i + 1) + ": ");
            namaKota[i] = sc.nextLine();
        }

        // Menu untuk mengisi stok
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Isi Stok Barang");
            System.out.println("2. Tampilkan Tabel Stok");
            System.out.println("3. Tampilkan Total Stok Per Jenis Barang");
            System.out.println("4. Tampilkan Lokasi dengan Stok Terbanyak");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    isiStok(stok, sc);
                    break;
                case 2:
                    tampilkanTabelStok(stok, namaKota);
                    break;
                case 3:
                    tampilkanTotalStok(stok);
                    break;
                case 4:
                    lokasiStokTerbanyak(stok, namaKota);
                    break;
                case 5:
                    System.out.println("Keluar dari sistem.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        }
    }

    // Fungsi untuk mengisi stok barang
    public static void isiStok(int[][] stok, Scanner sc) {
        System.out.print("Jenis barang (0-" + (stok.length - 1) + "): ");
        int jenisBarang = sc.nextInt();
        System.out.print("Lokasi (0-" + (stok[0].length - 1) + "): ");
        int lokasi = sc.nextInt();
        System.out.print("Tambah stok: ");
        int jumlahStok = sc.nextInt();

        if (jenisBarang >= 0 && jenisBarang < stok.length && lokasi >= 0 && lokasi < stok[0].length) {
            stok[jenisBarang][lokasi] += jumlahStok;
            System.out.println("Stok berhasil ditambahkan.");
        } else {
            System.out.println("Indeks jenis barang atau lokasi tidak valid.");
        }
    }

    // Fungsi untuk menampilkan tabel stok
    public static void tampilkanTabelStok(int[][] stok, String[] namaKota) {
        System.out.println("\nTabel Stok Gudang:");
        System.out.print("           ");
        for (String kota : namaKota) {
            System.out.printf("%-12s", kota);
        }
        System.out.println();
        for (int i = 0; i < stok.length; i++) {
            System.out.print("Barang " + (i + 1) + ":   ");
            for (int j = 0; j < stok[i].length; j++) {
                System.out.printf("%-12d", stok[i][j]);
            }
            System.out.println();
        }
    }

    // Fungsi untuk menghitung total stok per jenis barang
    public static void tampilkanTotalStok(int[][] stok) {
        System.out.println("\nTotal stok untuk setiap jenis barang:");
        for (int i = 0; i < stok.length; i++) {
            int total = 0;
            for (int j = 0; j < stok[i].length; j++) {
                total += stok[i][j];
            }
            System.out.println("Jenis barang ke-" + (i + 1) + ": " + total);
        }
    }

    // Fungsi untuk menemukan lokasi dengan stok terbanyak
    public static void lokasiStokTerbanyak(int[][] stok, String[] namaKota) {
        System.out.println("\nLokasi dengan stok terbanyak untuk setiap jenis barang:");
        for (int i = 0; i < stok.length; i++) {
            int maxStok = 0;
            int lokasiMax = -1;
            for (int j = 0; j < stok[i].length; j++) {
                if (stok[i][j] > maxStok) {
                    maxStok = stok[i][j];
                    lokasiMax = j;
                }
            }
            if (lokasiMax != -1) {
                System.out.println("Jenis barang ke-" + (i + 1) + ": " + namaKota[lokasiMax]);
            } else {
                System.out.println("Jenis barang ke-" + (i + 1) + ": Tidak ada stok");
            }
        }
    }
}


