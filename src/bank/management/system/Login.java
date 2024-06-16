
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


public class Login extends JFrame implements ActionListener{

    JLabel welcome,CardNumber,pin;
    JTextField CardNumberTextField;
    JPasswordField pinField;
    JButton signIn,clear,signUp;
    
    Login(){
        setTitle("AUTOMATED TELLER MACHINE");
        
        // Setting default layout NULL 
        setLayout(null);
        
        // Setting icon
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(70, 10, 100, 100);
        add(l11);
         
        // Adding text
        welcome = new JLabel("WELCOME TO ATM");
        welcome.setFont(new Font("Osward", Font.BOLD, 38));
        welcome.setBounds(200,40,450,40);
        add(welcome);
        
        // Adding text
        CardNumber = new JLabel("Card No:");
        CardNumber.setFont(new Font("Raleway", Font.BOLD, 28));
        CardNumber.setBounds(125,150,375,30);
        add(CardNumber);
        
        // Adding text field
        CardNumberTextField = new JTextField(15);
        CardNumberTextField.setBounds(300,150,230,30);
        CardNumberTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(CardNumberTextField);
        
        // Adding text 
        pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setBounds(125,220,375,30);
        add(pin);
        
        // Adding text field
        pinField = new JPasswordField(15);
        pinField.setFont(new Font("Arial", Font.BOLD, 14));
        pinField.setBounds(300,220,230,30);
        add(pinField);
        
        // Adding Buttons
        
        signIn = new JButton("SIGN IN");
        signIn.setBackground(Color.WHITE);
        signIn.setForeground(Color.BLACK);
        signIn.setFont(new Font("Arial", Font.BOLD, 14));
        signIn.setBounds(300,300,100,30);
        signIn.addActionListener(this); // Adding action
        add(signIn);
        
        clear = new JButton("CLEAR");
        clear.setBackground(Color.WHITE);
        clear.setForeground(Color.BLACK);
        clear.setFont(new Font("Arial", Font.BOLD, 14));
        clear.setBounds(430,300,100,30);
        clear.addActionListener(this);  // Adding action
        add(clear);
        
        signUp = new JButton("SIGN UP");
        signUp.setBackground(Color.WHITE);
        signUp.setForeground(Color.BLACK);
        signUp.setFont(new Font("Arial", Font.BOLD, 14));
        signUp.setBounds(300,350,230,30);
        signUp.addActionListener(this); // Adding action
        add(signUp);
        
        
        // Changing window color
        getContentPane().setBackground(Color.WHITE);
        
        // Setting window
        setSize(800,480);
        setLocation(550,200);
        setVisible(true);
        
    }
    
    // over riding the methods in ActionListener
    public void actionPerformed(ActionEvent ae){
            
        if(ae.getSource()==clear){
            CardNumberTextField.setText("");
            pinField.setText("");
        }else if(ae.getSource()==signIn){
            try{
            
            Conn c1 = new Conn();
                String cardNo  = CardNumberTextField.getText();
                String pinNo  = pinField.getText();
                String query  = "select * from login where cardNo = '"+cardNo+"' and pinNo = '"+pinNo+"'";

                ResultSet rs = c1.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    dispose();
                    new Transactions(pinNo).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
                }
                
            }catch(Exception e){
                System.out.println(e);
            }
            
                
        }else if(ae.getSource()==signUp){
            setVisible(false);
            dispose();
            new SignupOne().setVisible(true);
        }
        
    }
    
 
    public static void main(String[] args){
        new Login();
    }

    
}
