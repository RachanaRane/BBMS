package BBMS;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class patientRegister extends JFrame {
    private static final long serialVersionUID = 1L;
    private final JTextField patientname;
    private JPanel contentPane;
    private JTextField patientid;

    private JTextField patientage;
    private JTextField bloodgroup;
    private JTextField anydisease;
    private JTextField no;
    private JTextField username;

    private JButton btnNewButton;
    private JPasswordField password;



    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    patientRegister frame = new patientRegister();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }



    public patientRegister() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\STDM.jpg"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 90, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewUserRegister = new JLabel("patient registration form");
        lblNewUserRegister.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        lblNewUserRegister.setBounds(362, 32, 325, 30);
        contentPane.add(lblNewUserRegister);

        JLabel lblpatientid = new JLabel("patient_id");
        lblpatientid.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblpatientid.setBounds(58, 72, 99, 23);
        contentPane.add(lblpatientid);

        JLabel lblpatient_name = new JLabel("patient_name");
        lblpatient_name.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblpatient_name.setBounds(58, 151, 300, 29);
        contentPane.add(lblpatient_name);

        JLabel lblpatient_age = new JLabel("patient_age");
        lblpatient_age.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblpatient_age.setBounds(550, 72, 300, 36);
        contentPane.add(lblpatient_age);

        JLabel lblbloodgroup = new JLabel("blood_group");
        lblbloodgroup.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblbloodgroup.setBounds(58, 243, 300, 36);
        contentPane.add(lblbloodgroup);

       /* JLabel lblanydisease = new JLabel("any_disease");
        lblanydisease.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblanydisease.setBounds(58, 320, 300, 36);
        contentPane.add(lblanydisease);*/

        JLabel lblphone_no = new JLabel("phone_no");
        lblphone_no.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblphone_no.setBounds(550, 151, 300, 36);
        contentPane.add(lblphone_no);
        JLabel lblusername = new JLabel("username");
        lblusername.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblusername.setBounds(550, 243, 200, 36);
        contentPane.add(lblusername);

        JLabel lblpassword = new JLabel("password");
        lblpassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblpassword.setBounds(550, 320, 200, 36);
        contentPane.add(lblpassword);


        /*JLabel lblbloodquantity = new JLabel("blood_quantity");
        lblbloodquantity.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblbloodquantity.setBounds(550, 243, 200, 36);
        contentPane.add(lblbloodquantity);*/

        patientid = new JTextField();
        patientid.setFont(new Font("Tahoma", Font.PLAIN, 32));
        patientid.setBounds(214, 72, 228, 50);
        contentPane.add(patientid);
        patientid.setColumns(10);

        patientname = new JTextField();
        patientname.setFont(new Font("Tahoma", Font.PLAIN, 32));
        patientname.setBounds(707, 72, 228, 50);
        contentPane.add(patientname);
        patientname.setColumns(10);

        patientage = new JTextField();

        patientage.setFont(new Font("Tahoma", Font.PLAIN, 32));
        patientage.setBounds(214, 151, 228, 50);
        contentPane.add(patientage);
        patientage.setColumns(10);

        bloodgroup = new JTextField();
        bloodgroup.setFont(new Font("Tahoma", Font.PLAIN, 32));
        bloodgroup.setBounds(707, 151, 228, 50);
        contentPane.add(bloodgroup);
        bloodgroup.setColumns(10);


        /*anydisease = new JTextField();
        anydisease.setFont(new Font("Tahoma", Font.PLAIN, 32));
        anydisease.setBounds(707, 235, 228, 50);
        contentPane.add(anydisease);
        anydisease.setColumns(10);*/

        no = new JTextField();
        no.setFont(new Font("Tahoma", Font.PLAIN, 32));
        no.setBounds(214, 243, 228, 50);
        contentPane.add(no);
        no.setColumns(10);
        username = new JTextField();
        username.setFont(new Font("Tahoma", Font.PLAIN, 32));
        username.setBounds(707, 235, 228, 50);
        contentPane.add(username);

        password = new JPasswordField();
        password.setFont(new Font("Tahoma", Font.PLAIN, 32));
        password.setBounds(707, 320, 228, 50);
        contentPane.add(password);
        password.setColumns(10);


       /* bloodquantity = new JTextField();
        bloodquantity.setFont(new Font("Tahoma", Font.PLAIN, 32));
        bloodquantity.setBounds(214, 320, 228, 50);
        contentPane.add(bloodquantity);*/

        btnNewButton = new JButton("Register");
        btnNewButton.setBackground(Color.white);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String  patient_id= patientid.getText();
                int id = patient_id.length();
                String patient_name = patientname.getText();
                int name = patient_name.length();
                String patient_age = patientage.getText();
                int age = patient_age.length();
                String blood_group = bloodgroup.getText();
                int type = blood_group.length();
                /*String any_disease = anydisease.getText();*/
                String phone_no = no.getText();
                int len = phone_no.length();
               /* String blood_quantity = bloodquantity.getText();*/
                String user_name = username.getText();
                int user =user_name.length();
                String pass_word = password.getText();
                int pass = pass_word.length();

                String msg = "" + patient_id;
                msg += " \n";
                if (len != 10) {
                    JOptionPane.showMessageDialog(btnNewButton, "Enter a valid mobile_no");
                }
                if (id==0) {
                    JOptionPane.showMessageDialog(btnNewButton, "Enter patient_id");
                }
                if (name==0) {
                    JOptionPane.showMessageDialog(btnNewButton, "Enter patient_name");
                }
                if (age ==0) {
                    JOptionPane.showMessageDialog(btnNewButton, "Enter patient_age");
                }
                if (type==0) {
                    JOptionPane.showMessageDialog(btnNewButton, "Enter blood_group");
                }
                if (user==0) {
                    JOptionPane.showMessageDialog(btnNewButton, "Enter username");
                }
                if (pass==0) {
                    JOptionPane.showMessageDialog(btnNewButton, "Enter pass_word");
                }



                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms", "root", "shashank");

                    String query = "INSERT INTO patient_reg values('" + patient_id + "','" + patient_age + "','" + patient_name + "','" +
                            phone_no + "','" + blood_group + "','"+ user_name +"','" + pass_word +"')";

                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btnNewButton, "This already exist");
                    } else {
                        JOptionPane.showMessageDialog(btnNewButton,
                                "Welcome, " + msg + "Your account is successfully created");
                    }
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton.setBounds(499, 456, 259, 74);
        btnNewButton.setBackground(Color.white);
        contentPane.add(btnNewButton);
        JButton btnNewButton1 = new JButton("Back");
        btnNewButton1.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton1.setBounds(245, 456, 259, 74);
        btnNewButton1.setBackground(Color.white);
        btnNewButton1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
                start ah = new start();
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
