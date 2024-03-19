package BBMS;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;


public class adminpg extends JFrame {

    private static final long serialVersionUID = 1L;
    private JTextField textField;
    private JPasswordField passwordField;
    private JButton btnNewButton;
    private JLabel label;
    private JPanel contentPane;


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    adminpg frame = new adminpg();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }

    public adminpg() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 90, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        JButton btnNewButton = new JButton("Donors Data");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton.setBounds(200, 100, 200, 64);
        btnNewButton.setBackground(UIManager.getColor("Button.disabledForeground"));
        btnNewButton.setBackground(Color.white);
        btnNewButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                donorinfo ah = new donorinfo("STRING");
                ah.setTitle("donor");
                ah.setVisible(true);
            }
        });
        contentPane.add(btnNewButton);
        JButton btnNewButton1 = new JButton("Patients Data");
        btnNewButton1.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton1.setBounds(200, 200, 200, 64);
        btnNewButton1.setBackground(UIManager.getColor("Button.disabledForeground"));
        btnNewButton1.setBackground(Color.white);
        btnNewButton1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                patientinfo ah = new patientinfo("patient_info");
                ah.setTitle("donor");
                ah.setVisible(true);
            }
        });
        contentPane.add(btnNewButton1);

        JButton btnNewButton2 = new JButton("Blood Quantity");
        btnNewButton2.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton2.setBounds(200, 300, 200, 64);
        btnNewButton2.setBackground(Color.white);
        btnNewButton2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                trial ah = new trial("blood_quantity");

                ah.setTitle("start");
                ah.setVisible(true);
            }
        });
        contentPane.add(btnNewButton2);
        JButton btnNewButton3 = new JButton("Back");
        btnNewButton3.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton3.setBounds(200, 400, 200, 64);
        btnNewButton3.setBackground(Color.white);
        btnNewButton3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
                login2 ah = new login2();
                ah.setTitle("start");
                ah.setVisible(true);
            }
        });
        contentPane.add(btnNewButton3);
        ImageIcon j1 = new ImageIcon(ClassLoader.getSystemResource("icons/bg2.jpg"));
        Image j2 = j1.getImage().getScaledInstance(1014,597,Image.SCALE_DEFAULT);
        ImageIcon j3 = new ImageIcon(j2);
        JLabel l = new JLabel(j3);
        l.setBounds(0,0,1014,597);
        add(l);
        JButton btnNewButton4 = new JButton("Check Requests");
        btnNewButton4.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton4.setBounds(750, 30, 200, 64);
        btnNewButton4.setBackground(UIManager.getColor("Button.disabledForeground"));
        btnNewButton4.setBackground(Color.white);
        btnNewButton4.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                check ah = new check("requests");
                ah.setTitle("donor");
                ah.setVisible(true);
            }
        });
        contentPane.add(btnNewButton4);
    }
}

