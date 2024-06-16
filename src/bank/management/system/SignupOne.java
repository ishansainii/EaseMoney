
package bank.management.system;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;

public class SignupOne extends JFrame implements ActionListener{

    JLabel application,page,name,fatherName,dob,gender,email,marital,address,city,State,pincode;
    JTextField nameField,fatherNameField,emailField,addressField,cityField,stateField,pincodeField;
    JRadioButton male,female,married,unmarried,other;
    JButton next;
    JDateChooser dateChooser;
    
    
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String formno = "" + Math.abs(first4);
    
    SignupOne(){
        setLayout(null);
        
        // Setting title
        setTitle("NEW ACCOUNT APPLICATION FORM");
        
        // Setting icon
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(20, 0, 100, 100);
        add(l11);
        
        // Adding heading
        application = new JLabel("APPLICATION FORM NO. "+formno);
        application.setFont(new Font("Raleway", Font.BOLD, 38));
        application.setBounds(140,20,600,40);
        add(application);
        
        
        
        page = new JLabel("Page 1: Personal Details");
        page.setFont(new Font("Raleway", Font.BOLD, 22));
        page.setBounds(290,80,600,30);
        add(page);
        
        
        // Adding all the labels and text Fields
        
        name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100,140,100,30);
        add(name);
        
        nameField = new JTextField();
        nameField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameField.setBounds(300,140,400,30);
        add(nameField);
        
        
        
        fatherName = new JLabel("Father's Name:");
        fatherName.setFont(new Font("Raleway", Font.BOLD, 20));
        fatherName.setBounds(100,190,200,30);
        add(fatherName);
        
        
        fatherNameField = new JTextField();
        fatherNameField.setFont(new Font("Raleway", Font.BOLD, 14));
        fatherNameField.setBounds(300,190,400,30);
        add(fatherNameField);
        
        dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        
        dateChooser = new JDateChooser();
	//dateChooser.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
	dateChooser.setForeground(new Color(105, 105, 105));
	dateChooser.setBounds(300, 240, 400, 30);
	add(dateChooser);
        
        
        
        
        gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        
        
        male = new JRadioButton("Male");
        male.setFont(new Font("Raleway", Font.BOLD, 14));
        male.setBackground(Color.WHITE);
        male.setBounds(300,290,90,30);
        add(male);
        
        
        
        female = new JRadioButton("Female");
        female.setFont(new Font("Raleway", Font.BOLD, 14));
        female.setBackground(Color.WHITE);
        female.setBounds(450,290,90,30);
        add(female);
        
        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(male);
        groupgender.add(female);
        
        email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100,340,200,30);
        add(email);
        
        emailField = new JTextField();
        emailField.setFont(new Font("Raleway", Font.BOLD, 14));
        emailField.setBounds(300,340,400,30);
        add(emailField);
        
        
        
        marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100,390,200,30);
        add(marital);
        
        
        
        married = new JRadioButton("Married");
        married.setFont(new Font("Raleway", Font.BOLD, 14));
        married.setBackground(Color.WHITE);
        married.setBounds(300,390,120,30);
        add(married);
        
        
        
        unmarried = new JRadioButton("Unmarried");
        unmarried.setFont(new Font("Raleway", Font.BOLD, 14));
        unmarried.setBackground(Color.WHITE);
        unmarried.setBounds(450,390,120,30);
        add(unmarried);
        
        other = new JRadioButton("Other");
        other.setFont(new Font("Raleway", Font.BOLD, 14));
        other.setBackground(Color.WHITE);
        other.setBounds(635,390,100,30);
        add(other);
        
        
        
        ButtonGroup groupstatus = new ButtonGroup();
        groupstatus.add(married);
        groupstatus.add(unmarried);
        groupstatus.add(other);
        
        address = new JLabel("Address:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100,440,200,30);
        add(address);
        
        
        addressField = new JTextField();
        addressField.setFont(new Font("Raleway", Font.BOLD, 14));
        addressField.setBounds(300,440,400,30);
        add(addressField);
        
        
        
        city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100,490,200,30);
        add(city);
        
        
        
        cityField = new JTextField();
        cityField.setFont(new Font("Raleway", Font.BOLD, 14));
        cityField.setBounds(300,490,400,30);
        add(cityField);
        
        
        State = new JLabel("State:");
        State.setFont(new Font("Raleway", Font.BOLD, 20));
        State.setBounds(100,540,200,30);
        add(State);
        
        
        stateField = new JTextField();
        stateField.setFont(new Font("Raleway", Font.BOLD, 14));
        stateField.setBounds(300,540,400,30);
        add(stateField);
        
        
        
        pincode = new JLabel("Pin Code:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        
        pincodeField = new JTextField();
        pincodeField.setFont(new Font("Raleway", Font.BOLD, 14));
        pincodeField.setBounds(300,590,400,30);
        add(pincodeField);
        
        // Adding next button
        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(620,660,80,30);
        next.addActionListener(this); // Adding action
        add(next);
        
        
        // Setting Frame
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(500,120);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        String formno_ = "" + formno;
        String name = nameField.getText();
        String fatherName = fatherNameField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){ 
            gender = "Male";
        }else if(female.isSelected()){ 
            gender = "Female";
        }
            
        String email = emailField.getText();
        
        String marital = null;
        if(married.isSelected()){ 
            marital = "Married";
        }else if(unmarried.isSelected()){ 
            marital = "Unmarried";
        }else if(other.isSelected()){ 
            marital = "Other";
        }
           
        String address = addressField.getText();
        String city = cityField.getText();
        String state = stateField.getText();
        String pincode = pincodeField.getText();
        
        
        if(ae.getSource()==next){
            try{

                if(nameField.getText().equals("") || 
                        fatherNameField.getText().equals("") || emailField.getText().equals("") || 
                        addressField.getText().equals("") || cityField.getText().equals("") || 
                        stateField.getText().equals("") || pincodeField.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Fill all the required fields");
                }else{
                    Conn c = new Conn();
                    String query = "insert into signup values('"+formno_+"','"+name+"','"+fatherName+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pincode+"')";
                    c.s.executeUpdate(query);
                    setVisible(false);
                    dispose();
                    new SignupTwo(formno).setVisible(true);

                }

            }catch(Exception e){
                System.out.println(e);
            }
        }
        
    }
    
    public static void main(String args[]) {
        new SignupOne();
    }
}
