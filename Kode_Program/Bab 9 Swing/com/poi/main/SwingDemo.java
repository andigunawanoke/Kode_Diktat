package com.poi.main;

import edu.maranatha.module1.view.PSRGameLogin;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class SwingDemo {
    private JButton button1;
    private JPanel panel1;
    private JTable table1;
    private JComboBox comboBox1;
    private JCheckBox checkBox1;

    public SwingDemo() {
        button1.addActionListener(e -> {

        });
        List<DaftarKata> kata = new ArrayList<>();
        DefaultComboBoxModel<DaftarKata> ComboModel = new DefaultComboBoxModel<>(DaftarKata.toArray(new DaftarKata[0]));
        comboBox1.setModel(ComboModel);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SwingDemo test run");
        frame.setContentPane(new SwingDemo().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
    }
}




