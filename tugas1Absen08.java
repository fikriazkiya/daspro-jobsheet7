import java.util.Scanner;
public class tugas1Absen08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int totalTiket = 0, totalHarga = 0;

        System.out.print("Masukkan jumlah tiket yang dibeli (ketik 0 untuk selesai): ");
        int jumlahTiket = sc.nextInt();

        while (jumlahTiket != 0) {
            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid (negatif), silakan input ulang.");
            } else {
                int hargaAwal = jumlahTiket * hargaTiket;
                int diskon;

                if (jumlahTiket > 10) {
                    diskon = hargaAwal * 15 / 100;
                } else if (jumlahTiket > 4) {
                    diskon = hargaAwal * 10 / 100;
                } else {
                    diskon = 0;
                }

                int hargaAkhir = hargaAwal - diskon;
                System.out.println("Harga awal : Rp" + hargaAwal);
                System.out.println("Diskon     : Rp" + diskon);
                System.out.println("Harga akhir: Rp" + hargaAkhir);

                totalTiket += jumlahTiket;
                totalHarga += hargaAkhir;
            }

            System.out.print("Masukkan jumlah tiket yang dibeli (ketik 0 untuk selesai): ");
            jumlahTiket = sc.nextInt();
        }

        System.out.println("Total tiket terjual : " + totalTiket);
        System.out.println("Total penjualan     : Rp" + totalHarga);
        sc.close();
    }
}