package BBMS;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class request extends JFrame {
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
                    request frame = new request();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }



    public request() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\STDM.jpg"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 90, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewUserRegister = new JLabel("emergency request form");
        lblNewUserRegister.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        lblNewUserRegister.setBounds(362, 32, 325, 30);
        contentPane.add(lblNewUserRegister);

        JLabel lblpatientid = new JLabel("Request no.");
        lblpatientid.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblpatientid.setBounds(550, 250, 110, 23);
        contentPane.add(lblpatientid);

        JLabel lblpatient_name = new JLabel("name");
        lblpatient_name.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblpatient_name.setBounds(58, 151, 300, 29);
        contentPane.add(lblpatient_name);



        JLabel lblbloodgroup = new JLabel("blood group");
        lblbloodgroup.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblbloodgroup.setBounds(58, 243, 300, 36);
        contentPane.add(lblbloodgroup);

       /* JLabel lblanydisease = new JLabel("any_disease");
        lblanydisease.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblanydisease.setBounds(58, 320, 300, 36);
        contentPane.add(lblanydisease);*/

        JLabel lblphone_no = new JLabel("phone no");
        lblphone_no.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblphone_no.setBounds(550, 151, 300, 36);
        contentPane.add(lblphone_no);





        /*JLabel lblbloodquantity = new JLabel("blood_quantity");
        lblbloodquantity.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblbloodquantity.setBounds(550, 243, 200, 36);
        contentPane.add(lblbloodquantity);*/

        patientid = new JTextField();
        patientid.setFont(new Font("Tahoma", Font.PLAIN, 32));
        patientid.setBounds(710, 250, 228, 50);
        contentPane.add(patientid);
        patientid.setColumns(10);

        patientname = new JTextField();
        patientname.setFont(new Font("Tahoma", Font.PLAIN, 32));
        patientname.setBounds(210, 150, 228, 50);
        contentPane.add(patientname);
        patientname.setColumns(10);



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




       /* bloodquantity = new JTextField();
        bloodquantity.setFont(new Font("Tahoma", Font.PLAIN, 32));
        bloodquantity.setBounds(214, 320, 228, 50);
        contentPane.add(bloodquantity);*/

        btnNewButton = new JButton("Request");
        btnNewButton.setBackground(Color.white);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String  requestno= patientid.getText();
                int i = requestno.length();
                String name = patientname.getText();
                int n = name.length();

                String blood_group = bloodgroup.getText();
                int type = blood_group.length();
                /*String any_disease = anydisease.getText();*/
                String phone_no = no.getText();
                int len = phone_no.length();
                /* String blood_quantity = bloodquantity.getText();*/

                String msg = "" + requestno;
                msg += " \n";
                if (len!=10) {
                    JOptionPane.showMessageDialog(btnNewButton, "Enter a valid  mobile_no");
                }
                if (i==0) {
                    JOptionPane.showMessageDialog(btnNewButton, "Enter request_no");
                }
                if (n==0) {
                    JOptionPane.showMessageDialog(btnNewButton, "Enter name");
                }

                if (type==0) {
                    JOptionPane.showMessageDialog(btnNewButton, "Enter blood_group");
                }




                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms", "root", "shashank");

                    String query = "INSERT INTO req_uests values('" + requestno + "','" + name + "','" + blood_group + "','" +
                            phone_no + "')";

                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btnNewButton, "This already exist");
                    } else {
                        JOptionPane.showMessageDialog(btnNewButton, "requested!! Admin will contact you as soon as he gets appropriate donor" );
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
                patientpg ah = new patientpg();
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
