package BBMS;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class login2 extends JFrame {

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
                    login2 frame = new login2();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public login2() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 90, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Admin");
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 46));
        lblNewLabel.setBounds(423, 13, 273, 93);
        contentPane.add(lblNewLabel);

        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.PLAIN, 32));
        textField.setBounds(481, 118, 281, 55);
        contentPane.add(textField);
        textField.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 32));
        passwordField.setBounds(481, 250, 281, 55);
        contentPane.add(passwordField);

        JLabel lblUsername = new JLabel("Username");
        //lblUsername.setBackground(Color.BLACK);
        //lblUsername.setForeground(Color.RED);
        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 31));
        lblUsername.setBounds(250, 118, 193, 41);
        contentPane.add(lblUsername);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setForeground(Color.black);
        //lblPassword.setBackground(Color.RED);
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 31));
        lblPassword.setBounds(250, 250, 193, 41);
        contentPane.add(lblPassword);



        btnNewButton = new JButton("Login");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 26));
        btnNewButton.setBounds(545, 356, 162, 73);
        btnNewButton.setBackground(Color.white);
        btnNewButton.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) {
            String userValue = textField.getText();
            int user=userValue.length();//get user entered username from the textField1
            String passValue = passwordField.getText();
            int pass=passValue.length();//get user entered pasword from the textField2
            if (user== 0) {
                JOptionPane.showMessageDialog(btnNewButton, "Enter username");
            }
            if (pass== 0) {
                JOptionPane.showMessageDialog(btnNewButton, "Enter password");
            }

            //check whether the credentials are authentic or not
            if (userValue.equals("rachana") && passValue.equals("rane")) {  //if authentic, navigate user to a new page

                //create instance of the NewPage
                adminpg page = new adminpg();

                //make page visible to the user
                page.setVisible(true);

                //create a welcome label and set it to the new page
                JLabel wel_label = new JLabel("Welcome: "+userValue);
                page.getContentPane().add(wel_label);
            }
            else{
                //show error message
                System.out.println("Please enter valid username and password");
            }
        }
        });

        //  String userName = textField.getText();
        //String password = passwordField.getText();
        //try {
        //  Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo",
        //        "root", "root");

        //PreparedStatement st = (PreparedStatement) connection
        //       .prepareStatement("Select name, password from student where name=? and password=?");

//                    st.setString(1, userName);
        //                  st.setString(2, password);
        //                ResultSet rs = st.executeQuery();
        //              if (rs.next()) {
        //                dispose();
        //              UserHome ah = new UserHome(userName);
        //            ah.setTitle("Welcome");
        //          ah.setVisible(true);
        //        JOptionPane.showMessageDialog(btnNewButton, "You have successfully logged in");
        //  } else {
        //    JOptionPane.showMessageDialog(btnNewButton, "Wrong Username & Password");
        //}
        // } catch (SQLException sqlException) {
        //   sqlException.printStackTrace();
        //}
        // }
        //});

        contentPane.add(btnNewButton);
        JButton btnNewButton1 = new JButton("Back");
        btnNewButton1.setFont(new Font("Tahoma", Font.PLAIN, 26));
        btnNewButton1.setBackground(Color.white);
        btnNewButton1.setBounds(245, 356, 162, 73);
        btnNewButton1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
                start ah = new start();
                ah.setTitle("start");
                ah.setVisible(true);
            }
        });
        contentPane.add(btnNewButton1);

        label = new JLabel("");
        label.setBounds(0, 0, 1008, 562);
        contentPane.add(label);
        ImageIcon j1 = new ImageIcon(ClassLoader.getSystemResource("icons/bg2.jpg"));
        Image j2 = j1.getImage().getScaledInstance(1014,597,Image.SCALE_DEFAULT);
        ImageIcon j3 = new ImageIcon(j2);
        JLabel l = new JLabel(j3);
        l.setBounds(0,0,1014,597);
        add(l);
    }
}