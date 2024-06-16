
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class MiniStatement extends JFrame implements ActionListener{
    
    JButton exit;
    String pin;
    MiniStatement(String pin){
        this.pin=pin;
        
        setLayout(null);
        setTitle("Mini Statement");
        
        // Adding data and doing operations on sql (fetching data)
        JLabel heading = new JLabel("Indian Bank");
        heading.setBounds(150, 20, 100, 20);
        add(heading);
        
        JLabel card = new JLabel();
        card.setBounds(20, 80, 300, 20);
        add(card);
        
        JLabel l4 = new JLabel();
        l4.setBounds(20, 400, 300, 20);
        add(l4);
        
        JLabel l1 = new JLabel();
        l1.setBounds(20, 140, 400, 200);
        add(l1);
        
        
        try{
            Conn con = new Conn();
            ResultSet result = con.s.executeQuery("select * from login where pinNo = '"+pin+"'");
            while(result.next()){
                card.setText("Card Number:    " + result.getString("cardNo").substring(0, 4) + "XXXXXXXX" + result.getString("cardNo").substring(12));
            }
        }catch(Exception e){
            System.out.println(e);
        }
        	 
        try{
            int balance = 0;
            Conn con  = new Conn();
            ResultSet result = con.s.executeQuery("SELECT * FROM bank where pinNo = '"+pin+"'");
            while(result.next()){
                l1.setText(l1.getText() + "<html>"+result.getString("date")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + result.getString("transactionType") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + result.getString("amount") + "<br><br><html>");
                if(result.getString("transactionType").equals("Deposit")){
                    balance += Integer.parseInt(result.getString("amount"));
                }else{
                    balance -= Integer.parseInt(result.getString("amount"));
                }
            }
            l4.setText("Your total Balance is Rs "+balance);
        }catch(Exception e){
            System.out.println(e);
        }
        
        // Exit button
        exit = new JButton("Exit");
        exit.setBounds(20, 500, 100, 25);
        exit.addActionListener(this);
        add(exit);
        
       // Setting Layout
        getContentPane().setBackground(Color.WHITE);
        setSize(400,600);
        setLocation(20,20);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==exit){ 
            setVisible(false);
               
        }
    }
    
    public static void main(String args[]) {
        new MiniStatement("");
    }
}
