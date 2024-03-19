package BBMS;
import java.awt.Color;
import java.awt.*;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class start extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    start frame = new start();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public start(){
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(300, 90, 1014, 597);
            setResizable(false);
            contentPane = new JPanel();
            contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
            setContentPane(contentPane);
            contentPane.setLayout(null);
        JButton btnNewButton = new JButton("Login as Donor");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton.setBounds(200, 50, 200, 64);
        //btnNewButton.setBackground(UIManager.getColor("Button.disabledForeground"));
        btnNewButton.setBackground(Color.WHITE);
        //btnNewButton.setForeground(Color.WHITE);
        btnNewButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
                login ah = new login();
                ah.setTitle("Donor");
                ah.setVisible(true);
            }
        });
        contentPane.add(btnNewButton);
        JButton btnNewButton1 = new JButton("Login as Patient");
        btnNewButton1.setFont(new Font("Tahoma", Font.PLAIN, 22 ));
        btnNewButton1.setBounds(200, 150, 200, 64);
        btnNewButton1.setBackground(UIManager.getColor("Button.disabledForeground"));
        btnNewButton1.setBackground(Color.WHITE);
        //btnNewButton1.setForeground(Color.WHITE);
        btnNewButton1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
                login1 ah = new login1();
                ah.setTitle("patient");
                ah.setVisible(true);
            }
        });
        contentPane.add(btnNewButton1);
        JButton btnNewButton2 = new JButton("Login as Admin");
        btnNewButton2.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton2.setBounds(200, 250, 200, 64);
        btnNewButton2.setBackground(UIManager.getColor("Button.disabledForeground"));
        btnNewButton2.setBackground(Color.WHITE);
        //btnNewButton2.setForeground(Color.white);
        btnNewButton2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
                login2 ah = new login2();
                ah.setTitle("admin");
                ah.setVisible(true);
            }
        });
        contentPane.add(btnNewButton2);
        JButton btnNewButton3 = new JButton("New Donor");
        btnNewButton3.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton3.setBounds(200, 350, 200, 64);
        btnNewButton3.setBackground(UIManager.getColor("Button.disabledForeground"));
        btnNewButton3.setBackground(Color.WHITE);
        //btnNewButton3.setForeground(Color.WH);
        btnNewButton3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
                Donationform ah = new Donationform();
                ah.setTitle("Donationform");
                ah.setVisible(true);
            }
        });
        contentPane.add(btnNewButton3);

        JButton btnNewButton4 = new JButton("New Patient");
        btnNewButton4.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton4.setBounds(200, 450, 200, 64);
        btnNewButton4.setBackground(UIManager.getColor("Button.disabledForeground"));
        btnNewButton4.setBackground(Color.white);
        //btnNewButton4.setForeground(Color.WHITE);
        btnNewButton4.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
                patientRegister ah = new  patientRegister();
                ah.setTitle("Donationform");
                ah.setVisible(true);
            }
        });
        contentPane.add(btnNewButton4);

        ImageIcon j1 = new ImageIcon(ClassLoader.getSystemResource("icons/bg2.jpg"));
        Image j2 = j1.getImage().getScaledInstance(1014,597,Image.SCALE_DEFAULT);
        ImageIcon j3 = new ImageIcon(j2);
        JLabel l = new JLabel(j3);
        l.setBounds(0,0,1014,597);
        add(l);


     }
}







