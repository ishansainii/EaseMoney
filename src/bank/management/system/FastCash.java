
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener{

    JLabel heading;
    JButton ammount100,ammount500,ammount1000,ammount2000,ammount5000,ammount10000,back;
    String pin;
    
    FastCash(String pin){
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
        heading = new JLabel("SELECT WITHDRAWL AMMOUNT");
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("System", Font.BOLD, 16));
        heading.setBounds(235,400,700,35);
        l2.add(heading);
        
        ammount100 = new JButton("Rs 100");
        ammount100.setBounds(170,499,150,35);
        ammount100.addActionListener(this);
        l2.add(ammount100);
        
        ammount500 = new JButton("Rs 500");
        ammount500.setBounds(390,499,150,35);
        ammount500.addActionListener(this);
        l2.add(ammount500);
        
        ammount1000 = new JButton("Rs 1000");
        ammount1000.setBounds(170,543,150,35);
        ammount1000.addActionListener(this);
        l2.add(ammount1000);
        
        ammount2000 = new JButton("Rs 2000");
        ammount2000.setBounds(390,543,150,35);
        ammount2000.addActionListener(this);
        l2.add(ammount2000);
        
        ammount5000 = new JButton("Rs 50000");
        ammount5000.setBounds(170,588,150,35);
        ammount5000.addActionListener(this);
        l2.add(ammount5000);
        
        ammount10000 = new JButton("Rs 10000");
        ammount10000.setBounds(390,588,150,35);
        ammount10000.addActionListener(this);
        l2.add(ammount10000);
        
        back = new JButton("BACK");
        back.setBounds(390,633,150,35);
        back.addActionListener(this);
        l2.add(back);
        
        // Setting frame 
        setSize(960,1080);
        setLocation(200,0);
        setVisible(true);
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==back){ 
            setVisible(false);
            dispose();
            new Transactions(pin).setVisible(true);
        }
        else{
            try{
                String amount = ((JButton)ae.getSource()).getText().substring(3); // Rs 500
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery("select * from bank where pinNo = '"+pin+"'");
                int balance = 0;
                while (rs.next()) {
                    if (rs.getString("transactionType").equals("Deposit")) {
                        balance += Integer.parseInt(rs.getString("amount"));
                    } else {
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
                if (ae.getSource() != back && balance < Integer.parseInt(amount)) {
                    JOptionPane.showMessageDialog(null, "Insuffient Balance");
                    return;
                }
                if (ae.getSource() == back) {
                    this.setVisible(false);
                    dispose();
                    new Transactions(pin).setVisible(true);
                }else{
                    Date date = new Date();
                    c.s.executeUpdate("insert into bank values('"+pin+"', '"+date+"', 'Withdrawl', '"+amount+"')");
                    JOptionPane.showMessageDialog(null, "Rs. "+amount+" Debited Successfully");

                    setVisible(false);
                    dispose();
                    new Transactions(pin).setVisible(true);
                }
                
            }catch(Exception e){
                System.out.println(e);
            }
            
        }
    }
    
    
    public static void main(String args[]) {
        new FastCash("");
    }
}
