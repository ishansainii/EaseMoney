
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class PinChange extends JFrame implements ActionListener{

    JPasswordField newPinField,newPinReField;
    JButton change,back;                               
    JLabel heading,newPin,newPinRe;
    String pin;
    
    PinChange(String pin){
        this.pin = pin;
        setLayout(null);
        
        // Adding Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l4 = new JLabel(i3);
        l4.setBounds(0, 0, 960, 1080);
        add(l4);
        
        // Adding data
        heading = new JLabel("CHANGE YOUR PIN");
        heading.setFont(new Font("System", Font.BOLD, 16));
        heading.setForeground(Color.WHITE);
        heading.setBounds(280,330,800,35);
        l4.add(heading);
        
       
        newPin = new JLabel("New PIN:");
        newPin.setFont(new Font("System", Font.BOLD, 16));
        newPin.setForeground(Color.WHITE);
        newPin.setBounds(180,390,150,35);
        l4.add(newPin);
        
        newPinField = new JPasswordField();
        newPinField.setFont(new Font("Raleway", Font.BOLD, 25));
        newPinField.setBounds(350,390,180,25);
        l4.add(newPinField);
        
        
        
        newPinRe = new JLabel("Re-Enter New PIN:");
        newPinRe.setFont(new Font("System", Font.BOLD, 16));
        newPinRe.setForeground(Color.WHITE);
        newPinRe.setBounds(180,440,200,35);
        l4.add(newPinRe);
        
        
        newPinReField = new JPasswordField();
        newPinReField.setFont(new Font("Raleway", Font.BOLD, 25));
        newPinReField.setBounds(350,440,180,25);
        l4.add(newPinReField);
        
        
        change = new JButton("CHANGE");
        change.setBounds(390,588,150,35);
        change.addActionListener(this);
        l4.add(change);
        
        back = new JButton("BACK");
        back.setBounds(390,633,150,35);
        back.addActionListener(this);
        l4.add(back);
        
        // Setting Layout
        setSize(960,1080);
        setLocation(200,0);
        setVisible(true);
    
    }
    
    public void actionPerformed(ActionEvent ae){
        try{        
            String npin = newPinField.getText();
            String rpin = newPinReField.getText();
            
            if(ae.getSource()==change){
                if(!npin.equals(rpin)){
                    JOptionPane.showMessageDialog(null, "Entered PIN does not match");
                    
                }
                else if (newPinField.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Enter New PIN");
                }
                else if (newPinReField.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Re-Enter new PIN");
                }
                else{
                    Conn con = new Conn();
                    String query1 = "update bank set pinNo = '"+rpin+"' where pinNo = '"+pin+"' ";
                    String query2 = "update login set pinNo = '"+rpin+"' where pinNo = '"+pin+"' ";
                    String query3 = "update signup3 set pinNo = '"+rpin+"' where pinNo = '"+pin+"' ";

                    con.s.executeUpdate(query1);
                    con.s.executeUpdate(query2);
                    con.s.executeUpdate(query3);

                    JOptionPane.showMessageDialog(null, "PIN changed successfully");
                    
                }
                setVisible(false);
                dispose();
                new Transactions(rpin).setVisible(true);
            
            }else if(ae.getSource()==back){
                setVisible(false);
                dispose();
                new Transactions(pin).setVisible(true);
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void main(String args[]) {
        new PinChange("");
    }
}
