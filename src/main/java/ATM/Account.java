/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATM;

import java.util.*;
import java.text.DecimalFormat;

public class Account {
    private int cusNum;
    private int pinNum;
    private double checkingBalance=0;
    private double savingBalance=0;
    Scanner input=new Scanner(System.in);
    DecimalFormat moneyFormat=new DecimalFormat("'₹ '########0.00");
    
    /*Method for setting Customer number*/
    public int setCusNumber(int cusNumber){
        this.cusNum=cusNumber;
        return cusNum;
    }
    
    /*Method for geting Customer number*/
    public int getCusNumber(){
        return cusNum;
    }
    
    /*Method for setting pin number*/
    public int setPinNumber(int pinNumber){
        this.pinNum=pinNumber;
        return pinNum;
    }
    
    /*Method for getting pin number*/
    public int getPinNumber(){
        return pinNum;
    }
    
    /*Method for getting  Checking Account Balance*/
    public double getCheckingBalance(){
        return checkingBalance;
    }
    
    /*Method for getting  Saving Account Balance*/
    public double getSavingBalance(){
        return savingBalance;
    }
    /*Calculating and  updating Checking Acccount balance after Withdrawal*/
    public double calCheckingWithdraw(double amount){
        checkingBalance=(checkingBalance-amount);
        return checkingBalance;
    }
    
    /*Calculating and updating Saving Acccount balance after Withdrawal*/
    public double calSavingWithdraw(double amount){
        savingBalance=(savingBalance-amount);
        return savingBalance;
    }
    
    /*Calculating and Updating  Checking Acccount balance after Deposit*/
    public double calCheckingDeposit(double amount){
        checkingBalance=(checkingBalance+amount);
        return checkingBalance;
    }
    
    /*Calculating and Updating Saving Acccount balance after Deposit*/
    public double calSavingDeposit(double amount){
        savingBalance=(savingBalance+amount);
        return savingBalance;
    }
    
    /*Customer Cheking Account Withdraw input*/
    public void getCheckingWithdrawInput() {
        System.out.println("Checking Account Balance:"+ moneyFormat.format(checkingBalance));
        System.out.print("Amount you want to withdraw From Checking Account: ");
        double amount=input.nextDouble();
        
        if((checkingBalance-amount)>=0){
            calCheckingWithdraw(amount);
            System.out.println("New checking Accont Balance is: "+moneyFormat.format(checkingBalance));
        }
        else{
            System.out.println("\n"+"Blance cannot be negative."+"\n");
        }
    }
    /*Customer Saving Account Withdraw input*/
    public void getSavingWithdrawInput() {
        System.out.println("Checking Account Balance:"+ moneyFormat.format(savingBalance));
        System.out.print("Amount you want to withdraw From Saving Account: ");
        double amount=input.nextDouble();
        
        if((savingBalance-amount)>=0){
            calCheckingWithdraw(amount);
            System.out.println("New Saving Accont Balance is: "+moneyFormat.format(savingBalance));
        }
        else{
            System.out.println("\n"+"Blance cannot be negative."+"\n");
        }
    }
    
    
    /*Customer Cheking Account Diposit input*/
    public void getCheckingDepositInput() {
        System.out.println("Checking Account Balance:"+ moneyFormat.format(checkingBalance)+"\n"+" Enter the amount you want to deposit to Checking Account:");
        double amount=input.nextDouble();
        if((checkingBalance+amount)>=0){
            calCheckingDeposit(amount);
            System.out.println("New checking Account Balance is: "+moneyFormat.format(checkingBalance));
        }
        else{
            System.out.println("\n"+"Blance cannot be negative."+"\n");
        }
    }
    
    /*Customer Saving Account Diposit input fuction*/
    public void getSavingDepositInput() {
        System.out.println("Saving Account Balance:"+ moneyFormat.format(savingBalance)+"\n"+"Enter the amount you want to deposit to saving account:");
        double amount=input.nextDouble();
        
        if((savingBalance+amount)>=0){
            calSavingDeposit(amount);
            System.out.println("New Saving Accont Balance is: "+moneyFormat.format(savingBalance));
        }
        else{
            System.out.println("\n"+"Blance cannot be negative."+"\n");
        }
    }
    
    
    
        
}
