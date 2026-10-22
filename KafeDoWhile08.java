import java.util.Scanner;
public class KafeDoWhile08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int hargaKopi = 12000;
        int hargaTeh = 7000;
        int hargaRoti = 20000;
        int jumlahKopi = 0;
        int totalHarga = 0;
        String namaPelanggan;

        do {
            System.out.print("Masukkan nama pelanggan (keitk 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                break;
            }
            System.out.print("Jumlah Kopi: ");
            int kopi = sc.nextInt();
            System.out.print("Jumlah Teh: ");
            int teh = sc.nextInt();
            System.out.print("Jumlah Roti: ");
            int roti = sc.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total harga untuk: Rp" + totalHarga);
            sc.nextLine();
        } while (true);

        System.out.println("Total kopi yang dipesan: " + jumlahKopi);
        System.out.println("Total harga: Rp" + totalHarga);
        sc.close();
    }
}
