package BBMS;

import java.awt.Color;
import java.awt.*;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class donateblood extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField typetext;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    donateblood frame = new donateblood();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public donateblood() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 90, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        typetext = new JTextField();
        typetext.setFont(new Font("Tahoma", Font.PLAIN, 22));
        typetext.setBounds(100, 150, 190, 40);
        contentPane.add(typetext);
        typetext.setColumns(10);
        JButton btnNewButton = new JButton("Donate");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 39));

        btnNewButton.setBackground(UIManager.getColor("Button.disabledForeground"));
        //btnNewButton.setForeground(Color.WHITE);
        btnNewButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                    String type = typetext.getText().toString();

                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms", "root", "shashank");


                    Statement sta = connection.createStatement();

                    ResultSet rs = sta.executeQuery("select * from available_blood where type='" + type + "'");
                    rs.next();
                    int no = rs.getInt(3) + 1;

                    PreparedStatement stm = connection.prepareStatement("update available_blood set quantity='" + no + "' where type='" + type + "'");
                    stm.executeUpdate();
                    JOptionPane.showMessageDialog(btnNewButton, "THANK YOU FOR DONATING BLOOD!!!");

                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton.setBounds(100, 300, 200, 64);
        btnNewButton.setBackground(Color.WHITE);
        contentPane.add(btnNewButton);
        JLabel lblbloodgroup = new JLabel("Enter Blood Group");
        lblbloodgroup.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblbloodgroup.setBounds(100, 50, 200, 36);
        contentPane.add(lblbloodgroup);

        JButton btnNewButton1 = new JButton("Back");
        btnNewButton1.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton1.setBounds(100, 380, 200, 64);
        btnNewButton1.setBackground(Color.white);
        //btnNewButton1.setForeground(Color.RED);
        btnNewButton1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
                donorpg ah = new donorpg();
                ah.setTitle("start");
                ah.setVisible(true);
            }
        });
        contentPane.add(btnNewButton1);
        ImageIcon j1 = new ImageIcon(ClassLoader.getSystemResource("icons/bg2.jpg"));
        Image j2 = j1.getImage().getScaledInstance(1014,597,Image.SCALE_DEFAULT);
        ImageIcon j3 = new ImageIcon(j2);
        JLabel l = new JLabel(j3);
        l.setBounds(0,0,1014,597);
        add(l);

    }


}

