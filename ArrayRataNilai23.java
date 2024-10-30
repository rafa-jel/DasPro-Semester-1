import java.util.Scanner;
public class ArrayRataNilai23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        int jumlahLulus = 0, jumlahTdkLulus = 0;
        double totalLulus = 0, totalTdkLulus = 0, rata2Lulus = 0, rata2TdkLulus = 0;

        System.out.print("Masukan jumlah mahasiswa = ");//input jumlah mahasiswa
        int jumlahMhs = sc.nextInt();

        for (int i = 1; i <= jumlahMhs; i++){ //Input nilai nilai mahasiswa
            System.out.print("Masukkan nilai mahasiswa ke - " + i + " = ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 1; i <= jumlahMhs; i++) {//penjumlahan total mahasiswa yang lulus dan tidak lulus
            if (nilaiMhs[i] > 70) {
                totalLulus++;
            }
            else {
                totalTdkLulus++;
            }
            
        }
        for (int i = 1; i <= jumlahMhs; i++) {// penjumlahan nilai
            if (nilaiMhs[i] > 70) {
                jumlahLulus += nilaiMhs[i];
            }
            else {
                jumlahTdkLulus += nilaiMhs[i];
            }
        }

        rata2Lulus = jumlahLulus / totalLulus;//proses mencari rata rata
        rata2TdkLulus = jumlahTdkLulus / totalTdkLulus;
        System.out.println("Rata - rata nilai mahasiswa yang lulus = " + rata2Lulus);
        System.out.println("Rata - rata nilai mahasiswa yang tidak lulus = " + rata2TdkLulus);
    }
}
