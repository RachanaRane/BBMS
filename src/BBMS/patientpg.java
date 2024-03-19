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


public class patientpg extends JFrame {

    private static final long serialVersionUID = 1L;
    private JTextField textField;
    private JPasswordField passwordField;
    private JButton btnNewButton;
    private JLabel label;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    patientpg frame = new patientpg();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }

    public patientpg() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 90, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        JButton btnNewButton = new JButton("View Profile");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton.setBounds(200, 100, 200, 64);
        btnNewButton.setBackground(Color.WHITE);
        //btnNewButton.setBackground(UIManager.getColor("Button.disabledForeground"));
        btnNewButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                patientdata ah = new patientdata();
                ah.setTitle("Patient Data");
                ah.setVisible(true);
            }
        });
        contentPane.add(btnNewButton);
        JButton btnNewButton1 = new JButton("Get Blood");
        btnNewButton1.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton1.setBounds(200, 200, 200, 64);
        btnNewButton1.setBackground(Color.white);
        //btnNewButton1.setBackground(UIManager.getColor("Button.disabledForeground"));
        btnNewButton1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
                getblood ah = new getblood();
                ah.setTitle("Get Blood");
                ah.setVisible(true);
            }
        });
        contentPane.add(btnNewButton1);
        JButton btnNewButton4 = new JButton("Request Admin");
        btnNewButton4.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton4.setBounds(750, 30, 200, 64);
        //btnNewButton4.setBackground(UIManager.getColor("Button.disabledForeground"));
        btnNewButton4.setBackground(Color.white);
        btnNewButton4.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                request ah = new request();
                ah.setTitle("request");
                ah.setVisible(true);
            }
        });
        contentPane.add(btnNewButton4);

        JButton btnNewButton2 = new JButton("Back");
        btnNewButton2.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton2.setBounds(200, 300, 200, 64);
        btnNewButton2.setBackground(Color.white);
        btnNewButton2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
                login1 ah = new login1();
                ah.setTitle("start");
                ah.setVisible(true);
            }
        });
        contentPane.add(btnNewButton2);
        ImageIcon j1 = new ImageIcon(ClassLoader.getSystemResource("icons/bg2.jpg"));
        Image j2 = j1.getImage().getScaledInstance(1014,597,Image.SCALE_DEFAULT);
        ImageIcon j3 = new ImageIcon(j2);
        JLabel l = new JLabel(j3);
        l.setBounds(0,0,1014,597);
        add(l);
    }
}
