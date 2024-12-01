import javax.swing.JOptionPane;

public class FotocopyKrisna {
    public static void main(String[] args) {
        int menu = Integer.parseInt(JOptionPane
                .showInputDialog("""
                        === FOTOCOPY KRISNA ===
                        Selamat datang di FOTOCOPY KRISNA. Silahkan memilih layanan
                        1. ATK (Alat Tulis Kantor)
                        2. Print
                        3. Fotocopy
                        4. Laminating
                        5. Cetak Foto
                        6. Selesai

                        Masukkan Pilihan Anda (masukkan angka antara 1-6): """));
        do {
            switch (menu) {
                case 1:
                    int atk = Integer.parseInt(JOptionPane
                            .showInputDialog("""
                                    === FOTOCOPY KRISNA ===
                                    ATK yang tersedia di sini meliputi:
                                    1. Pensil
                                    2. Pulpen
                                    3. Penghapus
                                    4. Correction Tape
                                    5. Penggaris

                                    Masukkan Pilihan Anda (masukan angka antara 1-5): """));
                    switch (atk) {
                        case 1:
                            int pensil = Integer.parseInt(JOptionPane
                                    .showInputDialog("""
                                            === FOTOCOPY KRISNA ===
                                            Silahkan memilih:
                                            1. 1 buah pensil (Rp 2.000)
                                            2. 1 pack pensil isi 12 (Rp 10.000)

                                            Masukkan Pilihan Anda (masukan angka antara 1-2): """));
                            switch (pensil) {
                                case 1:
                                    int totalP = Integer.parseInt(JOptionPane
                                            .showInputDialog("""
                                                    === FOTOCOPY KRISNA ===
                                                    Anda ingin membeli berapa buah pensil? """));
                                    JOptionPane.showMessageDialog(null, "Pesanan anda telah ditambahkan!");
                                    break;
                                case 2:
                                    int packP = Integer.parseInt(JOptionPane
                                            .showInputDialog("""
                                                    === FOTOCOPY KRISNA ===
                                                    Anda ingin membeli berapa pack pensil? """));
                                    JOptionPane.showMessageDialog(null, "Pesanan anda telah ditambahkan!");
                                    break;
                                default:
                                    break;
                            }
                            break;
                        case 2:
                            int pulpen = Integer.parseInt(JOptionPane
                                    .showInputDialog("""
                                            === FOTOCOPY KRISNA ===
                                            Silahkan memilih:
                                            1. 1 buah pulpen (Rp 2.500)
                                            2. 1 pack pulpen isi 12 (Rp 14.000)

                                            Masukkan Pilihan Anda (masukan angka antara 1-2): """));
                            break;
                        default:
                            break;
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Pilihan Anda Tidak Valid! Mohon Coba Lagi");
                    return;
            }
        } while (menu != 6);
    }
}