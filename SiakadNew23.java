import java.util.Scanner;
public class SiakadNew23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = sc.nextInt();

        int[][] nilai = new int[jumlahMahasiswa][jumlahMatkul];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Input nilai mahasiswa ke- " + (i+1));
            double totalPerSiswa = 0;
            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + " : ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata - rata = " + totalPerSiswa / nilai[i].length);
        }

        System.out.println("\n ================================");
        System.out.println("Rata - rata nilai setiap mata kuliah : ");

        for (int j = 0; j < jumlahMatkul; j++) {
            double totalPerMatkul = 0;
            for (int i = 0; i < jumlahMahasiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata kuliah " + (j + 1) + " : " + totalPerMatkul / jumlahMahasiswa);
        }
    }
}
