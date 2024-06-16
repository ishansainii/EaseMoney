
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;
import java.util.*;


public class BalanceEnquiry extends JFrame implements ActionListener{
   
    JButton back;
    JLabel heading;
    String pin;

    BalanceEnquiry(String pin) {
        this.pin = pin;
        setLayout(null);
        
        // setting image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 960, 1080);
        add(l3);
        
        // Calculating balance
        int balance = 0;
        try{
            Conn c1 = new Conn();
            ResultSet rs = c1.s.executeQuery("select * from bank where pinNo = '"+pin+"'");
            while (rs.next()) {
                if (rs.getString("transactionType").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
        }catch(Exception e){}

        // adding content
        heading = new JLabel();
        heading.setText("Your Current Account Balance is Rs "+balance);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("System", Font.BOLD, 16));
        heading.setBounds(190, 350, 400, 35);
        l3.add(heading);

        back = new JButton("BACK");
        back.setBounds(390, 633, 150, 35);
        back.addActionListener(this);
        l3.add(back);
        
        // Setting Layout
        setSize(960, 1080);
        setLocation(500, 0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==back){
            setVisible(false);
            dispose();
            new Transactions(pin).setVisible(true);
        }
    }
    
    public static void main(String args[]) {
        new BalanceEnquiry("").setVisible(true);
    }
}
