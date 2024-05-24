package gui;

import javax.swing.*;

public class DataMahasiswa extends JFrame {

    private FormMahasiswa formPanel;
    private MenuBar menuBarPanel;

    public DataMahasiswa() {
        setTitle("Form Pendaftaran Ulang Mahasiswa Baru");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        formPanel = new FormMahasiswa();
        menuBarPanel = new MenuBar();

        setJMenuBar(menuBarPanel);
        getContentPane().add(formPanel);

        setVisible(true);
    }

}
