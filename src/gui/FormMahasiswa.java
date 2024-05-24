package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormMahasiswa extends JPanel {

    private JTextField nama, tanggalLahir, noRegistrasi, noTelepon, email;
    private JTextArea alamat;
    private JButton submitButton;

    public FormMahasiswa() {
        setLayout(null);

        JLabel lblnama = new JLabel("Nama Lengkap:");
        JLabel lbltglLahir = new JLabel("Tanggal Lahir:");
        JLabel lblpendaftaran = new JLabel("Nomor Pendaftaran:");
        JLabel lbltelepon = new JLabel("No. Telp:");
        JLabel lblalamat = new JLabel("Alamat:");
        JLabel lblemail = new JLabel("E-mail:");

        nama = new JTextField();
        tanggalLahir = new JTextField();
        noRegistrasi = new JTextField();
        noTelepon = new JTextField();
        email = new JTextField();
        alamat = new JTextArea(3, 20);
        alamat.setLineWrap(true);
        alamat.setWrapStyleWord(true);
        JScrollPane addressScrollPane = new JScrollPane(alamat);
        submitButton = new JButton("Submit");

        lblnama.setBounds(10, 10, 120, 30);
        nama.setBounds(140, 10, 320, 30);

        lbltglLahir.setBounds(10, 50, 120, 30);
        tanggalLahir.setBounds(140, 50, 320, 30);

        lblpendaftaran.setBounds(10, 90, 120, 30);
        noRegistrasi.setBounds(140, 90, 320, 30);

        lbltelepon.setBounds(10, 130, 120, 30);
        noTelepon.setBounds(140, 130, 320, 30);

        lblalamat.setBounds(10, 170, 120, 30);
        addressScrollPane.setBounds(140, 170, 320, 60);

        lblemail.setBounds(10, 240, 120, 30);
        email.setBounds(140, 240, 320, 30);

        submitButton.setBounds(360, 280, 100, 30);

        add(lblnama);
        add(nama);
        add(lbltglLahir);
        add(tanggalLahir);
        add(lblpendaftaran);
        add(noRegistrasi);
        add(lbltelepon);
        add(noTelepon);
        add(lblalamat);
        add(addressScrollPane);
        add(lblemail);
        add(email);
        add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                handleSubmit();
            }
        });
    }

    private void handleSubmit() {
        if (konfirmasiForm()) {
            int response = JOptionPane.showConfirmDialog(this,
                    "Apakah Anda yakin data yang Anda isi sudah benar?",
                    "Konfirmasi",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);

            if (response == JOptionPane.YES_OPTION) {
                showData();
            }
        }
    }

    private boolean konfirmasiForm() {
        if (nama.getText().isEmpty() || tanggalLahir.getText().isEmpty() || noRegistrasi.getText().isEmpty()
                || noTelepon.getText().isEmpty() || alamat.getText().isEmpty() || email.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Semua kolom harus diisi.",
                    "Peringatan",
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    private void showData() {
        new TampilanData(nama.getText(), tanggalLahir.getText(), noRegistrasi.getText(),
                noTelepon.getText(), alamat.getText(), email.getText());
    }
}