import java.util.Scanner;
public class Siakad23 {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        String kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUts, nilaiUas, nilaiAkhir;
        System.out.print("Masukan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukan Kelas: ");
        kelas = sc.nextLine();
        System.out.print("Masukan nomer absen: ");
        absen = sc.nextByte();
        System.out.print("Masukan nilai kuis ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukan nilai tugas ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukan nilai UTS ");
        nilaiUts = sc.nextDouble();
        System.out.print("Masukan nilai UAS ");
        
        nilaiUas = sc.nextDouble();
        nilaiAkhir = (nilaiKuis * 0.20) + (nilaiTugas * 0.15) + (nilaiUts * 0.30) + (nilaiUas * 0.35);


        System.out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + " Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) 
        {
            System.out.println("Nilai huruf = A," + " Nilai setara = 4");
            System.out.println("Nilai sangat baik");
        }
        else if (nilaiAkhir > 73 && nilaiAkhir <= 80) 
        {
            System.out.println("Nilai huruf = B+," + " Nilai setara = 3.5");
            System.out.println("Nilai lebih dari baik");
        }
        else if (nilaiAkhir > 65 && nilaiAkhir <= 73) 
        {
            System.out.println("Nilai huruf = B," + " Nilai setara = 3");
            System.out.println("Nilai baik");
        }
        else if (nilaiAkhir > 60 && nilaiAkhir <= 65) 
        {
            System.out.println("Nilai huruf = C+," + " Nilai setara = 2.5");
            System.out.println("Nilai lebih dari cukup");
        }
        else if (nilaiAkhir > 50 && nilaiAkhir <= 60) 
        {
            System.out.println("Nilai huruf = C," + " Nilai setara = 2");
            System.out.println("Nilai cukup");
        }
        else if (nilaiAkhir > 39 && nilaiAkhir <= 50) 
        {
            System.out.println("Nilai huruf = D," + " Nilai setara = 1");
            System.out.println("Nilai kurang");
        }
        else if (nilaiAkhir <= 39) 
        {
            System.out.println("Nilai huruf = E," + " Nilai setara = 0");
            System.out.println("Nilai gagal");
        }
        else
        {
            System.out.println("Nilai invalid");
        }
        
       
        
    }
}