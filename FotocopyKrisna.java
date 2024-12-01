import javax.swing.JOptionPane;

public class FotocopyKrisna {
    public static void main(String[] args) {
        double totalHarga = 0;
        double hargaBarang;
        int jumlahBarang;
        double diskon;
        StringBuilder list = new StringBuilder();
        boolean BayarCukup = false;
        int jilid;

        int menu;
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("=== FOTOCOPY KRISNA ===" +
                    "\nSelamat datang di FOTOCOPY KRISNA. Silahkan memilih layanan" +
                    "\n1. ATK (Alat Tulis Kantor) \n2. Print \n3. Fotocopy \n4. Laminating \n5. Selesai"
                    + "\n\nMasukkan Pilihan Anda (masukkan angka antara 1-5): "));
            switch (menu) {
                case 1:
                    int atk = Integer.parseInt(JOptionPane.showInputDialog("=== FOTOCOPY KRISNA ===" +
                            "\nATK yang tersedia di sini meliputi: \n1. Pensil \n2. Pulpen \n3. Penghapus" +
                            "\n4. Correction Tape \n5. Penggaris \n\nMasukkan Pilihan Anda (masukkan angka antara 1-5): "));
                    switch (atk) {
                        case 1:
                            int pensil = Integer.parseInt(JOptionPane.showInputDialog("=== FOTOCOPY KRISNA ===" +
                                    "\nSilahkan memilih: \n1. 1 buah pensil (Rp 2.000) \n2. 1 pack pensil isi 12 (Rp 10.000)"
                                    +
                                    "\n\nMasukkan Pilihan Anda (masukkan angka antara 1-2): "));
                            switch (pensil) {
                                case 1:
                                    jumlahBarang = Integer
                                            .parseInt(JOptionPane.showInputDialog("=== FOTOCOPY KRISNA ===" +
                                                    "\nAnda ingin membeli berapa buah pensil? "));
                                    hargaBarang = 2000 * jumlahBarang;
                                    totalHarga += hargaBarang;
                                    list.append("\nPensil (x" + jumlahBarang + "): Rp " + hargaBarang);
                                    JOptionPane.showMessageDialog(null, "Pesanan anda telah ditambahkan!");
                                    break;
                                case 2:
                                    jumlahBarang = Integer
                                            .parseInt(JOptionPane.showInputDialog("=== FOTOCOPY KRISNA ===" +
                                                    "\nAnda ingin membeli berapa pack pensil? "));
                                    hargaBarang = 10000 * jumlahBarang;
                                    totalHarga += hargaBarang;
                                    list.append("\nPensil Pack (x" + jumlahBarang + "): Rp " + hargaBarang);
                                    JOptionPane.showMessageDialog(null, "Pesanan anda telah ditambahkan!");
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Pilihan Anda Tidak Valid! Mohon Coba Lagi");
                                    break;
                            }
                            break;
                        case 2:
                            int pulpen = Integer.parseInt(JOptionPane.showInputDialog("=== FOTOCOPY KRISNA ===" +
                                    "Silahkan memilih: \n1. 1 buah pulpen (Rp 2.500) \n2. 1 pack pulpen isi 12 (Rp 14.000)"
                                    +
                                    "\n\nMasukkan Pilihan Anda (masukkan angka antara 1-2): "));
                            switch (pulpen) {
                                case 1:
                                    jumlahBarang = Integer
                                            .parseInt(JOptionPane.showInputDialog("=== FOTOCOPY KRISNA ===" +
                                                    "\nAnda ingin membeli berapa buah pulpen? "));
                                    hargaBarang = 2500 * jumlahBarang;
                                    totalHarga += hargaBarang;
                                    list.append("\nPulpen (x" + jumlahBarang + "): Rp " + hargaBarang);
                                    JOptionPane.showMessageDialog(null, "Pesanan anda telah ditambahkan!");
                                    break;
                                case 2:
                                    jumlahBarang = Integer
                                            .parseInt(JOptionPane.showInputDialog("=== FOTOCOPY KRISNA ===" +
                                                    "\nAnda ingin membeli berapa pack pulpen? "));
                                    hargaBarang = 14000 * jumlahBarang;
                                    totalHarga += hargaBarang;
                                    list.append("\nPulpen (x" + jumlahBarang + "): Rp " + hargaBarang);
                                    JOptionPane.showMessageDialog(null, "Pesanan anda telah ditambahkan!");
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Pilihan Anda Tidak Valid! Mohon Coba Lagi");
                                    break;
                            }
                            break;
                        case 3:
                            int penghapus = Integer.parseInt(JOptionPane.showInputDialog("=== FOTOCOPY KRISNA ===" +
                                    "\nSilahkan memilih: \n1. 1 buah penghapus (Rp 1.000) \n2. 1 pack penghapus isi 20 (Rp 15.000)"
                                    +
                                    "\n\nMasukkan Pilihan Anda (masukkan angka antara 1-2): "));
                            switch (penghapus) {
                                case 1:
                                    jumlahBarang = Integer
                                            .parseInt(JOptionPane.showInputDialog("=== FOTOCOPY KRISNA ===" +
                                                    "\nAnda ingin membeli berapa buah penghapus? "));
                                    hargaBarang = 1000 * jumlahBarang;
                                    totalHarga += hargaBarang;
                                    list.append("\nPenghapus (x" + jumlahBarang + "): Rp " + hargaBarang);
                                    JOptionPane.showMessageDialog(null, "Pesanan anda telah ditambahkan!");
                                    break;
                                case 2:
                                    jumlahBarang = Integer
                                            .parseInt(JOptionPane.showInputDialog("=== FOTOCOPY KRISNA ===" +
                                                    "\nAnda ingin membeli berapa pack penghapus? "));
                                    hargaBarang = 15000 * jumlahBarang;
                                    totalHarga += hargaBarang;
                                    list.append("\nPenghapus Pack (x" + jumlahBarang + "): Rp " + hargaBarang);
                                    JOptionPane.showMessageDialog(null, "Pesanan anda telah ditambahkan!");
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Pilihan Anda Tidak Valid! Mohon Coba Lagi");
                                    break;
                            }
                            break;
                        case 4:
                            jumlahBarang = Integer
                                    .parseInt(JOptionPane.showInputDialog("=== FOTOCOPY KRISNA ===" +
                                            "\nAnda ingin membeli berapa correction tape kertas? (Rp 5000) "));
                            hargaBarang = 5000 * jumlahBarang;
                            totalHarga += hargaBarang;
                            list.append("\nCorrection Tape (x" + jumlahBarang + "): Rp " + hargaBarang);
                            JOptionPane.showMessageDialog(null, "Pesanan anda telah ditambahkan!");
                            break;
                        case 5:
                            jumlahBarang = Integer
                                    .parseInt(JOptionPane.showInputDialog("=== FOTOCOPY KRISNA ===" +
                                            "\nAnda ingin membeli berapa penggaris 30cm? (Rp 3000) "));
                            hargaBarang = 3000 * jumlahBarang;
                            totalHarga += hargaBarang;
                            list.append("\nPenggaris (x" + jumlahBarang + "): Rp " + hargaBarang);
                            JOptionPane.showMessageDialog(null, "Pesanan anda telah ditambahkan!");
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    jumlahBarang = Integer.parseInt(JOptionPane.showInputDialog("=== FOTOCOPY KRISNA ===" +
                            "\nAnda ingin print berapa lembar? (Rp 1000/lembar)"));
                    hargaBarang = 1000 * jumlahBarang;
                    totalHarga += hargaBarang;
                    list.append("\nPrint (x" + jumlahBarang + "): Rp " + hargaBarang);
                    jilid = JOptionPane.showConfirmDialog(null,
                            "Apakah kamu ingin menambahkan jilid lakban? (Rp 3000)",
                            "Penjilidan", JOptionPane.YES_NO_OPTION);
                    if (jilid == JOptionPane.YES_OPTION) {
                        totalHarga += 3000;
                        list.append("\nTambah Penjilidan: Rp 3000.0");
                        JOptionPane.showMessageDialog(null, "Pesanan anda telah ditambahkan!");
                    }
                    break;
                case 3:
                    jumlahBarang = Integer.parseInt(JOptionPane.showInputDialog("=== FOTOCOPY KRISNA ===" +
                            "\nAnda ingin fotocopy berapa lembar? (Rp 500/lembar)"));
                    hargaBarang = 500 * jumlahBarang;
                    totalHarga += hargaBarang;
                    list.append("\nFotocopy (x" + jumlahBarang + "): Rp " + hargaBarang);
                    jilid = JOptionPane.showConfirmDialog(null,
                            "Apakah kamu ingin menambahkan jilid lakban? (Rp 3000)",
                            "Penjilidan", JOptionPane.YES_NO_OPTION);
                    if (jilid == JOptionPane.YES_OPTION) {
                        totalHarga += 3000;
                        list.append("\nTambah Penjilidan: Rp 3000.0");
                        JOptionPane.showMessageDialog(null, "Pesanan anda telah ditambahkan!");
                    }
                    JOptionPane.showMessageDialog(null, "Pesanan anda telah ditambahkan!");
                    break;
                case 4:
                    jumlahBarang = Integer.parseInt(JOptionPane.showInputDialog("=== FOTOCOPY KRISNA ===" +
                            "\nAnda ingin laminating berapa lembar? (Rp 3000/lembar)"));
                    hargaBarang = 3000 * jumlahBarang;
                    totalHarga += hargaBarang;
                    list.append("\nLaminating (x" + jumlahBarang + "): Rp " + hargaBarang);
                    JOptionPane.showMessageDialog(null, "Pesanan anda telah ditambahkan!");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "=== Struk Belanja ===" +
                            "\nTotal Belanja Anda: Rp " + totalHarga + list.toString());

                    if (totalHarga > 50000) {
                        diskon = 0.1 * totalHarga;
                        totalHarga -= diskon;
                        JOptionPane.showMessageDialog(null, "Diskon 10% diberikan: Rp " + diskon +
                                "\nHarga setelah diskon: Rp " + totalHarga);
                    }

                    while (!BayarCukup) {
                        double uangTunai = Double
                                .parseDouble(JOptionPane.showInputDialog("Masukkan jumlah uang tunai:"));

                        if (uangTunai >= totalHarga) {
                            double kembalian = uangTunai - totalHarga;
                            JOptionPane.showMessageDialog(null, "=== FOTOCOPY KRISNA ===" +
                                    "\nPembayaran berhasil! Kembalian Anda: Rp " + kembalian +
                                    "\nTerima kasih telah berbelanja di FOTOCOPY KRISNA");
                            BayarCukup = true;
                        } else {
                            JOptionPane.showMessageDialog(null, "Uang tunai tidak cukup. Silakan coba lagi.");
                        }
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Pilihan Anda Tidak Valid! Mohon Coba Lagi");
                    break;
            }
        } while (menu != 5);
    }
}