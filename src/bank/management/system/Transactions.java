  
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Transactions extends JFrame implements ActionListener{

    JLabel heading;
    JButton deposit,cashWithdrawl,fastCash,miniStatement,pinChange,balanceEnquiry,exit;
    String pin;
    
    Transactions(String pin){
        this.pin = pin;
        setLayout(null);
        
        // Adding Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l2 = new JLabel(i3);
        l2.setBounds(0, 0, 960, 1080);
        add(l2);
        
        // Adding labels and buttons
        heading = new JLabel("Please Select Your Transaction");
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("System", Font.BOLD, 16));
        heading.setBounds(235,400,700,35);
        l2.add(heading);
        
        deposit = new JButton("DEPOSIT");
        deposit.setBounds(170,499,150,35);
        deposit.addActionListener(this);
        l2.add(deposit);
        
        cashWithdrawl = new JButton("CASH WITHDRAWL");
        cashWithdrawl.setBounds(390,499,150,35);
        cashWithdrawl.addActionListener(this);
        l2.add(cashWithdrawl);
        
        fastCash = new JButton("FAST CASH");
        fastCash.setBounds(170,543,150,35);
        fastCash.addActionListener(this);
        l2.add(fastCash);
        
        miniStatement = new JButton("MINI STATEMENT");
        miniStatement.setBounds(390,543,150,35);
        miniStatement.addActionListener(this);
        l2.add(miniStatement);
        
        pinChange = new JButton("PIN CHANGE");
        pinChange.setBounds(170,588,150,35);
        pinChange.addActionListener(this);
        l2.add(pinChange);
        
        balanceEnquiry = new JButton("BALANCE ENQUIRY");
        balanceEnquiry.setBounds(390,588,150,35);
        balanceEnquiry.addActionListener(this);
        l2.add(balanceEnquiry);
        
        exit = new JButton("EXIT");
        exit.setBounds(390,633,150,35);
        exit.addActionListener(this);
        l2.add(exit);
        
        // Setting frame 
        setSize(960,1080);
        setLocation(200,0);
        setVisible(true);
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==deposit){ 
            setVisible(false);
            dispose();
            new Deposit(pin).setVisible(true);
        }else if(ae.getSource()==cashWithdrawl){ 
            setVisible(false);
            dispose();
            new Withdrawl(pin).setVisible(true);
        }
        else if(ae.getSource()==fastCash){ 
            setVisible(false);
            new FastCash(pin).setVisible(true);
        }
        else if(ae.getSource()==miniStatement){ 
            new MiniStatement(pin).setVisible(true);
        }
        else if(ae.getSource()==pinChange){ 
            setVisible(false);
            new PinChange(pin).setVisible(true);
        }
        else if(ae.getSource()==balanceEnquiry){ 
            this.setVisible(false);
            new BalanceEnquiry(pin).setVisible(true);
        }
        else if(ae.getSource()==exit){ 
            System.exit(0);
 
        }
    }
    
    
    public static void main(String args[]) {
        new Transactions("");
    }
}
