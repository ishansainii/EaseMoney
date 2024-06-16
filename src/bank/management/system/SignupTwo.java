
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class SignupTwo extends JFrame implements ActionListener{
    JLabel additionalDetails,religion,category,income,education,occupation,panNumber,aadharNumber,seniorCitizen,existingAccount;
    JButton next;
    JRadioButton seniorCitizen_yes,seniorCitizen_no,existingAccount_yes,existingAccount_no;
    JTextField panNumberTextField,aadharNumberTextField,t3;
    JComboBox religionDropDown,categoryDropDown,incomeDropDown,educationDropDown,occupationDropDown;
    String formno;
    
    SignupTwo(String formno){
        this.formno = formno;
        setLayout(null);
        
        
        //Set tittle
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        // Setting icon
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(150, 0, 100, 100);
        add(l14);
        
        // Adding heading
        
        
        additionalDetails = new JLabel("Page 2: Additonal Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(280,30,600,40);
        add(additionalDetails);
        
        // Adding all the labels and text Fields
        
        religion = new JLabel("Religion:");
        religion.setFont(new Font("Raleway", Font.BOLD, 18));
        religion.setBounds(100,120,100,30);
        add(religion);
        
        String religionList[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        religionDropDown = new JComboBox(religionList);
        religionDropDown.setBackground(Color.WHITE);
        religionDropDown.setFont(new Font("Raleway", Font.BOLD, 14));
        religionDropDown.setBounds(350,120,320,30);
        add(religionDropDown);
        
        category = new JLabel("Category:");
        category.setFont(new Font("Raleway", Font.BOLD, 18));
        category.setBounds(100,170,100,30);
        add(category);
        
        String categoryList[] = {"General","OBC","SC","ST","Other"};
        categoryDropDown = new JComboBox(categoryList);
        categoryDropDown.setBackground(Color.WHITE);
        categoryDropDown.setFont(new Font("Raleway", Font.BOLD, 14));
        categoryDropDown.setBounds(350,170,320,30);
        add(categoryDropDown);
        
        
        income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD, 18));
        income.setBounds(100,220,100,30);
        add(income);
        
        String incomeList[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        incomeDropDown = new JComboBox(incomeList);
        incomeDropDown.setBackground(Color.WHITE);
        incomeDropDown.setFont(new Font("Raleway", Font.BOLD, 14));
        incomeDropDown.setBounds(350,220,320,30);
        add(incomeDropDown);
        
        
        education = new JLabel("Educational");
        education.setFont(new Font("Raleway", Font.BOLD, 18));
        education.setBounds(100,270,150,30);
        add(education);
       
        
        String educationList[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        educationDropDown = new JComboBox(educationList);
        educationDropDown.setBackground(Color.WHITE);
        educationDropDown.setFont(new Font("Raleway", Font.BOLD, 14));
        educationDropDown.setBounds(350,270,320,30);
        add(educationDropDown);
        
        
        occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway", Font.BOLD, 18));
        occupation.setBounds(100,340,150,30);
        add(occupation);
        
        String occupationList[] = {"Salaried","Self-Employmed","Business","Student","Retired","Others"};
        occupationDropDown = new JComboBox(occupationList);
        occupationDropDown.setBackground(Color.WHITE);
        occupationDropDown.setFont(new Font("Raleway", Font.BOLD, 14));
        occupationDropDown.setBounds(350,340,320,30);
        add(occupationDropDown);
        
        panNumber = new JLabel("PAN Number:");
        panNumber.setFont(new Font("Raleway", Font.BOLD, 18));
        panNumber.setBounds(100,390,150,30);
        add(panNumber);
        
        panNumberTextField = new JTextField();
        panNumberTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        panNumberTextField.setBounds(350,390,320,30);
        add(panNumberTextField);
        
        aadharNumber = new JLabel("Aadhar Number:");
        aadharNumber.setFont(new Font("Raleway", Font.BOLD, 18));
        aadharNumber.setBounds(100,440,180,30);
        add(aadharNumber);
        
        aadharNumberTextField = new JTextField();
        aadharNumberTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        aadharNumberTextField.setBounds(350,440,320,30);
        add(aadharNumberTextField);
        
        seniorCitizen = new JLabel("Senior Citizen:");
        seniorCitizen.setFont(new Font("Raleway", Font.BOLD, 18));
        seniorCitizen.setBounds(100,490,150,30);
        add(seniorCitizen);
        
        seniorCitizen_yes = new JRadioButton("Yes");
        seniorCitizen_yes.setFont(new Font("Raleway", Font.BOLD, 14));
        seniorCitizen_yes.setBackground(Color.WHITE);
        seniorCitizen_yes.setBounds(350,490,100,30);
        add(seniorCitizen_yes);
        
        seniorCitizen_no = new JRadioButton("No");
        seniorCitizen_no.setFont(new Font("Raleway", Font.BOLD, 14));
        seniorCitizen_no.setBackground(Color.WHITE);
        seniorCitizen_no.setBounds(460,490,100,30);
        add(seniorCitizen_no);
        
        ButtonGroup groupSeniorCitizen = new ButtonGroup();
        groupSeniorCitizen.add(seniorCitizen_yes);
        groupSeniorCitizen.add(seniorCitizen_no);
        
        existingAccount = new JLabel("Existing Account:");
        existingAccount.setFont(new Font("Raleway", Font.BOLD, 18));
        existingAccount.setBounds(100,540,180,30);
        add(existingAccount);
        
        existingAccount_yes = new JRadioButton("Yes");
        existingAccount_yes.setFont(new Font("Raleway", Font.BOLD, 14));
        existingAccount_yes.setBackground(Color.WHITE);
        existingAccount_yes.setBounds(350,540,100,30);
        add(existingAccount_yes);
        
        
        existingAccount_no = new JRadioButton("No");
        existingAccount_no.setFont(new Font("Raleway", Font.BOLD, 14));
        existingAccount_no.setBackground(Color.WHITE);
        existingAccount_no.setBounds(460,540,100,30);
        add(existingAccount_no);
        
        ButtonGroup groupAccount = new ButtonGroup();
        groupAccount.add(existingAccount_yes);
        groupAccount.add(existingAccount_no);
        
        
        
        // Adding next button
        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);
        
        // Setting Frame
        getContentPane().setBackground(Color.WHITE);
        setSize(850,750);
        setLocation(500,120);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String religion = (String)religionDropDown.getSelectedItem(); 
        String category = (String)categoryDropDown.getSelectedItem();
        String income = (String)incomeDropDown.getSelectedItem();
        String education = (String)educationDropDown.getSelectedItem();
        String occupation = (String)occupationDropDown.getSelectedItem();
        
        String panNumber = panNumberTextField.getText();
        String aadharNumber = aadharNumberTextField.getText();
        
        String seniorCitizen = null;
        if(seniorCitizen_yes.isSelected()){ 
            seniorCitizen = "Yes";
        }
        else if(seniorCitizen_no.isSelected()){ 
            seniorCitizen = "No";
        }
           
        String existingAccount = null;
        if(existingAccount_yes.isSelected()){ 
            existingAccount = "Yes";
        }else if(existingAccount_no.isSelected()){ 
            existingAccount = "No";
        }
        
        if(ae.getSource()==next){
        
            try{
                if(panNumberTextField.getText().equals("") || aadharNumberTextField.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Fill all the required fields");
                }else{
                    Conn c1 = new Conn();
                    String q1 = "insert into signup2 values('"+formno+"','"+religion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+panNumber+"','"+aadharNumber+"','"+seniorCitizen+"','"+existingAccount+"')";
                    c1.s.executeUpdate(q1);
                    
                    setVisible(false);
                    dispose();
                    new SignupThree(formno).setVisible(true);
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    
    public static void main(String args[]) {
        new SignupTwo("");
    }
}
