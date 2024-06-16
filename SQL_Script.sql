CREATE DATABASE IF NOT EXISTS bankmanagementsystem;

USE bankmanagementsystem;

create table login(formno varchar(20), cardNo varchar(25), pinNo varchar(10));

create table signup
	(formno varchar(20), name varchar(20), fatherName varchar(20), 
    dob varchar(20), gender varchar(20),email varchar(30), 
    marital varchar(20), address varchar(40), city varchar(25), 
    state varchar(25), pincode varchar(20));
    
create table signup2(formno varchar(20), religion varchar(20), 
	category varchar(20), income varchar(20), education varchar(20), 
	occupation varchar(20), panNumber varchar(20), aadharNumber varchar(20), 
    seniorCitizen varchar(20), existingAccount varchar(20));

create table signup3(formno varchar(20), accountType varchar(40), 
	cardNo varchar(25), pinNo varchar(10), servicesRequired varchar(100)); 
    
create table bank(pinNo varchar(10), date varchar(50), 
	transactionType varchar(20), amount varchar(20));
    
