
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


public class Deposit extends JFrame implements ActionListener{
     
    JTextField amountTextField;
    JButton deposit,back;
    JLabel amount;
    String pin;
    
    Deposit(String pin){
        setLayout(null);
        this.pin = pin;
        //adding image
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 960, 1080);
        add(l3);
        
        // adding data
        amount = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        amount.setForeground(Color.WHITE);
        amount.setFont(new Font("System", Font.BOLD, 16));
        amount.setBounds(190,350,400,35);
        l3.add(amount);
        
        amountTextField = new JTextField();
        amountTextField.setFont(new Font("Raleway", Font.BOLD, 22));
        amountTextField.setBounds(190,420,320,25);
        l3.add(amountTextField);
        
        deposit = new JButton("DEPOSIT");
        deposit.setBounds(390,588,150,35);
        deposit.addActionListener(this);
        l3.add(deposit);
        
        back = new JButton("BACK");
        back.setBounds(390,633,150,35);
        back.addActionListener(this);
        l3.add(back);
        
        
        // Setting Layout
        setSize(960,1080);
        setLocation(200,0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        try{        
            String amount = amountTextField.getText();
            Date date = new Date();
            if(ae.getSource()==deposit){
                if(amountTextField.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Deposit");
                }else{
                    Conn c1 = new Conn();
                    c1.s.executeUpdate("insert into bank values('"+pin+"', '"+date+"', 'Deposit', '"+amount+"')");
                    JOptionPane.showMessageDialog(null, "Rs. "+amount+" Deposited Successfully");
                    
                    setVisible(false);
                    dispose();
                    new Transactions(pin).setVisible(true);
                }
            }else if(ae.getSource()==back){
                setVisible(false);
                dispose();
                new Transactions(pin).setVisible(true);
            }
        }catch(Exception e){
            System.out.println(e);
        }
            
    }
    public static void main(String args[]) {
        new Deposit("");
    }
}
