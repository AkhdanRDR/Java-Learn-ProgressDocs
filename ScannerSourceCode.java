import java.util.Scanner;

public class ScannerSourceCode {
    public static void main(String[] args) {
        System.out.println("=== APOTEK SEHAT ===");
        System.out.println("=== Layanan dan Jasa 1 Kali ===");
        System.out.println("1. Tes Kesehatan Rp 150.000");
        System.out.println("2. Akupuntur Rp 100.000");
        System.out.println("3. Bekam Rp 75.000");
        System.out.println("4. Refleksi Rp 50.000");
        System.out.println("5. Dokter Umum Rp 100.000");
        System.out.println("===============================");
        System.out.println("");
        System.out.println("=== Obat ===");
        System.out.println("1. Vitamin B Complex Rp 25.000");
        System.out.println("2. Panadol Extra Rp 20.000");
        System.out.println("3. Enervonce 500mg Rp 50.000");
        System.out.println("4. Vitacimin C 500mg Rp 50.000");
        System.out.println("5. Paractamol Rp 10.000");
        System.out.println("============");
        System.out.println("");

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Usia: ");
        int usia = input.nextInt();

        System.out.println("=== Layanan ===");
        System.out.print("Tes Kesehatan: ");
        int tes = 150000 * input.nextInt();
        System.out.print("Akupuntur: ");
        int aku = 100000 * input.nextInt();
        System.out.print("Bekam: ");
        int bek = 75000 * input.nextInt();
        System.out.print("Refleksi: ");
        int ref = 50000 * input.nextInt();
        System.out.print("Dokter Umum: ");
        int dok = 100000 * input.nextInt();
        System.out.println("=== Obat ===");
        System.out.print("Vitamin B Complex: ");
        int vitb = 25000 * input.nextInt();
        System.out.print("Panadol Extra: ");
        int pan = 20000 * input.nextInt();
        System.out.print("Enervonce 500mg: ");
        int ene = 50000 * input.nextInt();
        System.out.print("Vitacimin C 500mg: ");
        int vitc = 50000 * input.nextInt();
        System.out.print("Paracetamol: ");
        int par = 10000 * input.nextInt();

        int total = tes + aku + bek + ref + dok + vitb + pan + ene + vitc + par;

        System.out.println("");
        System.out.println("Jumlah Pembayaran: " + total);
        System.out.println("");

        System.out.println("Masukkan Uang Pembayaran: ");
        int uang = input.nextInt();

        int kembalian = uang - total;

        System.out.println("");
        System.out.println("=== APOTEK SEHAT ===");
        System.out.println("Selamat Datang " + nama + " di APOTEK SEHAT");
        System.out.println("Usia: " + usia);
        System.out.println("=== Layanan dan Jasa 1 Kali ===");
        System.out.println("1. Tes Kesehatan: " + tes);
        System.out.println("2. Akupuntur: " + aku);
        System.out.println("3. Bekam: " + bek);
        System.out.println("4. Refleksi: " + ref);
        System.out.println("5. Dokter Umum: " + dok);
        System.out.println("===============================");
        System.out.println("");
        System.out.println("=== Obat ===");
        System.out.println("1. Vitamin B Complex: " + vitb);
        System.out.println("2. Panadol Extra: " + pan);
        System.out.println("3. Enervonce 500mg: " + ene);
        System.out.println("4. Vitacimin C 500mg: " + vitc);
        System.out.println("5. Paractamol: " + pan);
        System.out.println("============");
        System.out.println("");
        System.out.println("Total Pembayaran: " + total);
        System.out.println("Kembalian: " + kembalian);

        input.close();
    }
}
