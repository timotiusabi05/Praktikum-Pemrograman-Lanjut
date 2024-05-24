package gui;

import javax.swing.*;
import java.awt.*;

public class TampilanData extends JFrame {

    public TampilanData(String nama, String tanggalLahir, String noRegistrasi, String noTelepon, String alamat, String email) {
        setTitle("Data Pendaftaran");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel titleLabel = new JLabel("Data Mahasiswa", SwingConstants.CENTER);
        mainPanel.add(titleLabel, BorderLayout.NORTH);

        JPanel dataPanel = new JPanel();
        dataPanel.setLayout(new BoxLayout(dataPanel, BoxLayout.Y_AXIS));
        dataPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK),
                BorderFactory.createEmptyBorder(10, 10, 10, 10)
        ));

        dataPanel.add(new JLabel("Nama: " + nama));
        dataPanel.add(new JLabel("Tanggal Lahir: " + tanggalLahir));
        dataPanel.add(new JLabel("Nomor Pendaftaran: " + noRegistrasi));
        dataPanel.add(new JLabel("No. Telp: " + noTelepon));
        dataPanel.add(new JLabel("Alamat: " + alamat));
        dataPanel.add(new JLabel("E-mail: " + email));

        JScrollPane scrollPane = new JScrollPane(dataPanel);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        add(mainPanel);
        setVisible(true);
    }
}
