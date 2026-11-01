package project_oops;

import javax.swing.*;

public class loginFrame extends JFrame {
    public loginFrame() {
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Airport Management System - Login");
        setSize(400, 300);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        JLabel lbl = new JLabel("Welcome to Airport Management System");
        panel.add(lbl);
        add(panel);
    }
}
