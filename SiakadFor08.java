import java.util.Scanner;
public class SiakadFor08{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double tiket ;
    for (int i = 1; i <= 10; i++) {
        System.out.print ("Masukkan nilai mahasiswa ke-" + i + ": ");
        nilai = sc.nextDouble();
        if (nilai > nilaiTertinggi){
            nilaiTertinggi = nilai;
        }
        if (nilai < nilaiTerendah) {
            nilaiTerendah = nilai;
        }
    }
    System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
    System.out.println("Nilai Terendah: " + nilaiTerendah);
    sc.close();
    }
}