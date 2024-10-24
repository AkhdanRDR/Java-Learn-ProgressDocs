import javax.swing.JOptionPane;

public class JOptionPaneSourceCode {
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog("Masukkan Nama: ");
        String hp = JOptionPane.showInputDialog("Masukkan No Hp: ");
        String kamar = JOptionPane
                .showInputDialog("=== GRAND MIAMI HOTEL === \n=== Harga Kamar/Malam (Termasuk Pajak & Sarapan) ===" +
                        "\n1. Deluxe Twin Rp 600.000" + "\n2. Deluxe King Rp 600.000"
                        + "\n3. Deluxe Premiere Twin With Pool Access Rp 950.000" +
                        "\n4. Deluxe Premiere King Rp 950.000" + "\n5. Miami Suite Rp 1.350.000"
                        + "\n\nMasukkan Pilihan Kamar: ");

        int uang = Integer.parseInt(JOptionPane
                .showInputDialog("=== GRAND MIAMI HOTEL === \n=== Harga Kamar/Malam (Termasuk Pajak & Sarapan) ===" +
                        "\n1. Deluxe Twin Rp 600.000" + "\n2. Deluxe King Rp 600.000"
                        + "\n3. Deluxe Premiere Twin With Pool Access Rp 950.000" +
                        "\n4. Deluxe Premiere King Rp 950.000" + "\n5. Miami Suite Rp 1.350.000"
                        + "\n\nMasukkan Uang Pembayaran: "));

        int malam = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Malam: "));
        int total = uang * malam;

        JOptionPane.showMessageDialog(null, "Jumlah Pembayaran: " + total);
        int bayar = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Bayar: "));
        int kembalian = bayar - total;

        JOptionPane.showMessageDialog(null, "=== GRAND MIAMI HOTEL === \n Selamat Datang " + nama +
                " di GRAND MIAMI HOTEL \nNo Hp: " + hp + "\nPilihan Kamar: " + kamar + "\nJumlah Malam: " + malam +
                "\nTotal Pembayaran: " + total + "\nKembalian: " + kembalian + "\n=========================");
    }
}
