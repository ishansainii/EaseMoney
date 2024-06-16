
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener{

    JLabel l1,accountType,cardNumber,cardNumber_hide,cardNumber_info,cardNumber_info2,pin,pin_hide,pin_info,serviceRequired,l11,l12;
    JRadioButton accountType_Saving,accountType_FixedDeposit,accountType_Current,accountType_RecurringDeposit;
    JButton submit, cancel;
    JCheckBox ATM_card,internetBanking,mobileBanking,emailAlert,chequeBook,Estatement,declaration;
    String formno;
    Random ran = new Random();
    long card_no = (ran.nextLong() % 90000000L) + 5040936000000000L;
    long pin_no = (ran.nextLong() % 9000L) + 1000L;
    
    SignupThree(String formno){
        this.formno = formno;
        setLayout(null);
        // Setting Title
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");
    
        // Setting Icon
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(150, 0, 100, 100);
        add(l14);
        
        // Setting Heading
        l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(280,40,400,40);
        add(l1); 
        
        l11 = new JLabel("Form No:");
        l11.setFont(new Font("Raleway", Font.BOLD, 14));
        l11.setBounds(700,10,70,30);
        add(l11);
        
        
        
        l12 = new JLabel(formno);
        l12.setFont(new Font("Raleway", Font.BOLD, 14));
        l12.setBounds(770,10,40,30);
        add(l12);
        
        // Setting Labels and Respective Fields
        
        accountType = new JLabel("Account Type:");
        accountType.setFont(new Font("Raleway", Font.BOLD, 18));
        accountType.setBounds(100,140,200,30);
        add(accountType);
        
        accountType_Saving = new JRadioButton("Saving Account");
        accountType_Saving.setFont(new Font("Raleway", Font.BOLD, 16));
        accountType_Saving.setBackground(Color.WHITE);
        accountType_Saving.setBounds(100,180,200,30);
        add(accountType_Saving);
        
        accountType_FixedDeposit = new JRadioButton("Fixed Deposit Account");
        accountType_FixedDeposit.setFont(new Font("Raleway", Font.BOLD, 16));
        accountType_FixedDeposit.setBackground(Color.WHITE);
        accountType_FixedDeposit.setBounds(350,180,300,30);
        add(accountType_FixedDeposit);
        
        accountType_Current = new JRadioButton("Current Account");
        accountType_Current.setFont(new Font("Raleway", Font.BOLD, 16));
        accountType_Current.setBackground(Color.WHITE);
        accountType_Current.setBounds(100,220,250,30);
        add(accountType_Current);
        
        accountType_RecurringDeposit = new JRadioButton("Recurring Deposit Account");
        accountType_RecurringDeposit.setFont(new Font("Raleway", Font.BOLD, 16));
        accountType_RecurringDeposit.setBackground(Color.WHITE);
        accountType_RecurringDeposit.setBounds(350,220,350,30);
        add(accountType_RecurringDeposit);
        
        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(accountType_Saving);
        groupgender.add(accountType_FixedDeposit);
        groupgender.add(accountType_Current);
        groupgender.add(accountType_RecurringDeposit);
        
        cardNumber = new JLabel("Card Number:");
        cardNumber.setFont(new Font("Raleway", Font.BOLD, 18));
        cardNumber.setBounds(100,300,200,30);
        add(cardNumber);
        
        cardNumber_hide = new JLabel("XXXX-XXXX-XXXX-4184");
        cardNumber_hide.setFont(new Font("Raleway", Font.BOLD, 18));
        cardNumber_hide.setBounds(330,300,250,30);
        add(cardNumber_hide);
        
        cardNumber_info = new JLabel("(Your 16-digit Card number)");
        cardNumber_info.setFont(new Font("Raleway", Font.BOLD, 12));
        cardNumber_info.setBounds(100,330,200,20);
        add(cardNumber_info);
        
        cardNumber_info2 = new JLabel("It would appear on ATM Card/Cheque Book and Statements");
        cardNumber_info2.setFont(new Font("Raleway", Font.BOLD, 12));
        cardNumber_info2.setBounds(330,330,500,20);
        add(cardNumber_info2);
        
        pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 18));
        pin.setBounds(100,370,200,30);
        add(pin);
        
        pin_hide = new JLabel("XXXX");
        pin_hide.setFont(new Font("Raleway", Font.BOLD, 18));
        pin_hide.setBounds(330,370,200,30);
        add(pin_hide);
        
        pin_info = new JLabel("(4-digit password)");
        pin_info.setFont(new Font("Raleway", Font.BOLD, 12));
        pin_info.setBounds(100,400,200,20);
        add(pin_info);
        
        serviceRequired = new JLabel("Services Required:");
        serviceRequired.setFont(new Font("Raleway", Font.BOLD, 18));
        serviceRequired.setBounds(100,450,200,30);
        add(serviceRequired);
        
        ATM_card = new JCheckBox("ATM CARD");
        ATM_card.setBackground(Color.WHITE);
        ATM_card.setFont(new Font("Raleway", Font.BOLD, 16));
        ATM_card.setBounds(100,500,200,30);
        add(ATM_card);
        
        internetBanking = new JCheckBox("Internet Banking");
        internetBanking.setBackground(Color.WHITE);
        internetBanking.setFont(new Font("Raleway", Font.BOLD, 16));
        internetBanking.setBounds(350,500,200,30);
        add(internetBanking);
        
        mobileBanking = new JCheckBox("Mobile Banking");
        mobileBanking.setBackground(Color.WHITE);
        mobileBanking.setFont(new Font("Raleway", Font.BOLD, 16));
        mobileBanking.setBounds(100,550,200,30);
        add(mobileBanking);
        
        emailAlert = new JCheckBox("EMAIL Alerts");
        emailAlert.setBackground(Color.WHITE);
        emailAlert.setFont(new Font("Raleway", Font.BOLD, 16));
        emailAlert.setBounds(350,550,200,30);
        add(emailAlert);
        
        chequeBook = new JCheckBox("Cheque Book");
        chequeBook.setBackground(Color.WHITE);
        chequeBook.setFont(new Font("Raleway", Font.BOLD, 16));
        chequeBook.setBounds(100,600,200,30);
        add(chequeBook);
        
        Estatement = new JCheckBox("E-Statement");
        Estatement.setBackground(Color.WHITE);
        Estatement.setFont(new Font("Raleway", Font.BOLD, 16));
        Estatement.setBounds(350,600,200,30);
        add(Estatement);
        
        declaration = new JCheckBox("I hereby declares that the above entered details correct to th best of my knowledge.",true);
        declaration.setBackground(Color.WHITE);
        declaration.setFont(new Font("Raleway", Font.BOLD, 12));
        declaration.setBounds(100,680,600,20);
        add(declaration);
        
        submit = new JButton("Submit");
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBackground(Color.WHITE);
        submit.setForeground(Color.BLACK);
        submit.setBounds(250,720,100,30);
        submit.addActionListener(this);
        add(submit);
        
        
        cancel = new JButton("Cancel");
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBackground(Color.WHITE);
        cancel.setForeground(Color.BLACK);
        cancel.setBounds(420,720,100,30);
        cancel.addActionListener(this);
        add(cancel);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,850);
        setLocation(500,120);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        String consent = null;
        if(declaration.isSelected()){
            consent = "true";
        }
        else{
            consent = "false";
        }
        
        String accountType = null;
        if(accountType_Saving.isSelected()){ 
            accountType = "Saving Account";
        }
        else if(accountType_FixedDeposit.isSelected()){ 
            accountType = "Fixed Deposit Account";
        }
        else if(accountType_Current.isSelected()){ 
            accountType = "Current Account";
        }else if(accountType_RecurringDeposit.isSelected()){ 
            accountType = "Recurring Deposit Account";
        }
        
        String cardNo = "" + Math.abs(card_no);
        
        String pinNo = "" + Math.abs(pin_no);
        
        String serviceRequired = "";
        if(ATM_card.isSelected()){ 
            serviceRequired = serviceRequired + " ATM Card";
        }
        if(internetBanking.isSelected()){ 
            serviceRequired = serviceRequired + " Internet Banking";
        }
        if(mobileBanking.isSelected()){ 
            serviceRequired = serviceRequired + " Mobile Banking";
        }
        if(emailAlert.isSelected()){ 
            serviceRequired = serviceRequired + " EMAIL Alerts";
        }
        if(chequeBook.isSelected()){ 
            serviceRequired = serviceRequired + " Cheque Book";
        }
        if(Estatement.isSelected()){ 
            serviceRequired = serviceRequired + " E-Statement";
        }
        
        try{
            if(ae.getSource()==submit){
                
                if(accountType.equals("") && consent=="true"){
                    JOptionPane.showMessageDialog(null, "Fill all the required fields");
                }else{
                    Conn c1 = new Conn();
                    String q1 = "insert into signup3 values('"+formno+"','"+accountType+"','"+cardNo+"','"+pinNo+"','"+serviceRequired+"')";  
                    String q2 = "insert into login values('"+formno+"','"+cardNo+"','"+pinNo+"')";
                    c1.s.executeUpdate(q1);
                    c1.s.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardNo + "\n Pin:"+ pinNo);
                    
                    setVisible(false);
                    dispose();
                    new Deposit(pinNo).setVisible(true);
                    
                }
            
            }else if(ae.getSource()==cancel){
                setVisible(false);
                dispose();
                new Login().setVisible(true);
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    
    public static void main(String args[]) {
        new SignupThree("");
    }
}
