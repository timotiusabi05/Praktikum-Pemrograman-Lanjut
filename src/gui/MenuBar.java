package gui;

import javax.swing.*;

public class MenuBar extends JMenuBar {

    public MenuBar() {
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu help = new JMenu("Help");

        JMenuItem open = new JMenuItem("Open");
        JMenuItem close = new JMenuItem("Close");
        JMenuItem quit = new JMenuItem("Quit");
        JMenuItem about = new JMenuItem("About");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");
        JMenuItem cut = new JMenuItem("Cut");

        file.add(open);
        file.add(close);
        file.add(quit);
        edit.add(copy);
        edit.add(paste);
        edit.add(cut);
        help.add(about);


        add(file);
        add(edit);
        add(help);
    }
}
