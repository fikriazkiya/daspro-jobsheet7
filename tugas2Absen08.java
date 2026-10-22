import java.util.Scanner;
public class tugas2Absen08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, totalParkir = 0;
        
        do {
            System.out.print("Masukkan Jenis Kendaraan 1 atau 2: "); // 1. Mobil, 2. Motor
            jenis = sc.nextInt();
            
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan Durasi Parkir (dalam jam): ");
                durasi = sc.nextInt();
                
                if (jenis == 1) {
                    totalParkir += durasi * 3000;
                } else if (jenis == 2) {
                    totalParkir += durasi * 2000;
                }
            }
        } while (jenis !=0);
        System.out.println("Total Pembayaran parkir: Rp " + totalParkir);
        sc.close();
    }
}
