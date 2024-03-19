package BBMS;

import java.awt.Color;
import java.awt.*;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class first extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    first frame = new first();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public first(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 90, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        JLabel lblname = new JLabel("E-VEINS");
        //lblUsername.setBackground(Color.BLACK);
        //lblUsername.setForeground(Color.RED);
        lblname.setFont(new Font("Tahoma", Font.BOLD, 60));
        lblname.setBounds(200, 100, 293, 61);
        contentPane.add(lblname);
        JLabel lblname1 = new JLabel("Blood Bank Management System");
        //lblUsername.setBackground(Color.BLACK);
        //lblUsername.setForeground(Color.RED);
        lblname1.setFont(new Font("Tahoma", Font.PLAIN, 22));
        lblname1.setBounds(150, 150, 393, 61);
        contentPane.add(lblname1);
        JLabel lblname2 = new JLabel("'Be a reason for someone’s heartbeat.'\n");
        //lblUsername.setBackground(Color.BLACK);
        //lblUsername.setForeground(Color.RED);
        lblname2.setFont(new Font("Tahoma", Font.ITALIC, 22));
        lblname2.setBounds(100, 250, 393, 61);
        contentPane.add(lblname2);
        JButton btnNewButton = new JButton("start");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton.setBounds(200, 400, 200, 64);
        //btnNewButton.setBackground(UIManager.getColor("Button.disabledForeground"));
        btnNewButton.setBackground(Color.WHITE);
        //btnNewButton.setForeground(Color.WHITE);
        btnNewButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
                start ah = new start();
                ah.setTitle("Donor");
                ah.setVisible(true);
            }
        });
        contentPane.add(btnNewButton);
        ImageIcon j1 = new ImageIcon(ClassLoader.getSystemResource("icons/bg2.jpg"));
        Image j2 = j1.getImage().getScaledInstance(1014,597,Image.SCALE_DEFAULT);
        ImageIcon j3 = new ImageIcon(j2);
        JLabel l = new JLabel(j3);
        l.setBounds(0,0,1014,597);
        add(l);


    }
}